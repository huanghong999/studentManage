package com.huanghong.studentmanage.dao;

import com.huanghong.studentmanage.pojo.Student;

/**
 * Student 数据访问层
 */
public interface StudentDao {
    /**
     * 创建学生
     * @param student 学生对象
     * @return 是否创建成功
     */
    boolean insertStudent(Student student);
}
