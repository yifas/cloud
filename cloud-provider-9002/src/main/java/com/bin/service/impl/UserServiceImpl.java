package com.bin.service.impl;

import com.bin.dao.UserDao;
import com.bin.entity.User;
import com.bin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }
}
