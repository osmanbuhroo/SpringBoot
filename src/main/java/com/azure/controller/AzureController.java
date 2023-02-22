package com.azure.controller;

import com.azure.entity.Azure;
import com.azure.entity.Employee;
import com.azure.exception.ServiceNotFondException;
import com.azure.repository.AzureRepository;
import com.azure.repository.EmployeeRepo;
import com.azure.service.AzureService;
import com.azure.service.AzureServiceImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class AzureController {

    @Autowired
    AzureService azureService;

    @Valid
    @PostMapping("/save-service")
    private Azure save(@RequestBody Azure azure){
        return azureService.save(azure);
    }
//    @GetMapping("/find/{id}")
//    private Azure find(@PathVariable Long id) throws ServiceNotFondException {
//        return azureService'.find(id);
//    }
//
//    @PutMapping("/update-data/{id}")
//    private Azure updateData(@PathVariable Long id, @RequestBody Azure azure) throws ServiceNotFondException {
//        return azureService.updateData(id,azure);
//    }
//
//    @PostMapping("/save-onetoone")
//    private Employee addData_oneToOne(@RequestBody Employee employee){
//        return azureService.addData_oneToOne(employee);
//    }
//
//    @GetMapping("/find-onetoone/{id}")
//    private Employee find_oneToOne(@PathVariable Long id) throws ServiceNotFondException {
//        return azureService.find_oneToOne(id);
//    }
//
//    @PutMapping("/update-data-onetoone/{id}")
//    private Employee updateData_manyToOne(@PathVariable Long id, @RequestBody Employee employee) throws ServiceNotFondException {
//        return azureService.updateData_oneToOne(id,employee);
//    }

    @PostMapping("/save-employee")
    private Employee saveEmployee(@RequestBody Employee employee){
        return azureService.saveEmployee(employee);
    }

    @PutMapping("/map-emp-service/empid/{empId}/serviceid/{serviceId}")
    private Employee mapping(@PathVariable("empId") Long empId , @PathVariable("serviceId") Long serviceId){
       return azureService.mapping(empId,serviceId);
    }



//    @GetMapping("/find-manytoone/{id}")
//    private Employee find_manyToOne(@PathVariable Long id) throws ServiceNotFondException {
//        return azureService.find_manyToOne(id);
//    }
//
//    @PutMapping("/update-data-manytoone/{id}")
//    private Employee updateData_oneToOne(@PathVariable Long id, @RequestBody Employee employee) throws ServiceNotFondException {
//        return azureService.updateData_manyToOne(id,employee);
//    }
}





/*
Azure CycleCloud -- Create, manage, operate, and optimize HPC and big compute clusters of any scale
Azure Database Migration Service -- Accelerate your data migration to Azure
Azure Data Box -- Appliances and solutions for data transfer to Azure and edge compute
 */