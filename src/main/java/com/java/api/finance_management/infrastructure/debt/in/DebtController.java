package com.java.api.finance_management.infrastructure.debt.in;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.finance_management.application.debt.CreateDebtHandler;
import com.java.api.finance_management.application.debt.ListDebtsHandler;
import com.java.api.finance_management.domain.debt.Debt;
import com.java.api.finance_management.infrastructure.debt.in.dto.CreateDebtRequest;

@RestController
@RequestMapping("/debt")
public class DebtController {
    private final ListDebtsHandler listDebtsHandler;
    private final CreateDebtHandler createDebtHandler;

    public DebtController(ListDebtsHandler listDebtsHandler, CreateDebtHandler createDebtHandler) {
        this.listDebtsHandler = listDebtsHandler;
        this.createDebtHandler = createDebtHandler;
    }

    @GetMapping
    public List<Debt> list() {
        return listDebtsHandler.execute();
    }

    @PostMapping
    public Debt create(@RequestBody CreateDebtRequest debt) {
        return createDebtHandler.execute(debt);
    }
}
