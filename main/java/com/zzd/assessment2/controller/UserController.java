package com.zzd.assessment2.controller;

import com.zzd.assessment2.pojo.User;
import com.zzd.assessment2.pojo.Result;
import com.zzd.assessment2.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Result list(){
        log.info("查询所有用户");
        List<User> userList= userService.list();
        return Result.success(userList);
    }

    @PostMapping("/users")
    public Result add(@RequestBody User user){
        log.info("增加用户:{}",user);
        userService.add(user);
        return Result.success();
    }

    @PutMapping("/users/{id}")
    public Result update(@RequestBody User user){
        log.info("修改用户id为{}的用户信息");
        userService.update(user);
        return Result.success();
    }

    @Delete("/users/{id}}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }

}
