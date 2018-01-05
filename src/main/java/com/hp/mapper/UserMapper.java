package com.hp.mapper;


import com.hp.entity.User;
import com.hp.mybatis.MyBatisMapper;

import java.util.List;

/**
 * usedfor：
 * Created by javahao on 2017/7/13.
 * auth：JavaHao
 */
@MyBatisMapper
public interface UserMapper{
    public List<User> list(User user);

}
