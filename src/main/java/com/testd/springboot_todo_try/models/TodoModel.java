package com.testd.springboot_todo_try.models;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

import lombok.Data;


@Data
//@Entity
public class TodoModel {

    private String id;

    private String title;

    private String desc;

    private boolean isCompleted;

    public TodoModel(String id, String title, String desc, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.isCompleted = isCompleted;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
