package com.hp.service;

import com.hp.entity.Student;
import com.hp.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> getAllStudentByC_id(int id) throws Exception{
        try {
            return studentMapper.getAllStudentByC_id(id);
        } catch (Exception e){
            throw new Exception(e);
        }

    }
}
