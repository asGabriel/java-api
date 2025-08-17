package com.java.api.finance_management.infrastructure.debt.mapper;

import java.time.LocalDateTime;

import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.infrastructure.debt.in.dto.CreateDebtRequest;
import com.java.api.finance_management.infrastructure.debt.out.entity.DebtEntity;

public class DebtMapper {

    public static Debt toDomain(DebtEntity entity) {
        return new Debt(entity.getId(), entity.getDescription(), entity.getTotalValue(), entity.getPaidValue(),
                entity.getDiscountValue(), entity.getInterestValue(), entity.getFineValue(), entity.getDueDate(),
                entity.getStatus(), entity.getCreatedAt(), entity.getUpdatedAt(), entity.getDeletedAt());
    }

    public static DebtEntity toEntity(Debt domain) {
        return new DebtEntity(domain.getId(), domain.getDescription(), domain.getTotalValue(), domain.getPaidValue(),
                domain.getDiscountValue(), domain.getInterestValue(), domain.getFineValue(), domain.getDueDate(),
                domain.getCreatedAt(), domain.getUpdatedAt(), domain.getDeletedAt(), domain.getStatus());
    }

    public static CreateDebtRequest domainFromRequest(Debt domain) {
        return new CreateDebtRequest(domain.getDescription(), domain.getTotalValue(), domain.getPaidValue(),
                domain.getDiscountValue(), domain.getInterestValue(), domain.getFineValue(), domain.getDueDate(),
                domain.getStatus());
    }

    public static Debt domainFromRequest(CreateDebtRequest request) {
        return new Debt(
                null,
                request.description(),
                request.totalValue(),
                request.paidValue(),
                request.discountValue(),
                request.interestValue(),
                request.fineValue(),
                request.dueDate(),
                request.status(),
                LocalDateTime.now(),
                LocalDateTime.now(),
                null);
    }
}
