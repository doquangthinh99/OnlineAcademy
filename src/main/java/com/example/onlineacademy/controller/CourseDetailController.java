package com.example.onlineacademy.controller;

import com.example.onlineacademy.model.CourseContentModel;
import com.example.onlineacademy.model.CourseModel;
import com.example.onlineacademy.repository.CourseContentRepository;
import com.example.onlineacademy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class CourseDetailController {
    @Autowired private CourseRepository courseRepository;
    @Autowired private CourseContentRepository courseContentRepository;
    @GetMapping(value = "/course")
    public ResponseEntity<Object> getCourse(@RequestParam int id){
        Optional<CourseModel> respond =courseRepository.findById(id);
        return new ResponseEntity<>(respond, HttpStatus.OK);
    }

    @GetMapping(value = "/course-detail")
    public ResponseEntity<Object> getCourseContent(@RequestParam int courseId){
        List<CourseContentModel> respond = courseContentRepository.findCourseContentModelsByCourseId(courseId);
        return new ResponseEntity<>(respond, HttpStatus.OK);
    }

}
