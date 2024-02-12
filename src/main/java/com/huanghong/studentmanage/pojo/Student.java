package com.huanghong.studentmanage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 学生对象
 */
@Data //自动生成get/set方法
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student {
    /**
     * 学生数据库编号
     */
    Long id;

    /**
     * 学号
     */
    String sno;

    /**
     * 姓名
     */
    String name;

    /**
     * 年龄
     */
    Integer age;

    /**
     * 专业
     */
    String major;
}
