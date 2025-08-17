package com.java.api.finance_management.domain.debt;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Debt {

    private UUID id;
    private String description;
    private BigDecimal totalValue;
    private BigDecimal paidValue;
    private BigDecimal discountValue = BigDecimal.ZERO;
    private BigDecimal interestValue = BigDecimal.ZERO;
    private BigDecimal fineValue = BigDecimal.ZERO;
    private LocalDate dueDate;
    private DebtStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public Debt(UUID id,
                String description,
                BigDecimal totalValue,
                BigDecimal paidValue,
                BigDecimal discountValue,
                BigDecimal interestValue,
                BigDecimal fineValue,
                LocalDate dueDate,
                DebtStatus status,
                LocalDateTime createdAt,
                LocalDateTime updatedAt,
                LocalDateTime deletedAt) {

        this.id = id;
        this.description = description;
        this.totalValue = totalValue;
        this.paidValue = paidValue;
        this.discountValue = discountValue != null ? discountValue : BigDecimal.ZERO;
        this.interestValue = interestValue != null ? interestValue : BigDecimal.ZERO;
        this.fineValue = fineValue != null ? fineValue : BigDecimal.ZERO;
        this.dueDate = dueDate;
        this.status = status != null ? status : DebtStatus.UNPAID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    // Getters e Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getTotalValue() { return totalValue; }
    public void setTotalValue(BigDecimal totalValue) { this.totalValue = totalValue; }

    public BigDecimal getPaidValue() { return paidValue; }
    public void setPaidValue(BigDecimal paidValue) { this.paidValue = paidValue; }

    public BigDecimal getDiscountValue() { return discountValue; }
    public void setDiscountValue(BigDecimal discountValue) {
        this.discountValue = discountValue != null ? discountValue : BigDecimal.ZERO;
    }

    public BigDecimal getInterestValue() { return interestValue; }
    public void setInterestValue(BigDecimal interestValue) {
        this.interestValue = interestValue != null ? interestValue : BigDecimal.ZERO;
    }

    public BigDecimal getFineValue() { return fineValue; }
    public void setFineValue(BigDecimal fineValue) {
        this.fineValue = fineValue != null ? fineValue : BigDecimal.ZERO;
    }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public DebtStatus getStatus() { return status; }
    public void setStatus(DebtStatus status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public LocalDateTime getDeletedAt() { return deletedAt; }
    public void setDeletedAt(LocalDateTime deletedAt) { this.deletedAt = deletedAt; }
}
