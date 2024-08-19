package com.fro.spring.dao;

import com.fro.spring.entity.User;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:22
 * @Description: com.fro.spring.dao
 * @version: 1.0
 */
public interface IUserDao {
    List<User> list();
}
