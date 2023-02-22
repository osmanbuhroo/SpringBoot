package com.azure.service;

import com.azure.entity.Azure;
import com.azure.entity.Employee;
import com.azure.exception.ServiceNotFondException;

import java.util.List;

public interface AzureService {
    Azure save(Azure azure);
//    Azure find(Long id) throws ServiceNotFondException;
//    Azure updateData(Long id, Azure azure) throws ServiceNotFondException;
//
//    Employee addData_oneToOne(Employee employee);
//
//    Employee find_oneToOne(Long id) throws ServiceNotFondException;
//
//    Employee updateData_oneToOne(Long id, Employee employee) throws ServiceNotFondException;

   // Employee addData_manyToOne(Employee employee);

   // Employee find_manyToMany(Long id) throws ServiceNotFondException;

  //  Employee updateData_manyToOne(Long id, Employee employee);

    Employee saveEmployee(Employee employee);

    Employee mapping(Long empId, Long serviceId);
}
