package user;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableFeignClients
@Configuration
@AutoConfigureAfter(FeignAutoConfiguration.class)
@Import({UserServiceApi.class})
public class ApiConfig {

}