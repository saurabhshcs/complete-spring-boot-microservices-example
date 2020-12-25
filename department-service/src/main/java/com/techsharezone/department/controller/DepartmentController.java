package com.techsharezone.department.controller;
/*
 * @created 23/12/2020 -01:30
 * @project department-service
 * @author  saurabhshcs
 */

import com.techsharezone.department.entity.Department;
import com.techsharezone.department.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        LOG.info("Depatment Name: [{}]", department.getDepartmentName());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findbyDepartmentId(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }
}
