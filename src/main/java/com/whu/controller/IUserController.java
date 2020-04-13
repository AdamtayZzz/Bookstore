package com.whu.controller;

import com.whu.pojo.Cart;
import com.whu.pojo.User;
import com.whu.utils.Result;

public interface IUserController {

    /**
     * 登陆
     * @param requestUser
     * @return
     */
    public Result login(User requestUser);

    /**
     * 注册
     * @param requestUser
     * @return
     */
    public Result register(User requestUser);

    /**
     * 修改密码
     * @param requestUser
     * @return
     */
    public Result pwChange(User requestUser);

    /**
     * 添加购物车
     * @param cart
     * @return
     */
    public Result addCart(Cart cart);

    /**
     * 清空购物车
     * @param user_id
     * @return
     */
    public Result check(int user_id);
}
