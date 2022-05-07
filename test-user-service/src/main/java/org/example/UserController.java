package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserDTO getUser() {

        UserDTO userDTO = new UserDTO();

        userDTO.setUserId("1");
        userDTO.setUserName("张三");

        return userDTO;
    }

}
