package com.example.cockatiel.cockatiel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "cockatiels")
@Entity(name = "cockatiel")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cockatiel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Integer age;
    private String image;

    @Enumerated(EnumType.STRING)
    private Mutation mutation;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean active;


    public Cockatiel(CockatielRequestDTO data) {
        this.active = true;
        this.name = data.name();
        this.age = data.age();
        this.image = data.image();
        this.gender = data.gender();
        this.mutation = data.mutation();


    }

    public void delete() {
        this.active = false;
    }

    public void updateInfo(CockatielUpdateDTO data) {
        if (data.name() != null) {
            this.name = data.name();
        }
        if(data.age() != null) {
            this.age = data.age();
        }
        if(data.image() != null) {
            this.image = data.image();
        }
        if(data.mutation() != null) {
          this.mutation = data.mutation();
        }
    }
}
