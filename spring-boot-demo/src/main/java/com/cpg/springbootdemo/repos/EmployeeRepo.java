package com.cpg.springbootdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpg.springbootdemo.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
