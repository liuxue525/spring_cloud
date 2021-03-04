package com.fh.controller;

import com.fh.entity.po.ResultData;
import com.fh.entity.vo.User;
import com.fh.feign.TestFeign;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("businessController")
@CrossOrigin
public class businessController {

    @Resource
    TestFeign testFeign;

    @PostMapping("/login")
    public Map login(String name,String password){
        User user = testFeign.queryUserByName(name);
        Map rs=new HashMap();
        if(user!=null){
            if(user.getPassword().equals(password)){
                rs.put("code",300);
                rs.put("message","密码正确");
            }else{
                rs.put("code",500);
                rs.put("message","密码错误");
            }
        }else{
            rs.put("code",200);
            rs.put("message","账号不存在");
        }
        return rs;
    }
    @RequestMapping("/addUser")
    public ResultData addUser(User user){
        Map map = testFeign.addUser(user);
        return ResultData.success(null);
    }

}
