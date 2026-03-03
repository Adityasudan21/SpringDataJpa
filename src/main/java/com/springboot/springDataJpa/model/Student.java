package com.springboot.springDataJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Entity
@Component
@Scope("prototype")
public class Student {
    @Id
    private int rollno;
    private String name;
    private int marks;
}
