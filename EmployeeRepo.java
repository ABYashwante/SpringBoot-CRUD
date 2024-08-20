package com.dbconnect.employee.Repository;

import com.dbconnect.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
