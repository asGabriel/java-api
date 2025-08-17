package com.java.api.finance_management.infrastructure.debt.out.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.api.finance_management.infrastructure.debt.out.entity.DebtEntity;

public interface SpringDataDebtRepository extends JpaRepository<DebtEntity, UUID> {

}
