package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.Inventory;

import java.util.List;

public interface InventoryRepository extends JpaRepository {



    Inventory save(Inventory inventory);

    @Query("from Product")
    List<Inventory> findAllProduct();

    @Query("from Inventory where quantity = :quantity")
    Inventory findByInventoryId(String name);
}
