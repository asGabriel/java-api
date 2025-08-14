package com.java.api.payment.infrastructure.adapters.out.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.java.api.payment.domain.model.Debt;
import com.java.api.payment.domain.model.DebtStatus;
import com.java.api.payment.domain.ports.DebtRepositoryPort;
import com.java.api.payment.infrastructure.adapters.out.entity.DebtEntity;

@Repository
public class DebtRepositoryAdapter implements DebtRepositoryPort {

    private final SpringDataDebtRepository repo;

    public DebtRepositoryAdapter(SpringDataDebtRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Debt> list() {
        return repo.findAll().stream().map(this::toDomain).collect(Collectors.toList());
    }

    private Debt toDomain(DebtEntity entity) {
        return new Debt(entity.getId(), entity.getDescription(), entity.getTotalValue(), entity.getPaidValue(),
                entity.getDiscountValue(), entity.getInterestValue(), entity.getFineValue(), entity.getDueDate(),
                mapStatus(entity.getStatus()), entity.getCreatedAt(), entity.getUpdatedAt(), entity.getDeletedAt());
    }

    private DebtStatus mapStatus(DebtStatus entityStatus) {
        return DebtStatus.valueOf(entityStatus.name());
    }
}
