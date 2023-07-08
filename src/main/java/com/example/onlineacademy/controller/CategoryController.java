package com.example.onlineacademy.controller;

import com.example.onlineacademy.model.CategoryModel;
import com.example.onlineacademy.repository.CategoryRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    CategoryRepository repo;
    @PersistenceContext
    EntityManager em;
    @GetMapping(value = "/category")
    public ResponseEntity<Object> getAllCategory(){
        List<Map<String,Object>> respond = new ArrayList<>();
        List<CategoryModel> categoryModelList = (List<CategoryModel>) repo.findAll();
        for (int i = 0; i < categoryModelList.size(); i++) {
            Map<String,Object> temp = new HashMap<>();
            temp.put("name",categoryModelList.get(i).getCategoryName());
            temp.put("id",categoryModelList.get(i).getId());
            respond.add(temp);
        }
        return new ResponseEntity<>(respond, HttpStatus.OK);
    }
    @GetMapping(value = "/category/hot-courses/{id}")
    public ResponseEntity<Object> getCoursesWithCategoryId(@PathVariable int id){
        Query emQuery = em.createQuery("SELECT c \n" +
                "FROM CourseModel c, SubCategoryModel s\n" +
                "WHERE s.categoryId ="+ id+" and c.subCategoryId = s.id ");
        return new ResponseEntity<>(emQuery.getResultList(),HttpStatus.OK);
    }

}
