package com.techsharezone.user.service;

/*
 * @created 24/12/2020 -00:08
 * @project user-service
 * @author  saurabhshcs
 */

import com.techsharezone.user.entity.User;
import com.techsharezone.user.repository.UserRepository;
import com.techsharezone.user.vo.Department;
import com.techsharezone.user.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    private static final String DEPARTMENT_ENDPOINT = "http://localhost:9001/departments/";

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(final User user) {
        return repository.save(user);
    }

    public User getUserForId(final Long id) {
        return repository.findById(id).get();
    }

    public ResponseTemplateVO getUserForDepartment(final Long id) {

        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user =  repository.findById(id).get();

        Department department = restTemplate.getForObject(DEPARTMENT_ENDPOINT + user.getDepartmentId(), Department.class);

        LOG.info("Endpoint: [{}] and department: [{}]", DEPARTMENT_ENDPOINT + user.getDepartmentId(), department);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
