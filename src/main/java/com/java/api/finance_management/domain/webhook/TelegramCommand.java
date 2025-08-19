package com.java.api.finance_management.domain.webhook;

public enum TelegramCommand {
    DESPESA("despesa"),
    BAIXA("baixa"),
    LISTAR("listar"),
    UNKNOWN("unknown");

    private final String command;

    TelegramCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public static TelegramCommand fromString(String commandText) {
        if (commandText == null || commandText.trim().isEmpty()) {
            return UNKNOWN;
        }

        String text = commandText.trim();
        
        if (!text.startsWith("/")) {
            return UNKNOWN;
        }

        String withoutSlash = text.substring(1);
        String command = withoutSlash.split("\\s+")[0].toLowerCase();

        for (TelegramCommand type : TelegramCommand.values()) {
            if (type.command.equals(command)) {
                return type;
            }
        }

        return UNKNOWN;
    }
}
