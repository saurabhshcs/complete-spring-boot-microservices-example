package com.techsharezone.user.repository;

/*
 * @created 24/12/2020 -00:08
 * @project user-service
 * @author  saurabhshcs
 */

import com.techsharezone.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
