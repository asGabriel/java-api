package com.java.api.finance_management.domain.chat.ports;

public interface ChatSenderPort {
    void sendMessage(String chatId, String message);
}
