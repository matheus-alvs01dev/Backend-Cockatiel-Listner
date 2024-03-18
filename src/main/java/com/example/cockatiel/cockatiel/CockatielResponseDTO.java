package com.example.cockatiel.cockatiel;

import java.util.UUID;

public record CockatielResponseDTO(UUID id, String name, String image, Gender gender, Mutation mutation, Integer age ) {

    public CockatielResponseDTO(Cockatiel cockatiel){
        this(cockatiel.getId(), cockatiel.getName(),cockatiel.getImage(),cockatiel.getGender(),cockatiel.getMutation(), cockatiel.getAge());
    }
}
