package com.cicd.CICDProject.entity;

public class User {

    private long id;

    private String name;

    private String email;

    private String mobileno;

    public User() {
        super();
    }

    public User(long id, String name, String email, String mobileno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileno = mobileno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileno='" + mobileno + '\'' +
                '}';
    }
}
