package com.huanghong.studentmanage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huanghong.studentmanage.pojo.Clazz;

import java.util.List;

/**
 * 班级Service
 */
public interface ClazzService extends IService<Clazz> {
    /**
     * 创建班级
     *
     * @param clazz 班级对象
     */
    void insertClazz(Clazz clazz);

    /**
     * 查询班级
     *
     * @param id 班级编号
     */
    Clazz findClazz(Long id);

    /**
     * 查询所有班级
     *
     * @return 所有班级信息
     */
    List<Clazz> list();

    /**
     * 根据班级id删除班级信息
     *
     * @param id 班级id
     */
    void deleteClazz(Long id);

    /**
     * 根据班级id修改班级名称
     *
     * @param id   班级id
     * @param name 班级名称
     */
    void updateClazz(Long id, String name);


}
