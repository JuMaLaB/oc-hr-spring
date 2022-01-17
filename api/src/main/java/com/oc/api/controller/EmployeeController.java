package com.oc.api.controller;

import com.oc.api.model.Employee;
import com.oc.api.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  /**
   * Read - Get all employees
   * 
   * @return - An Iterable object of Employee full filled
   */
  @GetMapping("/employees")
  public Iterable<Employee> getEmployees() {
    Iterable<Employee> employees = employeeService.getEmployees();
    return employees;
  }

}
