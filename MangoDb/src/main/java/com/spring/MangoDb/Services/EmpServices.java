package com.spring.MangoDb.Services;

import com.spring.MangoDb.Model.EmpEntity;
import com.spring.MangoDb.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// need to call all api of MangoDb

@Service
public class EmpServices {
    private EmpRepository empRepository;

    @Autowired
    public EmpServices(EmpRepository empRepository) {

        this.empRepository = empRepository;
    }

    public EmpEntity createEmployee(EmpEntity employee)
    {
        return empRepository.save(employee);
    }

    public List<EmpEntity> getallEmp(){

        return empRepository.findAll();
    }

    public Optional<EmpEntity> getempByID(int id){

        return empRepository.findById(id);
    }

    public ResponseEntity<Void> deleteemp(int id){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public EmpEntity updateEmployee(int id, EmpEntity updatedEmployee) {
        EmpEntity existingEmployee = empRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));

        existingEmployee.setId(updatedEmployee.getId());
        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setName(updatedEmployee.getAddress());
        return empRepository.save(existingEmployee);
    }
}
