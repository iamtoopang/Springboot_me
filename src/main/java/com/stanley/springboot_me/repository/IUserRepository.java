package com.stanley.springboot_me.repository;

import com.stanley.springboot_me.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Integer> {
}
