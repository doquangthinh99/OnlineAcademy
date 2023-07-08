package com.example.onlineacademy.model;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "rating_detail", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
@IdClass(com.example.onlineacademy.model.RatingDetailModelPK.class)
public class RatingDetailModel {
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "courseId", nullable = false)
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "userId", nullable = false)
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "rating", nullable = true)
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 45)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
