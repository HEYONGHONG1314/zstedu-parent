package cn.zstedu.security.mapper;

import cn.zstedu.security.entity.Role;
import cn.zstedu.security.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface UaaMapper {

    User selectUser(String accountId);

    List<Role> selectRole(String accountId);
}
