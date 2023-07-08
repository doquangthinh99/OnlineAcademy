package com.example.onlineacademy.model;

import jakarta.persistence.Entity;

import java.sql.Timestamp;

@Entity
@jakarta.persistence.Table(name = "course", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
public class CourseModel {
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
    @jakarta.persistence.Column(name = "courseName", nullable = false, length = 80)
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "subCategoryId", nullable = false)
    private int subCategoryId;

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "teacherId", nullable = false)
    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "imageThumbnail", nullable = true, length = 255)
    private String imageThumbnail;

    public String getImageThumbnail() {
        return imageThumbnail;
    }

    public void setImageThumbnail(String imageThumbnail) {
        this.imageThumbnail = imageThumbnail;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "imageCourse", nullable = true, length = 255)
    private String imageCourse;

    public String getImageCourse() {
        return imageCourse;
    }

    public void setImageCourse(String imageCourse) {
        this.imageCourse = imageCourse;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "price", nullable = false)
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "salePrice", nullable = true)
    private Integer salePrice;

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "rating", nullable = false, precision = 0)
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "ratingCount", nullable = false)
    private int ratingCount;

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "studentCount", nullable = false)
    private int studentCount;

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "detailShort", nullable = true, length = 255)
    private String detailShort;

    public String getDetailShort() {
        return detailShort;
    }

    public void setDetailShort(String detailShort) {
        this.detailShort = detailShort;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "detailLong", nullable = true, length = -1)
    private String detailLong;

    public String getDetailLong() {
        return detailLong;
    }

    public void setDetailLong(String detailLong) {
        this.detailLong = detailLong;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "isCompleted", nullable = true)
    private Byte isCompleted;

    public Byte getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Byte isCompleted) {
        this.isCompleted = isCompleted;
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
    @jakarta.persistence.Column(name = "lastUpdated", nullable = true)
    private Timestamp lastUpdated;

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "createdDate", nullable = true)
    private Timestamp createdDate;

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}
