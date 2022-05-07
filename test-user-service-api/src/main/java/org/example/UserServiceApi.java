package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserServiceApi {

    private final UserFeignClient userFeignClient;

    public UserServiceApi(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    public UserDTO getUser() {
        return userFeignClient.getUser();
    }

}