package com.zzd.assessment2.service.impl;
import com.zzd.assessment2.mapper.UserMapper;
import com.zzd.assessment2.pojo.User;
import com.zzd.assessment2.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Slf4j
    @Service
    public class UserServiceImpl implements UserService{

        @Autowired
        private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void add(User user) {
        user.setCreatedAt(LocalDateTime.now());
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

}
