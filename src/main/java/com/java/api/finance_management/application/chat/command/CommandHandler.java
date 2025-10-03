package com.java.api.finance_management.application.chat.command;

public interface CommandHandler {
    boolean supports(ChatCommand command);
    String handle(ChatCommand command, String chatId);
}
