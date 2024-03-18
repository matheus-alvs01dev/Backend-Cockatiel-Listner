package com.example.cockatiel.cockatiel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface CockatielRepository extends JpaRepository<Cockatiel, UUID> {


    @Query("""
            select m.active
            from cockatiel m
            where
            m.id = :id
            """)
    Boolean findAtivoById(UUID id);

}
