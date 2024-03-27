package com.spring.MangoDb.Controller;

import com.spring.MangoDb.Model.EmpEntity;
import com.spring.MangoDb.Repository.EmpRepository;
import com.spring.MangoDb.Services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    private EmpServices employeeService;
    private EmpEntity employee;
    private EmpRepository empRepository;

    @GetMapping("/getemp")
    public List<EmpEntity> getAllEmployees() {

        return employeeService.getallEmp();
    }

    @GetMapping("/getemp/{id}")
    public Optional<EmpEntity> getEmp(@PathVariable int id){
        return employeeService.getempByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteemp(id);
        return "Record is deleted";
    }

    @PostMapping("/addemp")
    public String addemp(@RequestBody EmpEntity employee){
        employeeService.createEmployee(employee);
        return "Employee Inserted";
    }
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmpEntity updatedEmployee) {
        EmpEntity updated = employeeService.updateEmployee(id, updatedEmployee);
        return "Updated Suuccessfully";
    }

}
