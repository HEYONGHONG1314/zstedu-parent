package cn.zstedu.user.dao;


import cn.zstedu.user.entity.Role;
import cn.zstedu.user.entity.User;
import cn.zstedu.user.mapper.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private UserMapperImpl userMapper;

    @Autowired
    private UserMapperImpl userMapperImpl;

    public void uesrRegister(Map map){
        // 插入用户账号
        int i = userMapper.insertUser(map);
    }

    public UserDetails loadUserByUsername(String accountId) throws UsernameNotFoundException {
        // 通过用户名称，密码
        User user = userMapperImpl.selectUser(accountId);
        // 查询用户角色
        List<Role> roles = userMapperImpl.selectRole(accountId);

        // 数据整合，返回UserDetails对象
        user.setAuthorities(roles);

        return user;
    }

}
