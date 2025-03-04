package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Friend {
    @Id
    private Long id;
    private String name;
}
