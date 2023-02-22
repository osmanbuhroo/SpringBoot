package com.gcp.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long empId;
    private String empName;

//    @OneToOne
//    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
//    private GoogleCloud googleCloud;

    @ManyToMany//(cascade = CascadeType.ALL,optional = true)
    @JoinTable(name="Emp_SR", joinColumns = @JoinColumn(name="serviceId"),
    inverseJoinColumns = @JoinColumn(name="empId"))

    private List<GoogleCloud> googleCloud;


}
