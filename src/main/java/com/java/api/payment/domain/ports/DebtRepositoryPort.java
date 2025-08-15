package com.java.api.payment.domain.ports;

import com.java.api.payment.domain.model.Debt;

import java.util.List;

public interface DebtRepositoryPort {
    List<Debt> list();
}
