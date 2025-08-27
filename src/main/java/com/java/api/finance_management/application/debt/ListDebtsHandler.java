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
    public String handle(ChatCommand command, String chatId) {
        List<Debt> debts = execute();
        
        if (debts.isEmpty()) {
            return "📋 Você não possui débitos cadastrados.";
        }
        
        StringBuilder message = new StringBuilder("💰 **Suas Despesas:**\n\n");
        
        for (int i = 0; i < debts.size(); i++) {
            Debt debt = debts.get(i);
            message.append(String.format("%d. %s - R$ %.2f\n", 
                i + 1, 
                debt.getDescription(), 
                debt.getTotalValue()));
        }
        
        message.append(String.format("\n💳 Total: R$ %.2f", 
            debts.stream().mapToDouble(debt -> debt.getTotalValue().doubleValue()).sum()));
        
        return message.toString();
    }
}
