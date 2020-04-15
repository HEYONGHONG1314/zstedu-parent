package cn.zstedu.user.service;

import cn.zstedu.user.DTO.LoginDTO;
import cn.zstedu.user.DTO.RespDTO;
import cn.zstedu.user.client.AuthServiceClient;
import cn.zstedu.user.dao.UserDao;
import cn.zstedu.user.entity.JWT;
import cn.zstedu.user.entity.User;
import com.alibaba.druid.wall.violation.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AuthServiceClient authServiceClient;

    public void userRegister(Map map){
        userDao.uesrRegister(map);
    }

    public LoginDTO login(String username , String password){
        User user = (User)userDao.loadUserByUsername(username);
//        if(null==user){
//            throw new CommonException(ErrorCode.USER_NOT_FOUND);
//        }
//        if(!BPwdEncoderUtils.matches(password,user.getPassword())){
//            throw new CommonException(ErrorCode.USER_PASSWORD_ERROR);
//        }

        JWT jwt = authServiceClient.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        // 获得用户菜单
//        if(null==jwt){
//            throw new CommonException(ErrorCode.GET_TOKEN_FAIL);
//        }
        LoginDTO loginDTO=new LoginDTO();
        loginDTO.setUser(user);
        loginDTO.setJwt(jwt);
       // return RespDTO.onSuc(loginDTO);
        return loginDTO;
    }




}
