package com.java.api.finance_management.infrastructure.webhook.in.dto;


// TODO: atualizar o dto para corresponder ao json do telegram
public class TelegramUpdate {
    private TelegramMessage message;

    public TelegramMessage getMessage() {
        return message;
    }

    public static class TelegramMessage {
        private TelegramChat chat;
        private TelegramUser from;
        private String text;

        public TelegramChat getChat() {
            return chat;
        }

        public TelegramUser getFrom() {
            return from;
        }

        public String getText() {
            return text;
        }

    }

    public static class TelegramChat {
        private Long id;

        public Long getId() {
            return id;
        }

    }

    public static class TelegramUser {
        private Long id;
        private String username;

        public Long getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

    }
}
