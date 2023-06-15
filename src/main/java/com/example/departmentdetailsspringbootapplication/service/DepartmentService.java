package com.example.departmentdetailsspringbootapplication.service;

import com.example.departmentdetailsspringbootapplication.domain.Department;

import java.util.List;

public interface DepartmentService {
    //save the operation
    Department saveDepartment(Department department);
    //read the operation
    List<Department> fetchDepartmentList();
    //update the operation
    Department updateDepartment(Department department, int departmentID);
    //delete the operation
    void deleteDepartmentByID(int departmentId);
}
