package com.stanley.springboot_me.service;

import com.stanley.springboot_me.pojo.User;
import com.stanley.springboot_me.pojo.dto.UserDto;
import com.stanley.springboot_me.repository.IUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 這是一個服務層 用於業務邏輯處理 加了之後就能成為Spring容器中的一個bean
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User add(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new IllegalArgumentException("用戶不存在，參數異常");
        });
    }

    @Override
    public User edit(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
