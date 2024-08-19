package com.fro.spring.dao.impl;

import com.fro.spring.dao.IUserDao;
import com.fro.spring.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:23
 * @Description: com.fro.spring.dao.impl
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> list() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User(i, "faroe" + i);
            list.add(user);
        }
        return list;
    }
}
