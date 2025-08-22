package com.java.api.finance_management.application.chat.command;

public interface CommandHandler {
    boolean supports(ChatCommand command);
    void handle(ChatCommand command);
}
