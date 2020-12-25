package com.techsharezone.department.repository;

/*
 * @created 23/12/2020 -01:27
 * @project department-service
 * @author  saurabhshcs
 */

import com.techsharezone.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}