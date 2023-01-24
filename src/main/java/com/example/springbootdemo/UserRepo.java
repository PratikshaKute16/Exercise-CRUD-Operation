package com.example.springbootdemo;

import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User, Integer> {

}

