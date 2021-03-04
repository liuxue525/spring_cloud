package com.fh.feign;

import com.fh.entity.vo.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ServiceFallbackFactory implements  TestFeign{

    @Override
    public User queryUserByName(String name) {
        User u=new User();
        return u;
    }

    @Override
    public Map addUser(User user) {
        Map map=new HashMap();
        map.put("code","熔断");
        return map;
    }
}
