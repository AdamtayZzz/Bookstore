package com.whu.service;

import com.whu.pojo.Book;

import java.util.List;

public interface IBookService {
    /**
     * 通过类型查找
     * @param id
     */
    public List<Book> getByCategory(int id);

    /**
     * 通过书名查找
     * @param id 书的索引
     * @return
     */
    public Book getById(int id);

    /**
     * 添加书籍信息
     * @param book
     * @return
     */
    public int add(Book book);


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
