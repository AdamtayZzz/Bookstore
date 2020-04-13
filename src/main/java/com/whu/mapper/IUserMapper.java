package com.whu.mapper;

import com.whu.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
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
     * 根据name字段修改password
     * @param user User对象
     * @return
     */
    public int pwChange(User user);
}
