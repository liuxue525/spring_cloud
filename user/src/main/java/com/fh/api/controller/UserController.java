package com.fh.api.controller;


import com.fh.api.entity.po.User;
import com.fh.api.entity.vo.UserVo;
import com.fh.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController  //类上默认加@Controller 每个方法默认加@ResponseBody
@CrossOrigin     //解决跨域问题
@RequestMapping("api/user/") //提供外界访问路径
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 新增
     *
     * @param user
     * @return
     */

    @PostMapping("addUser")
    public Map addUser(User user){
        Map map = new HashMap();

        userService.addUser(user);

        map.put("message","新增成功");
        return map;
    }

    @PostMapping("queryUser")
    public Map queryUser(UserVo userVo){

        Map map=userService.queryUser(userVo);

        return map;
    }
}
