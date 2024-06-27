package com.zzd.assessment2.service;

import com.zzd.assessment2.pojo.User;

import java.util.List;

public interface UserService {

    List<User> list();

    void add(User user);

    void update(User user);

    void delete(Integer id);
}
