package ikm.example.employee.service;

import org.springframework.stereotype.Service;

import ikm.example.employee.model.Employee;
import ikm.example.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository emprepo;

    public void saveEmployee(Employee emp){
        emprepo.save(emp);


    }
    
}
