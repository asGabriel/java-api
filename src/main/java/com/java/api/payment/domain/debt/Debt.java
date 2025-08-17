package com.java.api.payment.domain.debt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Debt {
    private UUID id;
    private String description;
    private BigDecimal totalValue;
    private BigDecimal paidValue;
    private BigDecimal discountValue;
    private BigDecimal interestValue;
    private BigDecimal fineValue;
    private LocalDate dueDate;
    private DebtStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
