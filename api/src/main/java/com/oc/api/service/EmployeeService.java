package com.oc.api.service;

import java.util.Optional;

import com.oc.api.model.Employee;
import com.oc.api.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public Optional<Employee> getEmployee(final Long id) {
    return employeeRepository.findById(id);
  }

  public Iterable<Employee> getEmployees() {
    Iterable<Employee> employees = employeeRepository.findAll();
    return employees;
  }

  public void deleteEmployee(final Long id) {
    employeeRepository.deleteById(id);
  }

  public Employee saveEmployee(Employee employee) {
    Employee savedEmployee = employeeRepository.save(employee);
    return savedEmployee;
  }

}
