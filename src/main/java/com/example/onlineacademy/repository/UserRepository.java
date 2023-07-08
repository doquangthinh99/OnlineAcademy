package com.example.onlineacademy.repository;

import com.example.onlineacademy.model.UsersModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UsersModel,Integer> {
    List<UsersModel> findUserByEmail(String email);
}
