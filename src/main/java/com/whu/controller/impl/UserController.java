package com.whu.controller.impl;

import com.whu.pojo.Cart;
import com.whu.pojo.User;
import com.whu.service.IUserService;
import com.whu.utils.Result;
import com.whu.controller.IUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController implements IUserController {

    IUserService userService;
    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @PostMapping("/user/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String name=requestUser.getUsername();
        User user=userService.get(name);
        if(user!=null&&requestUser.getPassword().equals(user.getPassword()))
            return new Result(200);
        else
            return new Result(400);

    }

    @CrossOrigin
    @PostMapping("/user/register")
    @ResponseBody
    @Override
    public Result register(@RequestBody User requestUser) {
        int result=userService.add(requestUser);
        if(result!=0)
            return new Result(200);
        else
            return new Result(400);
    }


    @CrossOrigin
    @PostMapping("/user/pwChange")
    @ResponseBody
    @Override
    public Result pwChange(@RequestBody User requestUser) {
        int result=userService.updatePw(requestUser);
        if(result!=0)
            return new Result(200);
        else
            return new Result(400);
    }

    @CrossOrigin
    @PostMapping("/user/add")
    @ResponseBody
    @Override
    public Result addCart(@RequestBody Cart cart) {
        int result=userService.addCart(cart);
        if(result!=0)
            return new Result(200);
        else
            return new Result(400);
    }


    @CrossOrigin
    @PostMapping("/cart/check")
    @ResponseBody
    @Override
    public Result check(@RequestBody int user_id) {
        int result=userService.check(user_id);
        if(result!=0)
            return new Result(200);
        else
            return new Result(400);
    }
}
