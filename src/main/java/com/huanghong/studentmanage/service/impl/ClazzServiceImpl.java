package com.huanghong.studentmanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huanghong.studentmanage.dao.ClazzDao;
import com.huanghong.studentmanage.pojo.Clazz;
import com.huanghong.studentmanage.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzDao, Clazz> implements ClazzService {

    @Autowired
    private ClazzDao clazzDao;

    @Override
    public void insertClazz(Clazz clazz) {
        clazzDao.insertClazz(clazz);
    }

    @Override
    public Clazz findClazz(Long id) {
        Clazz clazz =clazzDao.findClazz(id);
        return clazz;
    }


    @Override
    public List<Clazz> list() {
        List<Clazz> clazzsList = clazzDao.list();
        return clazzsList;
    }

}
