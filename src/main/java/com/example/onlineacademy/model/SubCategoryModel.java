package com.example.onlineacademy.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "sub_category", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
public class SubCategoryModel {
    @Basic
    @Column(name = "categoryId", nullable = false)
    private int categoryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "subCategoryName", nullable = false, length = 255)
    private String subCategoryName;
    @Basic
    @Column(name = "isDeleted", nullable = false)
    private byte isDeleted;
    @Basic
    @Column(name = "lastUpdated", nullable = true)
    private Timestamp lastUpdated;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
