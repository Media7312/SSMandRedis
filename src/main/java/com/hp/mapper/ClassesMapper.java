package com.hp.mapper;

import com.hp.entity.Classes;
import com.hp.mybatis.MyBatisMapper;

import java.util.List;

@MyBatisMapper
public interface ClassesMapper {
    List<Classes> getClassStudent(int c_id);
}
