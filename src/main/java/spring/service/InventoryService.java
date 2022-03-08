package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Inventory;
import spring.repository.InventoryRepository;

import java.util.List;

@Component
public class InventoryService {
    InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> findAllInventory(){
        return inventoryRepository.findAll();
    }

//    public Product findByProductName(String name) {
//        return productRepository.findByProductName(name);
//    }
}
