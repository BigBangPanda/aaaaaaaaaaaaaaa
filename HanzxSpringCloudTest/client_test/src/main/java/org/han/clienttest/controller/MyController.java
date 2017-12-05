package org.han.clienttest.controller;

import org.han.clienttest.model.User;
import org.han.clienttest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**此注解是代表当前类是一个springboot应用程序*/
@RestController
public class MyController {

    private final UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }


    /**
     * springboot默认使用的json解析框架是jackson;
     * RequestMapping("/getUser") 此注解是请求的映射路径;
     * @return
     */
//    @RequestMapping("/getUser")
//    public User getUser(){
//        User user = new User();
//        user.setId(1);
//        user.setName("aaa");
//        return user;
//    }

    @RequestMapping("/findUserById")
    public User findUserById(Integer id) {
        return userService.findUserById(id);
    }

    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @PostMapping("/insertUser")
    public void insertUser(User user){
        userService.insertUser(user);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }

    @PostMapping("/updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }
}
