package com.dbconnect.employee.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Table (name = "Employee_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column (name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ROLE")
    private String role;
}
