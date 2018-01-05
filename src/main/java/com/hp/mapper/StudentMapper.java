package com.hp.mapper;

import com.hp.entity.Student;
import com.hp.mybatis.MyBatisMapper;

import java.util.List;
@MyBatisMapper
public interface StudentMapper {
    public List<Student> getAllStudentByC_id(int c_id);
}
