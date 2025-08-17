package com.java.api.finance_management.application.debt;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.domain.debt.ports.DebtRepositoryPort;
import com.java.api.finance_management.infrastructure.debt.in.dto.CreateDebtRequest;
import com.java.api.finance_management.infrastructure.debt.mapper.DebtMapper;

@Service
public class CreateDebtHandler {
    private final DebtRepositoryPort debtRepository;

    public CreateDebtHandler(DebtRepositoryPort debtRepository) {
        this.debtRepository = debtRepository;
    }

    @Transactional
    public Debt execute(CreateDebtRequest payload) {
        Debt debt = DebtMapper.domainFromRequest(payload);
        return debtRepository.create(debt);
    }
}
