package com.example.departmentdetailsspringbootapplication.repository;

import com.example.departmentdetailsspringbootapplication.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
