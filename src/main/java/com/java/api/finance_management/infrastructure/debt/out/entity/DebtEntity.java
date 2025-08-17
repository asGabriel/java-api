package com.java.api.finance_management.infrastructure.debt.out.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.java.api.finance_management.domain.debt.DebtStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "debt")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DebtEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    private BigDecimal totalValue;
    private BigDecimal paidValue;
    private BigDecimal discountValue;
    private BigDecimal interestValue;
    private BigDecimal fineValue;
    private LocalDate dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    @Enumerated(EnumType.STRING)
    private DebtStatus status;
}
