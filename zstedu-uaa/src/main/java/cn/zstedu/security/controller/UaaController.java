package cn.zstedu.security.controller;


import cn.zstedu.security.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UaaController {

    @Autowired
    UserServiceDetail userServiceDetail;
    @RequestMapping(value = "/userinfo")
    public Object getUserInfo(@RequestParam String accountId){
        UserDetails user = userServiceDetail.loadUserByUsername(accountId);
        return user;
    }

}
