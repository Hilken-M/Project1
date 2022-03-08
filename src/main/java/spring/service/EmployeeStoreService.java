package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.EmployeeStore;
import spring.repository.EmployeeStoreRepository;

import java.util.List;

@Component
public class EmployeeStoreService {
    EmployeeStoreRepository employeeStoreRepository;

    @Autowired
    public EmployeeStoreService(EmployeeStoreRepository employeeStoreRepository){
        this.employeeStoreRepository = employeeStoreRepository;
    }

    public List<EmployeeStore> findAllInventory(){
        return employeeStoreRepository.findAll();
    }

//    public Product findByProductName(String name) {
//        return employeeStoreRepository.findByProductName(name);
//    }
}
