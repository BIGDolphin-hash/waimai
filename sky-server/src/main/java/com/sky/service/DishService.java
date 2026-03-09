package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DishService {


    /**
     * 新增菜品和对应口味
     * @param dishDTO
     * @return
     */
    public void saveWithFlavor(@RequestBody DishDTO dishDTO);


    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品的批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
