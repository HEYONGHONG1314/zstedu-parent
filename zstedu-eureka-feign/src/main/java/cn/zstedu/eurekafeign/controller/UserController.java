package cn.zstedu.eurekafeign.controller;

import cn.zstedu.eurekafeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/userinfo")
    public ArrayList selectUserById(@RequestParam String id){
        ArrayList list = userService.selectUserById(id);
        return list;
    }
}
