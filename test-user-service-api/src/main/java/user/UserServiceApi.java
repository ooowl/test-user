package user;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * classname UserServiceApi
 * description
 * </pre>
 *
 * @author wangxiaopeng
 * @date 2022/5/5
 **/
@Component
public class UserServiceApi {

    private final UserFeignClient userFeignClient;

    public UserServiceApi(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    public String getUser() {
        return userFeignClient.getUser();
    }
    
}