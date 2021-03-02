package com.example.kbtg.user;

import java.util.Objects;

public class UserResponse {
    private Integer id;
    private String name;
    private Integer age;

    public UserResponse() {
    }

    public UserResponse(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse response = (UserResponse) o;
        return Objects.equals(id, response.id) &&
                Objects.equals(name, response.name) &&
                Objects.equals(age, response.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

}