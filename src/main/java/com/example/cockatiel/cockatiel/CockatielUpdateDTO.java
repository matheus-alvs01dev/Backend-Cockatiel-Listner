package com.example.cockatiel.cockatiel;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CockatielUpdateDTO(
        @NotNull
        UUID id,
        String name,
        String image,
        Gender gender,
        Mutation mutation,
        Integer age) {
}
