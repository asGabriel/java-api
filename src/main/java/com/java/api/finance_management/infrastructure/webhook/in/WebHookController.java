package com.java.api.finance_management.infrastructure.webhook.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.finance_management.domain.webhook.TelegramUpdate;

@RestController
@RequestMapping("/webhook")
public class WebHookController {

    @PostMapping
    public ResponseEntity<Void> webhook(@RequestBody TelegramUpdate body) {
        System.out.println(body.getMessage().getText());

        return ResponseEntity.ok().build();
    }
}
