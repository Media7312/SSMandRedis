package com.hp.service;

import com.hp.entity.Classes;
import com.hp.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesMapper classesMapper;

    public List<Classes> getClassStudent(int c_id) throws Exception{
        try {
            return classesMapper.getClassStudent(c_id);
        }catch (Exception e){
            throw  new Exception(e);
        }
    }

    public void setClassesMapper(ClassesMapper classesMapper) {
        this.classesMapper = classesMapper;
    }
}
