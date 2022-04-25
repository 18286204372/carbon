package com.change.mapper;

import com.change.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User queryUser(String username,String password);

    User queryUserById(String id);

    int addUser(User user);
}
