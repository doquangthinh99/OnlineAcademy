package com.example.onlineacademy.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class RatingDetailModelPK implements Serializable {
    @Column(name = "courseId", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    @Column(name = "userId", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingDetailModelPK that = (RatingDetailModelPK) o;
        return courseId == that.courseId && userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, userId);
    }
}
