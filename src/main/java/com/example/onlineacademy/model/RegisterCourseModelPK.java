package com.example.onlineacademy.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class RegisterCourseModelPK implements Serializable {
    @Column(name = "courseId", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    @Column(name = "userId", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
}
