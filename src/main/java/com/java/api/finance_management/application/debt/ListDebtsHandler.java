package com.java.api.finance_management.application.debt;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.api.finance_management.application.chat.command.ChatCommand;
import com.java.api.finance_management.application.chat.command.CommandHandler;
import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.domain.debt.ports.DebtRepositoryPort;

@Service
public class ListDebtsHandler implements CommandHandler {
    private final DebtRepositoryPort debtRepository;

    public ListDebtsHandler(DebtRepositoryPort debtRepository) {
        this.debtRepository = debtRepository;
    }

    @Transactional(readOnly = true)
    public List<Debt> execute() {
        return debtRepository.list();
    }

    @Override
    public boolean supports(ChatCommand command) {
        return command == ChatCommand.LIST_DEBTS;
    }

    @Override
    public void handle(ChatCommand command) {
        List<Debt> debts = execute();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handle'");
    }
}
