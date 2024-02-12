package com.huanghong.studentmanage.service;

import com.huanghong.studentmanage.pojo.Student;

public interface StudentService {
    /**
     * 创建学生
     * @param student 学生对象
     * @return 是否创建成功
     */
    boolean insertStudent(Student student);

    /**
     * 根据id查询学生信息
     * @param id 学生id
     * @return Student信息，如果没查到返回null
     */
    Student find(Long id);
}
