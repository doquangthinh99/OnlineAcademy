package com.example.onlineacademy.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users", schema = "bhjvyc4ogyzss34df0jl", catalog = "")
public class UsersModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic
    @Column(name = "refreshToken", nullable = true, length = 255)
    private String refreshToken;
    @Basic
    @Column(name = "role", nullable = false)
    private int role;
    @Basic
    @Column(name = "isDeleted", nullable = false)
    private byte isDeleted;
    @Basic
    @Column(name = "isUnlocked", nullable = false)
    private byte isUnlocked;
    @Basic
    @Column(name = "lastUpdated", nullable = true)
    private Timestamp lastUpdated;
     public UsersModel(){}
    public UsersModel(String email,String password){
        this.email = email;
        this.password = password;
        this.role = 0;
        this.isDeleted = 0;
        this.isUnlocked = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public byte getIsUnlocked() {
        return isUnlocked;
    }

    public void setIsUnlocked(byte isUnlocked) {
        this.isUnlocked = isUnlocked;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
