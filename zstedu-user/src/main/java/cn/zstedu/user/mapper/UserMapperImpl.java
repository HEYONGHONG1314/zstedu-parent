package cn.zstedu.user.mapper;

import cn.zstedu.user.entity.Role;
import cn.zstedu.user.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserMapperImpl implements UserMapper {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertUser(Map map) {
        int num = sqlSession.insert("insertUser", map);
        return num;
    }

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
