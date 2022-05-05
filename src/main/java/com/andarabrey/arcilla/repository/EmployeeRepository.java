package com.andarabrey.arcilla.repository;

import com.andarabrey.arcilla.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
