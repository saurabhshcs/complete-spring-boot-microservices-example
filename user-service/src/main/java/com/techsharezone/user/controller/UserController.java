package com.techsharezone.user.controller;

/*
 * @created 24/12/2020 -00:10
 * @project user-service
 * @author  saurabhshcs
 */

import com.techsharezone.user.entity.User;
import com.techsharezone.user.service.UserService;
import com.techsharezone.user.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody final User user){
        return service.saveUser(user);
    }

    @GetMapping("{id}")
    public ResponseTemplateVO getUserForId(@PathVariable("id") final Long id){

        LOG.info("Department -> {}", service.getUserForDepartment(id).getDepartment());
        return service.getUserForDepartment(id);
    }
}
