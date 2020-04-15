package cn.zstedu.security.mapper;

import cn.zstedu.security.entity.Role;
import cn.zstedu.security.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UaaMapperImpl implements UaaMapper {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public User selectUser(String accountId) {
        User user = sqlSession.selectOne("selectUser",accountId);
        return user;
    }

    @Override
    public List<Role> selectRole(String accountId) {
        List<Role> roles = sqlSession.selectList("selectRole",accountId);
        return roles;
    }
}
