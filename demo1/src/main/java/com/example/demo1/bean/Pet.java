package com.example.demo1.bean;

public class Pet {
    private String cat;
    private  User user;

    @Override
    public String toString() {
        return "Pet{" +
                "cat='" + cat + '\'' +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pet() {
    }

    public Pet(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}
