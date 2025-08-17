package com.java.api.finance_management.infrastructure.debt.in.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.java.api.finance_management.domain.debt.DebtStatus;

public record CreateDebtRequest(
    @NotBlank(message = "Description is required") 
    String description,

    @NotNull(message = "Total value is required") 
    @Positive(message = "Total value must be greater than 0") 
    BigDecimal totalValue,

    @Positive(message = "Paid value must be greater than 0") 
    BigDecimal paidValue,

    @Positive(message = "Discount value must be greater than 0") 
    BigDecimal discountValue,

    @Positive(message = "Interest value must be greater than 0") 
    BigDecimal interestValue,

    @Positive(message = "Fine value must be greater than 0") 
    BigDecimal fineValue,

    @NotNull(message = "Due date is required") 
    @Future(message = "Due date must be in the future") 
    LocalDate dueDate,

    DebtStatus status
) {}
