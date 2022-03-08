package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.model.Store;
import spring.repository.StoreRepository;

import java.util.List;

public class StoreService {
    StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreService storeService){
        this.storeRepository = storeRepository;
    }

    public List<Store> findAllStore(){
        return storeRepository.findAllStore();
    }

    public Store findByStoreName(String name) {
        return storeRepository.findByStoreName(name);
    }
}
