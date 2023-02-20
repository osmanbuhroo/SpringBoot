package com.aws.controller;

import com.aws.entity.Aws;
import com.aws.exception.ServiceNotFoundException;
import com.aws.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class AwsController {

    @Autowired
    private AwsService awsService;
    @PostMapping("/postData")
    public Aws saveData(@Valid @RequestBody Aws aws){
        return awsService.saveData(aws);
    }
    @GetMapping("/getData/{id}")
    public Aws getData(@PathVariable("id") Long serviceId) throws ServiceNotFoundException {
        return awsService.getByServiceId(serviceId);
    }
    @PutMapping("/updateData/{id}")
    public Aws updateData(@PathVariable("id") Long serviceId,@RequestBody Aws aws){
        return awsService.updateData(serviceId,aws);
    }

}
