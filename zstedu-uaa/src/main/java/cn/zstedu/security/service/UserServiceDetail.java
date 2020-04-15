package cn.zstedu.security.service;

import cn.zstedu.security.entity.Role;
import cn.zstedu.security.entity.User;
import cn.zstedu.security.mapper.UaaMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    UaaMapperImpl uaaMapperImpl;

    @Override
    public UserDetails loadUserByUsername(String accountId) throws UsernameNotFoundException {
        // 通过用户名称，密码
        User user = uaaMapperImpl.selectUser(accountId);
        // 查询用户角色
        List<Role> roles = uaaMapperImpl.selectRole(accountId);

        // 数据整合，返回UserDetails对象
        user.setAuthorities(roles);

        return user;
    }
}
