package cn.zstedu.eurekafeign.feignclient;

import cn.zstedu.eurekafeign.hystric.UserHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Component
@FeignClient(value = "ApplicationUser", fallback = UserHystric.class)
public interface UserFeign {

    @GetMapping(value = "/user/userinfo")
    public ArrayList selectUserById(@RequestParam String id);

}
