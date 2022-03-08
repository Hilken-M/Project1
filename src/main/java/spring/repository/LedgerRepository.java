package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.Ledger;


import java.util.List;

public interface LedgerRepository extends JpaRepository {

    Ledger save(Ledger ledger);

    @Query("from Product")
    List<Ledger> findAllTransactions();

    @Query("from Product where transactionId = :transactionId")
    Ledger findByTransactionId(double transactionId);
}
