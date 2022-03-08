package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Product;
import spring.repository.ProductRepository;

import java.util.List;

@Component
public class InventoryService {
    ProductRepository productRepository;

    @Autowired
    public InventoryService(ProductRepository InventoryRepository){
        this.productRepository = InventoryRepository;
    }

    public List<Product> findAllInventory(){
        return productRepository.findAll();
    }

//    public Product findByProductName(String name) {
//        return productRepository.findByProductName(name);
//    }
}
