package com.bin.dao;

import com.bin.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User getUser(@Param("id") Integer id);
}
