package com.java.api.finance_management.application.chat.command;

public enum ChatCommand {
    CREATE_DEBT("despesa"),
    LIST_DEBTS("listar"),
    UNKNOWN("unknown");

    private final String command;

    ChatCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public static ChatCommand fromString(String commandText) {
        if (commandText == null || commandText.trim().isEmpty()) {
            return UNKNOWN;
        }

        String text = commandText.trim();
        
        if (!text.startsWith("/")) {
            return UNKNOWN;
        }

        String withoutSlash = text.substring(1);
        String command = withoutSlash.split("\\s+")[0].toLowerCase();

        for (ChatCommand type : ChatCommand.values()) {
            if (type.command.equals(command)) {
                return type;
            }
        }

        return UNKNOWN;
    }
}
