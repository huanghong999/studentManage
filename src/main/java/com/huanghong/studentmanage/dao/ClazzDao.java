package com.huanghong.studentmanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huanghong.studentmanage.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzDao extends BaseMapper<Clazz> {
    /**
     * 插入班级信息
     * @param clazz 班级信息
     */
    void insertClazz(Clazz clazz);

    /**
     *  查询所有班级信息
     * @return 班级信息列表
     */
    List<Clazz> list();

    /**
     * 根据班级id查询班级信息
     * @param id 班级id
     * @return 班级对象
     */
    Clazz findClazz(Long id);




}
