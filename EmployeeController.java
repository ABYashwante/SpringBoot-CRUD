package com.dbconnect.employee.Controller;

import com.dbconnect.employee.Entity.Employee;
import com.dbconnect.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee postDetails(@RequestBody Employee employee)
    {
        return employeeService.saveDetails(employee);
    }

    @PostMapping("/PostEmployee")
    public List<Employee> postDetails(@RequestBody List<Employee> employee)
    {
        return employeeService.postAllDetails(employee);
    }

    @GetMapping("/getEmployee")
    public List<Employee> getDetails()
    {
        return employeeService.getAllDetails();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee fetchDetailsByid(@PathVariable int id)
    {
        return employeeService.getEmployeeDetailsById(id);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployeeDetails(@RequestBody Employee employee)
    {
        return employeeService.updateDetails(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeDetails(@PathVariable int id)
    {
        return employeeService.deleteEmployee(id);
    }


}
