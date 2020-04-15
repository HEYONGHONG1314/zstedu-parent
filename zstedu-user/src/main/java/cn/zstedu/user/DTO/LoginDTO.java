package cn.zstedu.user.DTO;

import cn.zstedu.user.entity.JWT;
import cn.zstedu.user.entity.User;

public class LoginDTO {
    private JWT jwt;
    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
