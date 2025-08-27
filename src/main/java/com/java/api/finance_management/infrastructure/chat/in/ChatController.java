package com.java.api.finance_management.infrastructure.chat.in;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.finance_management.application.chat.command.ChatCommand;
import com.java.api.finance_management.application.chat.command.CommandHandler;
import com.java.api.finance_management.application.chat.message.ChatMessageUseCase;
import com.java.api.finance_management.infrastructure.chat.in.dto.TelegramUpdate;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    private final List<CommandHandler> commandHandlers;
    private final ChatMessageUseCase chatMessageUseCase;

    public ChatController(List<CommandHandler> commandHandlers, ChatMessageUseCase chatMessageUseCase) {
        this.commandHandlers = commandHandlers;
        this.chatMessageUseCase = chatMessageUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> webhook(@RequestBody TelegramUpdate body) {
        String messageText = body.getMessage().getText();
        String chatId = body.getMessage().getChat().getId().toString();

        ChatCommand command = ChatCommand.fromString(messageText);

        CommandHandler handler = commandHandlers.stream()
                .filter(h -> h.supports(command))
                .findFirst()
                .orElse(null);

        String responseMessage;
        if (handler != null) {
            responseMessage = handler.handle(command, chatId);
        } else {
            responseMessage = "❓ Comando não reconhecido. \n\nUse /listar para ver suas despesas\n\nUse /despesa para criar uma nova.";
        }

        chatMessageUseCase.execute(chatId, responseMessage);

        return ResponseEntity.ok().build();
    }
}
