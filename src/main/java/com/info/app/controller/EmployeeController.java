package com.info.app.controller;

import com.info.app.model.Employee;
import com.info.app.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  @PostMapping("/save")
  @ApiOperation("Enter a new employee record")
   public String save(@RequestBody Employee emp){
       employeeService.saveEmployee(emp);
    return "Employee information stored successfully";
  }

  @GetMapping("/getemployees")
  @ApiOperation("Fetch all employees records")
  public List<Employee> getEmpDetails(){
     return employeeService.getAllEmployees();
  }
}
