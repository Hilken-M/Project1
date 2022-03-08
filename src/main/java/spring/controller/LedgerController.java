package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.model.Ledger;
import spring.service.LedgerService;

import java.util.List;

public class LedgerController {

    LedgerService ledgerService;

    @Autowired
    public LedgerController(LedgerService ledgerService) {
        this.ledgerService = ledgerService;
    }

    @GetMapping
    public List<Ledger> findAlltransactions() {
        return ledgerService.findAllTransactions();
    }

    @GetMapping({"{transactionId}"})
    public Ledger findByProductName(@PathVariable double transactionId) {
        return (Ledger) ledgerService.findByTransactionId(transactionId);
    }
}
