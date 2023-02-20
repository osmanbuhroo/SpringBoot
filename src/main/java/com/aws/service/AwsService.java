package com.aws.service;

import com.aws.entity.Aws;
import com.aws.exception.ServiceNotFoundException;
import com.aws.repository.AwsRepo;
import org.hibernate.service.internal.ServiceDependencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AwsService {
    @Autowired
    AwsRepo awsRepo;

    public Aws saveData(Aws aws) {
        return awsRepo.save(aws);
    }

    public Aws getByServiceId(Long serviceId) throws ServiceNotFoundException {
        Optional<Aws> service= awsRepo.findById(serviceId);
        if(!service.isPresent()){
            throw new ServiceNotFoundException("Department Not Availaible...");
        }
        return awsRepo.findById(serviceId).get();
    }

    public Aws updateData(Long serviceId,Aws aws) {
        return awsRepo.save(aws);
    }
}
