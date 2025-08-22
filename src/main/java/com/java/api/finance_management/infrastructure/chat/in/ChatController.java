package com.java.api.finance_management.infrastructure.chat.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.finance_management.application.chat.command.ChatCommand;
import com.java.api.finance_management.infrastructure.chat.in.dto.TelegramUpdate;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    @PostMapping
    public ResponseEntity<Void> webhook(@RequestBody TelegramUpdate body) {
        ChatCommand command = ChatCommand.fromString(body.getMessage().getText());

        switch (command) {
            case CREATE_DEBT:
                System.out.println("Despesa");
                break;
            case LIST_DEBTS:
                System.out.println("Baixa");
                break;
            default:
                System.out.println("Comando desconhecido");
                break;
        }
        
        return ResponseEntity.ok().build();
    }
}
