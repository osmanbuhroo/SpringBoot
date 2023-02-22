package com.gcp.service;

import com.gcp.entity.Employee;
import com.gcp.entity.GoogleCloud;

import javax.management.ServiceNotFoundException;
import java.util.List;


public interface GoogleCloudService {

    //GoogleCloud find(long id) throws ServiceNotFoundException;
    GoogleCloud addData(GoogleCloud googleCloud);

    Employee addData_manyToMany(Employee employee);

    Employee update(Long empId, Long serviceId);
//    GoogleCloud updateData(Long id,GoogleCloud googleCloud);
//
//    Employee addData_oneToOne(Employee employee);
//
//    Employee find_oneToOne(Long id) throws  ServiceNotFoundException;
//
//
//    Employee updateData_oneToOne(Long id, Employee employee) throws ServiceNotFoundException;
//
//
//
//   Employee addData_manyToOne(Employee employee);
//
//    Employee find_manyToOne(Long id) throws  ServiceNotFoundException;
//
//
//    Employee updateData_manyToOne(Long id, Employee employee) throws ServiceNotFoundException;
}
