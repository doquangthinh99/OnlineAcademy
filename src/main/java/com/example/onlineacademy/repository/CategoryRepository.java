package com.example.onlineacademy.repository;

import com.example.onlineacademy.model.CategoryModel;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryModel,Integer> {
}
