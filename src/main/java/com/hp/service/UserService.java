package com.hp.service;

import com.hp.entity.User;
import com.hp.mapper.UserMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * usedfor：
 * Created by javahao on 2017/7/13.
 * auth：JavaHao
  */
@Service
public class UserService{
    protected final transient Log log = LogFactory.getLog(this.getClass());
    @Autowired
    private UserMapper userMapper;
    /**
     * 按照条件查询数据
     * @param user 查询条件
     * @return 返回查询结果
     */

    public List<User> list(User user) throws Exception {
        try {
            return userMapper.list(user);
        } catch (Exception e) {
            log.error(e);
            throw new Exception(e);
        }
    }

}
