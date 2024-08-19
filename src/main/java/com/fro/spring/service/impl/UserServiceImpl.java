package com.fro.spring.service.impl;

import com.fro.spring.dao.IUserDao;
import com.fro.spring.entity.User;
import com.fro.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:19
 * @Description: com.fro.spring.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> queryUsers() {
        return userDao.list();
    }
}
