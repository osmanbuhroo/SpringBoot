package com.azure.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
@Entity
public class Employee {
    @Id
    @SequenceGenerator(
            name = "emp_seq",
            sequenceName = "emp_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "emp_seq"
    )
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;

//    @OneToOne
//    @Cascade(CascadeType.ALL)
//    private Azure azure;
    @ManyToMany //(cascade = CascadeType.ALL)
    @JoinTable(name = "Emp_AZ", joinColumns = @JoinColumn(name = "serviceId"),
            inverseJoinColumns = @JoinColumn(name = "empId"))
    private List<Azure> azure;



}
