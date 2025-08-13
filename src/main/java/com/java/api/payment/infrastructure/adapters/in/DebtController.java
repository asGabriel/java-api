package com.java.api.payment.infrastructure.adapters.in;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.payment.application.usecases.ListDebtsUseCase;
import com.java.api.payment.domain.model.Debt;

@RestController
@RequestMapping("/debts")
public class DebtController {
    private final ListDebtsUseCase listDebtsUseCase;

    public DebtController(ListDebtsUseCase listDebtsUseCase) {
        this.listDebtsUseCase = listDebtsUseCase;
    }

    @GetMapping
    public List<Debt> list() {
        return listDebtsUseCase.execute();
    }
}
