package com.zzd.assessment2.mapper;

import com.zzd.assessment2.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> list();

    @Select("insert into users (username, password, created_at) VALUE " +
            "(#{username},#{password},#{createdAt})")
    void insert(User user);

    @Update("update users set username = #{username},password = #{password} " +
            "where user_id = #{id}")
    void update(User user);

    @Delete("delete from users where user_id =#{id}")
    void delete(Integer id);
}
