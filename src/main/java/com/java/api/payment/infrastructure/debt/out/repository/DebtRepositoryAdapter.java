package com.java.api.payment.infrastructure.debt.out.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.java.api.payment.domain.debt.Debt;
import com.java.api.payment.domain.debt.ports.DebtRepositoryPort;
import com.java.api.payment.infrastructure.debt.out.mapper.DebtMapper;

@Repository
public class DebtRepositoryAdapter implements DebtRepositoryPort {

    private final SpringDataDebtRepository repo;

    public DebtRepositoryAdapter(SpringDataDebtRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Debt> list() {
        return repo.findAll().stream().map(DebtMapper::toDomain).collect(Collectors.toList());
    }
}
