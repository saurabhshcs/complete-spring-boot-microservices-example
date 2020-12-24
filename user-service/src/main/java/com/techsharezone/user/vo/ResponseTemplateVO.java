package com.techsharezone.user.vo;

/*
 * @created 24/12/2020 -00:19
 * @project user-service
 * @author  saurabhshcs
 */


import com.techsharezone.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
