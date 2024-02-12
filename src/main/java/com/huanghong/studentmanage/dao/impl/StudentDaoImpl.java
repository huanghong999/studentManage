package com.huanghong.studentmanage.dao.impl;

import com.huanghong.studentmanage.dao.StudentDao;
import com.huanghong.studentmanage.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class StudentDaoImpl implements StudentDao {

    List<Student> studentList=new ArrayList<>();
    @Override
    public boolean insertStudent(Student student) {
        Set<Long> studentIds = studentList.stream().map(s -> s.getId()).collect(Collectors.toSet());
        if (studentIds.contains(student.getId())) {
            System.out.println(" id已存在..."+student.getId());
            throw new RuntimeException("student id has existed.");
        }
        return studentList.add(student);
    }
}
