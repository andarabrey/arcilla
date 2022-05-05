package com.andarabrey.arcilla.repository;

import com.andarabrey.arcilla.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // add method to sort by first name
    public List<Employee> findAllByOrderByFirstNameAsc();
}
