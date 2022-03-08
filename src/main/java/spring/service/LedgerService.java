package spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Ledger;
import spring.repository.LedgerRepository;

import java.util.List;

@Component
public class LedgerService {
    LedgerRepository ledgerRepository;

    @Autowired
    public LedgerService(LedgerRepository ledgerRepository){
        this.ledgerRepository = ledgerRepository;
    }

    public List<Ledger> findAllTransactions(){
        return ledgerRepository.findAllTransactions();
    }

    public Ledger findByTransactionId(double transactionId) {
        return ledgerRepository.findByTransactionId(transactionId);
    }
}
