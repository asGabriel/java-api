package com.java.api.payment.infrastructure.debt.in;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.payment.application.debt.ListDebtsHandler;
import com.java.api.payment.domain.debt.Debt;

@RestController
@RequestMapping("/debts")
public class DebtController {
    private final ListDebtsHandler listDebtsUseCase;

    public DebtController(ListDebtsHandler listDebtsUseCase) {
        this.listDebtsUseCase = listDebtsUseCase;
    }

    @GetMapping
    public List<Debt> list() {
        return listDebtsUseCase.execute();
    }
}
