package com.java.api.payment.domain.webhook;

public class TelegramUpdate {
    private TelegramMessage message;

    public TelegramMessage getMessage() {
        return message;
    }

    public void setMessage(TelegramMessage message) {
        this.message = message;
    }

    public static class TelegramMessage {
        private TelegramChat chat;
        private TelegramUser from;
        private String text;

        public TelegramChat getChat() {
            return chat;
        }

        public void setChat(TelegramChat chat) {
            this.chat = chat;
        }

        public TelegramUser getFrom() {
            return from;
        }

        public void setFrom(TelegramUser from) {
            this.from = from;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class TelegramChat {
        private Long id;
        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

    public static class TelegramUser {
        private Long id;
        private String username;
        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
