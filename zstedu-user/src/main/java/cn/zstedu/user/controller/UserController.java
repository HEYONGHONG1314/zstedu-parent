package cn.zstedu.user.controller;

import cn.zstedu.user.DTO.RespDTO;
import cn.zstedu.user.DTO.LoginDTO;
import cn.zstedu.user.service.UserService;
import cn.zstedu.user.utils.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public void insertUser(@RequestParam String username, @RequestParam String password){
        Map<Object, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", BPwdEncoderUtil.BCryptPassword(password));

        userService.userRegister(map);
    }

    @PostMapping(value = "/login")
    public LoginDTO userLogin(@RequestParam String username, @RequestParam String password) {
        LoginDTO loginDTO = userService.login(username, password);
        return loginDTO;
    }

    @RequestMapping(value = "/userinfo2",method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('boss')")
    public Object selectUserById(){
        return "我是何永鸿";

    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/userinfo",method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('admin')")
    public ArrayList selectUserById(@RequestParam String id){
        ArrayList<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id","1");
        map1.put("name","张诗婷");
        map1.put("age",25);
        System.out.println(map1);
        List<Map<String,Object>> list1 = new ArrayList<>();
        list1.add(map1);
        HashMap<String, Object> map11 = new HashMap<>();
        map11.put("info",list1);
        map11.put("subject","围棋");
        list.add(map11);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("id","2");
        map2.put("name","何永鸿");
        map2.put("age",28);
        System.out.println(map1);
        ArrayList list2 = new ArrayList<>();
        list2.add(map2);
        HashMap<String, Object> map22 = new HashMap<>();
        map22.put("info",list2);
        map22.put("subject","书法");
        list.add(map22);


        Map<String, Object> map3 = new HashMap<>();
        map3.put("id","3");
        map3.put("name","杨彩胜");
        map3.put("age",38);
        System.out.println(map1);
        ArrayList list3 = new ArrayList<>();
        list3.add(map3);
        HashMap<String, Object> map33 = new HashMap<>();
        map33.put("info",list3);
        map33.put("subject","数学");
        list.add(map33);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("id","4");
        map4.put("name","杨彩胜");
        map4.put("age",48);
        System.out.println(map1);
        ArrayList list4 = new ArrayList<>();
        list4.add(map4);
        HashMap<String, Object> map44 = new HashMap<>();
        map44.put("info",list4);
        map44.put("subject","语文");

        list.add(map44);

        return list;
    }




}
