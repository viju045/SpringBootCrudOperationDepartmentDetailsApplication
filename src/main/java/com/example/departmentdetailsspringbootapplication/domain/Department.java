package com.example.departmentdetailsspringbootapplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Table used in this project Name is "department"
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int department_Id;
    private String department_Name;
    private String department_Address;
    private String department_Code;
    private String department_Branch;

    public int getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getDepartment_Address() {
        return department_Address;
    }

    public void setDepartment_Address(String department_Address) {
        this.department_Address = department_Address;
    }

    public String getDepartment_Code() {
        return department_Code;
    }

    public void setDepartment_Code(String department_Code) {
        this.department_Code = department_Code;
    }

    public String getDepartment_Branch() {
        return department_Branch;
    }

    public void setDepartment_Branch(String department_Branch) {
        this.department_Branch = department_Branch;
    }
}
