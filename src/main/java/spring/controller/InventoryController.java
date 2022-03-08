package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Inventory;
import spring.service.InventoryService;

import java.util.List;

@RestController
public class InventoryController {
    InventoryService inventoryService;

    @Autowired
    public void InventoryService(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public List<Inventory> findAllInventory(){
        return inventoryService.findAllInventory();
    }

//    @GetMapping({"{name}"})
//    public Product findByProductName(@PathVariable String name){
//        return (Product) inventoryService.findByProductName(name);
//    }
}
