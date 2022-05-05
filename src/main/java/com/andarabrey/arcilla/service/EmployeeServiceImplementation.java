package com.andarabrey.arcilla.service;

import com.andarabrey.arcilla.entity.Employee;
import com.andarabrey.arcilla.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;
        if (result.isPresent()){
            employee = result.get();
        }
        else {
            throw new RuntimeException("Employee id not found " + id);
        }

        return employee;
    }

    @Override
    public void save(Employee employee) {
       employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
