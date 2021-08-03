package com.bin.service;

import com.bin.entity.User;

public interface UserService {
    /**
     * 根据ID获取用户
     * @param id
     * @return
     */
    User getUser(Integer id);
}
