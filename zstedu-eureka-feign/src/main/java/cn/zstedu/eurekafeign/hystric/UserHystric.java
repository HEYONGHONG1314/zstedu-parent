package cn.zstedu.eurekafeign.hystric;

import cn.zstedu.eurekafeign.feignclient.UserFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserHystric implements UserFeign {
    @Override
    public ArrayList selectUserById(String id) {
        String info = "请求用户ID错误";
        ArrayList<Object> list = new ArrayList<>();
        list.add(info);
        return list;
    }
}
