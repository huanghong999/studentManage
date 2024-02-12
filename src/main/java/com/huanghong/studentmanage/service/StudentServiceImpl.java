package com.huanghong.studentmanage.service;

import com.huanghong.studentmanage.dao.StudentDao;
import com.huanghong.studentmanage.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service impl. 写业务逻辑的
 *
 * @author pdai
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao=studentDao;
    }
    @Override
    public boolean insertStudent(Student student) {
        if (student.getAge() < 0 || student.getAge() >= 120) {
            System.out.println("student age is invalid."+student.getAge());
            throw new RuntimeException("student age is invalid.");
        }
        return studentDao.insertStudent(student);
    }

    @Override
    public Student find(Long id) {
        List<Student> studentList= studentDao.list();
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}