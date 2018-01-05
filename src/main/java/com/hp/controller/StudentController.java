package com.hp.controller;

import com.hp.mapper.ClassesMapper;
import com.hp.service.BookService;
import com.hp.service.ClassesService;
import com.hp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassesService classesService;
    @Autowired
    private BookService bookService;
    @RequestMapping("/student")
    public String List(Model m) throws Exception{
        m.addAttribute("StudentList",studentService.getAllStudentByC_id(10001));
        return "student";
    }
    @RequestMapping("/classes")
    public String ListA(Model m) throws Exception{
        System.out.println(classesService.getClassStudent(10001).toString());
        m.addAttribute("StringList",classesService.getClassStudent(10001));
        System.out.println("==========================");
        return "Classes";
    }
    @RequestMapping("/boolk")
    public String ListAA(Model m) throws  Exception{
        m.addAttribute("BookList",bookService.getBook());
        return "book";
    }
}
