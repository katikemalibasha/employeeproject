package com.info.app.service;

import com.info.app.dao.EmployeeRepository;
import com.info.app.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  public String saveEmployee(Employee emp) {
    employeeRepository.save(emp);
    return "employee information saved successfully";
  }

  public List<Employee> getAllEmployees() {

    return employeeRepository.findAll();
  }
}
