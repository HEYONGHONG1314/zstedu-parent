package cn.zstedu.eurekafeign.service;

import cn.zstedu.eurekafeign.feignclient.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserFeign userFeign;

    public ArrayList selectUserById(String id){
        ArrayList list = userFeign.selectUserById(id);
        return list;
    }



}
