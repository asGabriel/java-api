package com.java.api.payment.infrastructure.adapters.out.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.api.payment.infrastructure.adapters.out.entity.DebtEntity;

public interface SpringDataDebtRepository extends JpaRepository<DebtEntity, UUID> {

}
