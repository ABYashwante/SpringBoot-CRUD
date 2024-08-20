package com.dbconnect.employee.Service;

import com.dbconnect.employee.EmployeeApplication;
import com.dbconnect.employee.Entity.Employee;
import com.dbconnect.employee.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    // POST   function for saving the data in DB
    public Employee saveDetails(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    // POST function for saving the list of JSON
    public List<Employee> postAllDetails(List<Employee> employee )
    {
        return employeeRepo.saveAll(employee);
    }

    //GET
    public List<Employee> getAllDetails()
    {
        return employeeRepo.findAll();
    }

//    GET
    public Employee getEmployeeDetailsById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }

//    UPDATE
    public Employee updateDetails(Employee employee)
    {
        Employee updateEmployee = employeeRepo.findById(employee.getId()).orElse(null);
        if(updateEmployee != null)
        {
            updateEmployee.setName(employee.getName());
            updateEmployee.setCity(employee.getCity());
            updateEmployee.setRole(employee.getRole());
            employeeRepo.save(updateEmployee);
            return updateEmployee;
        }
        else return null;
    }

//    DELETE
    public String deleteEmployee(int id)
    {
        if (employeeRepo.existsById(id))
        {
            employeeRepo.deleteById(id);
            return "Deleted id " + id;
        }
        else return "Invalid id "+ id;
    }




}
