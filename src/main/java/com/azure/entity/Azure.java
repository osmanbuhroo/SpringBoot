package com.azure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Azure {

    @Id
    @SequenceGenerator(
            name = "service_seq",
            sequenceName = "service_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "service_seq"
    )
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceId;
    @NotBlank(message = "Service name can not be blank")
    private String serviceName;
    private Double serviceCost;
    @NotBlank(message = "Service description can not be blank")
    private String serviceDescription;

}
