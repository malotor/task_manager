package com.malotor.taskmanager.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String username;
    private String name;
    private String surname;
    private String email;

    @Transient
    @JsonIgnore
    private UserId userId;


    public User(String username, String name, String surname, String email) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    protected User() {};

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public UserId getUserId() {

        if (null == userId) {
            userId = new UserId(this.getId().toString());
        }

        return userId;
    }

    public Task createNewTask(String name, String description, Date dueDate)
    {
        return new Task(name,description,dueDate, getUserId());
    }

}
