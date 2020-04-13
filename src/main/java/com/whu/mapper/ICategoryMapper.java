package com.whu.mapper;

import com.whu.pojo.Category;

import java.util.List;

public interface ICategoryMapper {
    /**
     * 根据类别查找
     * @param id 类型号
     * @return Category
     */
    public Category getByCategory(int id);

}
