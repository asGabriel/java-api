package com.java.api.payment.infrastructure.debt.out.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.api.payment.infrastructure.debt.out.entity.DebtEntity;

public interface SpringDataDebtRepository extends JpaRepository<DebtEntity, UUID> {

}
