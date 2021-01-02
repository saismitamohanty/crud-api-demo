package com.example.sqldemo;

import com.example.sqldemo.entity.Employee;
import com.example.sqldemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.Date;

    @SpringBootApplication
    public class SqlDemoApplication {
	@Autowired
	EmployeeRepository employeeRepository ;

	public static void main(String[] args)
	{
		SpringApplication.run(SqlDemoApplication.class, args);
	}

}
