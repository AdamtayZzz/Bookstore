package com.whu.service;

import com.whu.pojo.Cart;
import com.whu.pojo.User;

public interface IUserService {
    /**
     * 插入用户
     * @param user 新User对象
     * @return
     */
    public int add(User user);

    /**
     * 根据name字段得到User对象
     * @param name 用户名
     * @return
     */
    public User get(String name);

    /**
     * 修改密码 与controller层函数名不同
     * 匹配事务控制 的 通配
     * @param user
     * @return
     */
    public int updatePw(User user);

    /**
     * 用户 清空购物车 购买
     * @param id
     * @return
     */
    public int check(int id);

    /**
     * 添加到购物车
     * @param cart Cart实例
     * @return
     */
    public int addCart(Cart cart);
}
