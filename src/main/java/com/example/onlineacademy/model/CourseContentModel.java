package com.example.onlineacademy.model;

import jakarta.persistence.Entity;

import java.sql.Timestamp;

@Entity
@jakarta.persistence.Table(name = "course_content", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
public class CourseContentModel {
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "courseId", nullable = false)
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "isPreview", nullable = false)
    private byte isPreview;

    public byte getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(byte isPreview) {
        this.isPreview = isPreview;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "content", nullable = true, length = 255)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "video", nullable = true, length = 255)
    private String video;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "isDeleted", nullable = false)
    private byte isDeleted;

    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "lastUpdated", nullable = false)
    private Timestamp lastUpdated;

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
