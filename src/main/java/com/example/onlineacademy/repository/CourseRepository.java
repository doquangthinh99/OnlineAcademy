package com.example.onlineacademy.repository;

import com.example.onlineacademy.model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseModel,Integer> {
}
