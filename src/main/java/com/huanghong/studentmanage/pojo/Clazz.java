package com.huanghong.studentmanage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 班级对象
 */
@Data //自动生成get/set方法
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Clazz {
    /**
     * 班级数据库编号
     */
    Long id;

    /**
     * 班号
     */
    String cno;

    /**
     * 班级名称
     */
    String name;

    /**
     * 学院名称
     */
    String academicName;
}
