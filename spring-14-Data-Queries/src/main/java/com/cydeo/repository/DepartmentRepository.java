package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    // Display all departments in the Furniture Department

    List<Department> findByDepartment(String department);

    // Display all departments in the Health Division

    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division); // same line 16-17-18
    List<Department> findByDivisionEquals(String division);

    // Display all departments with division name ends with 'ics'
    List<Department> findByDivisionEndsWith(String pattern);

    // Display top 3 departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop3ByDivisionContainsIgnoreCase(String pattern);

    // JPQL
    @Query("select d from Department d where d.division in ?1")
    List<Department> retrieveDepartmentDivision(List<String> division);
}
