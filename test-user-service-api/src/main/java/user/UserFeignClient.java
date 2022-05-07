package user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "tes", url = "127.0.0.1:8081")
public interface UserFeignClient {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String getUser();
}
