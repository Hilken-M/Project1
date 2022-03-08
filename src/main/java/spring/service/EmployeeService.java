package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Employee;
import spring.repository.EmployeeRepository;

import java.util.List;

@Component
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository InventoryRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
}
