package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository {

    Employee save(Employee employee);

    @Query("from Employee") List<Employee> findAllEmployees();

    @Query("from Employee where employeeId = :employeeId")
    Employee findByEmployeeId(int employeeId);
}
