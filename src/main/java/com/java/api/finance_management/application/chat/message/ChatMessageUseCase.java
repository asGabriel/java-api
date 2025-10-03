package com.java.api.finance_management.application.chat.message;

import org.springframework.stereotype.Service;

import com.java.api.finance_management.domain.chat.ports.ChatSenderPort;

@Service
public class ChatMessageUseCase {
    private final ChatSenderPort chatSenderPort;

    public ChatMessageUseCase(ChatSenderPort chatSenderPort) {
        this.chatSenderPort = chatSenderPort;
    }
    
    public void execute(String chatId, String message) {
        chatSenderPort.sendMessage(chatId, message);
    }
}
