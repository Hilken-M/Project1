package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.EmployeeStore;

import java.util.List;

public interface EmployeeStoreRepository extends JpaRepository{
    EmployeeStore save(EmployeeStore employeeStore);

    @Query("from EmployeeStore")
    List<EmployeeStore> findAllProduct();

    @Query("from EmployeeStore where quatity = :quantity")
    EmployeeStore findByInventoryId(String name);
}
