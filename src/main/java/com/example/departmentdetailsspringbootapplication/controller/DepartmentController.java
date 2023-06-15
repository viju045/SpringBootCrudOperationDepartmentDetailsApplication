package com.example.departmentdetailsspringbootapplication.controller;

import com.example.departmentdetailsspringbootapplication.domain.Department;
import com.example.departmentdetailsspringbootapplication.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl departmentService;
    //save the operation
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    //read the operation
    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    //update the operation
    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") int departmentID){
        return departmentService.updateDepartment(department,departmentID);
    }

    //delete the operation
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentByID(@PathVariable("id") int departmentID){
        departmentService.deleteDepartmentByID(departmentID);
        return "Resource has been deleted successfully";
    }
}
