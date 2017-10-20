package com.urban.microservices.urbanservice.domain;

import com.urban.microservices.urbanservice.dto.AccountBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private int age;

    public Account() {
    }

    public Account(AccountBuilder builder){
        this.id = builder.getId();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.email = builder.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
