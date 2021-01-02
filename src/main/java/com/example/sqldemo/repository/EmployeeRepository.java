package com.example.sqldemo.repository;

import com.example.sqldemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);

    Employee getById(int id);
}
