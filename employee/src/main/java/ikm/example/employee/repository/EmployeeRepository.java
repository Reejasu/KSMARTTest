package ikm.example.employee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ikm.example.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee ,UUID> {
    
}
