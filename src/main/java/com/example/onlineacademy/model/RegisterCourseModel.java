package com.example.onlineacademy.model;

import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "register_course", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
@jakarta.persistence.IdClass(com.example.onlineacademy.model.RegisterCourseModelPK.class)
public class RegisterCourseModel {
    //@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "courseId", nullable = false)
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    //@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "userId", nullable = false)
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "isFavorite", nullable = false)
    private byte isFavorite;

    public byte getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(byte isFavorite) {
        this.isFavorite = isFavorite;
    }
}
