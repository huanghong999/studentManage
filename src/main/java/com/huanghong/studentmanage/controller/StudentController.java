package com.huanghong.studentmanage.controller;

import com.huanghong.studentmanage.pojo.Student;
import com.huanghong.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author pdai
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 创建学生对象
     *
     * @param student student param
     * @return student
     */
    @PostMapping
    public Long insert(@RequestBody Student student) {
        System.out.println("student = " + student);
        studentService.insertStudent(student);
        return student.getId();
    }

    @GetMapping
    public Student find(@RequestParam Long id) {
        Student student=studentService.find(id);
        return student;
    }
}