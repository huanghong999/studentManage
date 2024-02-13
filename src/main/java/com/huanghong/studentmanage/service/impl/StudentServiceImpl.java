package com.huanghong.studentmanage.service.impl;

import com.huanghong.studentmanage.dao.StudentDao;
import com.huanghong.studentmanage.pojo.Student;
import com.huanghong.studentmanage.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service impl. 写业务逻辑的
 *
 * @author pdai
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public boolean insertStudent(Student student) {
        if (student.getAge() < 0 || student.getAge() >= 120) {
            log.info("student age={} is invalid.", student.getAge());
            throw new RuntimeException("student age is invalid.");
        }
        return studentDao.insertStudent(student);
    }

    @Override
    public Student find(Long id) {
        List<Student> studentList = studentDao.list();
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        studentDao.delete(id);
    }

    @Override
    public List<Student> list() {
        List<Student> studentList = studentDao.list();
        return studentList;
    }
}