package com.whu.mapper;

import com.whu.pojo.Cart;

import java.util.List;

public interface ICartMapper  {
    /**
     * 用户选择加入购物车相关操作
     * @param cart Cart实例对象
     */
    public int add(Cart cart);

    /**
     * 显示user_id购物车内所有的信息
     * @param user_id 用户id
     */
    public List<Cart> list(int user_id);
}
