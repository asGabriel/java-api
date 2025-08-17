package com.java.api.payment.application.debt;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.api.payment.domain.debt.Debt;
import com.java.api.payment.domain.debt.ports.DebtRepositoryPort;

@Service
public class ListDebtsHandler {
    private final DebtRepositoryPort debtRepository;

    public ListDebtsHandler(DebtRepositoryPort debtRepository) {
        this.debtRepository = debtRepository;
    }

    public List<Debt> execute() {
        return debtRepository.list();
    }
}
