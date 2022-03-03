package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    /*
    Not HQL - this is a subset of HQL:JPQL
    Java Persistence Query Language
        All JPQL statements are valid HQL statements,
        Not all HQL statements are valid JPQL statements.
     */


    Product save(Product product);

    @Query("from Product")
    List<Product> findAll();

    @Query("from Product where name = :name")
    Product findByName(String name);


}
