package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.Store;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Integer> {


    Store save(Store store);

    @Query("from Product")
    List<Store> findAllStore();

    @Query("from Product where name = :name")
    Store findByStoreName(String name);
}
