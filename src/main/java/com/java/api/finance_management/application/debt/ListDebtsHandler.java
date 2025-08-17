package com.java.api.finance_management.application.debt;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.domain.debt.ports.DebtRepositoryPort;

@Service
public class ListDebtsHandler {
    private final DebtRepositoryPort debtRepository;

    public ListDebtsHandler(DebtRepositoryPort debtRepository) {
        this.debtRepository = debtRepository;
    }

    @Transactional(readOnly = true)
    public List<Debt> execute() {
        return debtRepository.list();
    }
}
