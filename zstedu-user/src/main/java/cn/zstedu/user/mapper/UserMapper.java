package cn.zstedu.user.mapper;

import cn.zstedu.user.entity.Role;
import cn.zstedu.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserMapper {
    int insertUser(Map map);

    User selectUser(String accountId);

    List<Role> selectRole(String accountId);
}
