package com.java.api.finance_management.domain.debt.ports;

import java.util.List;

import com.java.api.finance_management.domain.debt.Debt;

public interface DebtRepositoryPort {
    List<Debt> list();
    Debt create(Debt debt);
}
