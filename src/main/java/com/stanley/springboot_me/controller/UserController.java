package com.stanley.springboot_me.controller;

import com.stanley.springboot_me.pojo.ResponseMessage;
import com.stanley.springboot_me.pojo.User;
import com.stanley.springboot_me.pojo.dto.UserDto;
import com.stanley.springboot_me.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 這個類的所有方法都會返回json字符串
@RequestMapping("/user") // http://localhost:7080/user
public class UserController {

    @Autowired
    private IUserService userService;

    // REST風格
    // 增加
    @PostMapping
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user){
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }
    // 查詢
    @GetMapping("/{userId}")
    public ResponseMessage<User> get(@PathVariable("userId") Integer userId){
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    // 修改
    @PutMapping
    public ResponseMessage<User> edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }

    // 刪除
    @DeleteMapping("/{userId}")
    public ResponseMessage<User> delete(@PathVariable("userId") Integer userId){
        userService.deleteUser(userId);
        return ResponseMessage.success();
    }

}
