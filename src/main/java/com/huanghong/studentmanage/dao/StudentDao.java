package com.huanghong.studentmanage.dao;

import com.huanghong.studentmanage.pojo.Student;

import java.util.List;

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

    /**
     * 获取所有学生信息
     * @return 学生列表
     */
    List<Student> list();

    /**
     * 根据学生id删除学生信息
     */
   void delete(Long studentId);



}
