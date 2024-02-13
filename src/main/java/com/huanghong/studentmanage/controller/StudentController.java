package com.huanghong.studentmanage.controller;

import com.huanghong.studentmanage.pojo.Student;
import com.huanghong.studentmanage.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pdai
 */
@RestController
@RequestMapping("/student")
@Slf4j
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
        log.info("[student] insert studentId={},name={}", student.getId(), student.getName());
        studentService.insertStudent(student);
        return student.getId();
    }

    /**
     * 根据学生id查询学生信息
     *
     * @param id 学生id
     * @return 学生对象
     */
    @GetMapping
    public Student find(@RequestParam Long id) {
        Student student = studentService.find(id);
        return student;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        studentService.delete(id);
    }

    @GetMapping("/list")
    public List<Student> list() {
        List<Student> students = studentService.list();
        return students;
    }

}