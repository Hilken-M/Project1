package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Store;
import spring.service.StoreService;

import java.util.List;

@RestController
public class StoreController {
    StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public List<Store> findAllStore() {
        return storeService.findAllStore();
    }

    @GetMapping({"{name}"})
    public Store findByProductName(@PathVariable String name) {
        return (Store) storeService.findByStoreName(name);
    }
}
