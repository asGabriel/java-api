package com.java.api.finance_management.infrastructure.debt.out.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.domain.debt.ports.DebtRepositoryPort;
import com.java.api.finance_management.infrastructure.debt.mapper.DebtMapper;

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

    @Override
    public Debt create(Debt debt) {
        return DebtMapper.toDomain(repo.save(DebtMapper.toEntity(debt)));
    }
}
