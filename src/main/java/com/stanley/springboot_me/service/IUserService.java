package com.stanley.springboot_me.service;

import com.stanley.springboot_me.pojo.User;
import com.stanley.springboot_me.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 新增用戶
     *
     * @param user The user to add.
     * @return The added user.
     */
    User add(UserDto user);

    /**
     * 獲取用戶
     *
     * @param userId The user ID.
     * @return The user.
     */
    User getUser(Integer userId);
    /**
     * 修改用戶
     *
     * @param user The user to edit.
     * @return The edited user.
     */
    User edit(UserDto user);
    /**
     * 刪除用戶
     *
     * @param userId The user ID.
     * @return The deleted user.
     */
    void deleteUser(Integer userId);
}
