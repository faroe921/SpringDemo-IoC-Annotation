package com.fro.spring.service;

import com.fro.spring.entity.User;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:18
 * @Description: com.fro.spring.service
 * @version: 1.0
 */
public interface IUserService {
    List<User> queryUsers();
}
