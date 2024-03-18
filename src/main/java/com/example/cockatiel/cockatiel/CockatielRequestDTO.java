package com.example.cockatiel.cockatiel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CockatielRequestDTO(
        @NotBlank
        String name,

        String image,
        @Pattern(regexp = "\\d{1,2}")
        Integer age,
        Gender gender,

        Mutation mutation)
        {
}
