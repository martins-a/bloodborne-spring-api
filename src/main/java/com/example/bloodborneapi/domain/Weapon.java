package com.example.bloodborneapi.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Weapon {

    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private int physical_attack;

    public Weapon(String name, int physical_attack) {
        this.name = name;
        this.physical_attack = physical_attack;
    }
}
