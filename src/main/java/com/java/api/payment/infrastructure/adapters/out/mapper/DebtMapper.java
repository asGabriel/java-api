package com.java.api.payment.infrastructure.adapters.out.mapper;

import com.java.api.payment.domain.model.Debt;
import com.java.api.payment.infrastructure.adapters.out.entity.DebtEntity;

public class DebtMapper {

    public static Debt toDomain(DebtEntity entity) {
        return new Debt(entity.getId(), entity.getDescription(), entity.getTotalValue(), entity.getPaidValue(),
                entity.getDiscountValue(), entity.getInterestValue(), entity.getFineValue(), entity.getDueDate(),
                entity.getStatus(), entity.getCreatedAt(), entity.getUpdatedAt(), entity.getDeletedAt());
    }
}
