package org.hanzx.configclient.controller;

import org.hanzx.configclient.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**此注解是代表当前类是一个springboot应用程序*/
@RestController
public class MyController {


    /**
     * springboot默认使用的json解析框架是jackson;
     * RequestMapping("/getUser") 此注解是请求的映射路径;
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("aaa");
        return user;
    }

//    @RequestMapping("/configclient")
//    public int configClient(Integer id) {
//        return id;
//    }

}
