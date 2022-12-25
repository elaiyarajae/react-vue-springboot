package com.app.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.server.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
