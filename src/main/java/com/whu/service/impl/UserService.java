package com.whu.service.impl;

import com.whu.mapper.ICartMapper;
import com.whu.mapper.IUserMapper;
import com.whu.pojo.Cart;
import com.whu.pojo.User;
import com.whu.service.IUserService;

import java.util.List;


public class UserService implements IUserService {
    IUserMapper userMapper;
    ICartMapper cartMapper;

    public void setCartMapper(ICartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    public void setUserMapper(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public User get(String name) {

        return userMapper.get(name);
    }

    @Override
    public int updatePw(User user) {
        return userMapper.pwChange(user);
    }

    @Override
    public int check(int id) {
        List<Cart> carts=cartMapper.list(id);
        int length=carts.size();
        double count=0;
        for(Cart cart:carts){
            count+=cart.getPrice()*cart.getQuantity();//cost sum
            //quantity和book_id插入订单表 订单号
        }

        return length;
    }

    @Override
    public int addCart(Cart cart) {
        return cartMapper.add(cart);
    }
}
