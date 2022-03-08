package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Employee;
import spring.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService employeeService;

    @Autowired
    public void EmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAllInventory(){
        return employeeService.findAllEmployees();
    }
}
