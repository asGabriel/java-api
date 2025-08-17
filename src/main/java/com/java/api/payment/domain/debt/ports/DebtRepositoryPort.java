package com.java.api.payment.domain.debt.ports;

import java.util.List;

import com.java.api.payment.domain.debt.Debt;

public interface DebtRepositoryPort {
    List<Debt> list();
}
