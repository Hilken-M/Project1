package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.model.EmployeeStore;
import spring.service.EmployeeStoreService;

import java.util.List;

@RestController
public class EmployeeStoreController {
    EmployeeStoreService employeeStoreService;

    @Autowired
    public void EmployeeStoreService(EmployeeStoreService employeeStoreService){
        this.employeeStoreService = employeeStoreService;
    }

    @GetMapping
    public List<EmployeeStore> findAllInventory(){
        return employeeStoreService.findAllInventory();
    }
}
