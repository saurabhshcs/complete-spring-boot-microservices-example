package com.techsharezone.department.service;

/*
 * @created 23/12/2020 -01:29
 * @project department-service
 * @author  saurabhshcs
 */

import com.techsharezone.department.entity.Department;
import com.techsharezone.department.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DepartmentService {

    private static final Logger LOG = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    private DepartmentRepository  departmentRepository;

    public Department saveDepartment(@RequestBody Department department) {
        LOG.info("Saved department...");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(@PathVariable("id") Long id){
        return departmentRepository.findById(id).get();
    }
}
