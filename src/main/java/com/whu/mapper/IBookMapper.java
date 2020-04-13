package com.whu.mapper;

import com.whu.pojo.Book;
import org.apache.ibatis.annotations.Param;

public interface IBookMapper {
    /**
     * 添加书本信息项
     * @param book Book实例对象
     * @return
     */
    public int add(Book book);

    /**
     * 通过书名搜索
     * @param id 书的索引
     * @return Book实例
     */
    public Book getById(int id);


    /**
     * 更新书本内容（除书名外的信息）
     * @param book 实例对象
     * @return
     */
    public int update(Book book);

    /**
     * 删除书本信息
     * @param id 书的索引
     * @return
     */
    public int delete(int id);
}
