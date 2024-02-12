package com.huanghong.studentmanage.service;

import com.huanghong.studentmanage.pojo.Student;

public interface StudentService {
    /**
     * 创建学生
     * @param student 学生对象
     * @return 是否创建成功
     */
    boolean insertStudent(Student student);
}
