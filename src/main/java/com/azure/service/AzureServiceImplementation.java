package com.azure.service;

import com.azure.entity.Azure;
import com.azure.entity.Employee;
import com.azure.exception.ServiceNotFondException;
import com.azure.repository.AzureRepository;
import com.azure.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class AzureServiceImplementation implements AzureService{

    @Autowired
    AzureRepository azureRepository;

    @Autowired
    EmployeeRepo employeeRepo;

    public Azure save(Azure azure) {
        return azureRepository.save(azure);
    }

//    @Override
//    public Azure find(Long id) throws ServiceNotFondException {
//        Optional<Azure> azure=azureRepository.findById(id);
//        if (Objects.isNull(azure)){
//            throw new ServiceNotFondException("ID does not belongs to any Data");
//        }
//        return azure.get();
//    }
//
//    @Override
//    public Azure updateData(Long id, Azure azure) throws ServiceNotFondException {
//        Azure azureDatabase = azureRepository.findById(id).get();
//        if (Objects.isNull(azureDatabase)){
//            throw new ServiceNotFondException("ID does not belongs to any Data");
//        }
//        if (Objects.nonNull(azure.getServiceName())) {
//            azureDatabase.setServiceName((azure.getServiceName()));
//        }
//
//        if (Objects.nonNull(azure.getServiceCost())) {
//            azureDatabase.setServiceCost(azure.getServiceCost());
//        }
//
//        if (Objects.nonNull(azure.getServiceDescription())) {
//            azureDatabase.setServiceDescription((azure.getServiceDescription()));
//        }
//        return azureRepository.save(azureDatabase);
//    }
//
//    public Employee addData_oneToOne(Employee employee){
//        return employeeRepo.save(employee);
//    }
//    public Employee find_oneToOne(Long id) throws ServiceNotFondException {
//        Optional<Employee> employee=employeeRepo.findById(id);
//        if (Objects.isNull(employee)){
//            throw new ServiceNotFondException("ID does not belongs to any Data");
//        }
//        return employee.get();
//    }
//    public Employee updateData_oneToOne(Long id, Employee employee) throws ServiceNotFondException {
//        Employee empDatabase = employeeRepo.findById(id).get();
//        if (Objects.isNull(empDatabase)){
//            throw new ServiceNotFondException("ID does not belongs to any Data");
//        }
//        if (Objects.nonNull(employee.getEmpName())) {
//            empDatabase.setEmpName((employee.getEmpName()));
//        }
//        Azure azure= employee.getAzure();
//        Azure azureDatabase= azureRepository.findById(id).get();
//        if (Objects.nonNull(azure.getServiceName())) {
//            azureDatabase.setServiceName((azure.getServiceName()));
//        }
//
//        if (Objects.nonNull(azure.getServiceCost())) {
//            azureDatabase.setServiceCost(azure.getServiceCost());
//        }
//
//        if (Objects.nonNull(azure.getServiceDescription())) {
//            azureDatabase.setServiceDescription((azure.getServiceDescription()));
//        }
//        empDatabase.setAzure(azureDatabase);
//        return employeeRepo.save(empDatabase);
//    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee mapping(Long empId, Long serviceId){
        List<Azure> azureList=null;
        Azure azure = azureRepository.findById(serviceId).get();
        Employee employee= employeeRepo.findById(empId).get();
        azureList= employee.getAzure();
        azureList.add(azure);
        employee.setAzure(azureList);
        return employeeRepo.save(employee);
    }

//    public Employee find_manyToOne(Long id) throws ServiceNotFondException {
//        Optional<Employee> employee=employeeRepo.findById(id);
//        if (Objects.isNull(employee)){
//            throw new ServiceNotFondException("ID does not belongs to any Data");
//        }
//        return employee.get();
//    }
//
//    @Override
//    public Employee updateData_manyToOne(Long id, Employee employee) {
//        return null;
//    }

}
