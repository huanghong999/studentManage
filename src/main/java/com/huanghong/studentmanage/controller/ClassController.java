package com.huanghong.studentmanage.controller;

import com.huanghong.studentmanage.pojo.Clazz;
import com.huanghong.studentmanage.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clazz")
@Slf4j
public class ClassController {
    @Autowired
    private ClazzService clazzService;

    /**
     * 插入班级
     *
     * @param clazz 班级信息
     * @return 是否插入成功
     */
    @PostMapping
    public Long insert(@RequestBody Clazz clazz) {
        log.info("[clazz] insert clazzId={},name={}", clazz.getId(), clazz.getName());
        clazzService.insertClazz(clazz);
        return clazz.getId();
    }


    @GetMapping
    public Clazz find(@RequestParam Long id) {
        Clazz clazz = clazzService.findClazz(id);
        return clazz;
    }

    @GetMapping("/list")
    public List<Clazz> list() {
        log.info("查询所有班级信息...");
        List<Clazz> clazzs = clazzService.list();
        return clazzs;
    }

    @DeleteMapping
    public void deleteClazz(@RequestParam Long id) {
        log.info("开始删除班级，班级id等于{}", id);
        clazzService.deleteClazz(id);
    }


    @PutMapping
    public void updateClazz(@RequestParam Long id, String name) {
        log.info("根据班级id{}修改班级名称{}", id, name);
        clazzService.updateClazz(id, name);
    }


}
