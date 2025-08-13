package com.java.api.payment.application.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.api.payment.domain.model.Debt;
import com.java.api.payment.domain.ports.DebtRepositoryPort;

@Service
public class ListDebtsUseCase {
    private final DebtRepositoryPort debtRepository;

    public ListDebtsUseCase(DebtRepositoryPort debtRepository) {
        this.debtRepository = debtRepository;
    }

    public List<Debt> execute() {
        return debtRepository.list();
    }
}
