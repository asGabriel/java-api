package com.java.api.finance_management.infrastructure.chat.out;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.java.api.finance_management.domain.chat.ports.ChatSenderPort;

@Component
public class TelegramGateway implements ChatSenderPort {
    private final WebClient webClient;

    public TelegramGateway(
            WebClient.Builder webClientBuilder,
            @Value("${telegram.token}") String token,
            @Value("${telegram.api.url}") String url) {
        this.webClient = webClientBuilder.baseUrl(url + "/bot" + token).build();
    }

    @Override
    public void sendMessage(String chatId, String message) {
        TelegramMessageRequest request = new TelegramMessageRequest(message, chatId);
        
        webClient.post()
                .uri("/sendMessage")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
    
    private static class TelegramMessageRequest {
        private final String text;
        private final String chat_id;
        
        public TelegramMessageRequest(String text, String chatId) {
            this.text = text;
            this.chat_id = chatId;
        }
        
        @SuppressWarnings("unused")
        public String getText() {
            return text;
        }
        
        @SuppressWarnings("unused")
        public String getChat_id() {
            return chat_id;
        }
    }
}
