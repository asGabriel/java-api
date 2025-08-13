package com.java.api.payment.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Debt {
    private UUID id;
    private String description;
    private BigDecimal totalValue;
    private BigDecimal paidValue;
    private LocalDateTime dueDate;
}
