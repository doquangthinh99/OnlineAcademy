package com.example.onlineacademy.repository;

import com.example.onlineacademy.model.CourseContentModel;
import com.example.onlineacademy.model.UsersModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseContentRepository extends CrudRepository<CourseContentModel, Integer> {
    List<CourseContentModel> findCourseContentModelsByCourseId(int id);
}
