package com.aws.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
@Entity
public class Aws {
    @Id
    private long serviceId;
    @NotBlank(message = "This field cannot be blank")
    private String serviceName;
    private long serviceCost;
    private String serviceDescription;

}
