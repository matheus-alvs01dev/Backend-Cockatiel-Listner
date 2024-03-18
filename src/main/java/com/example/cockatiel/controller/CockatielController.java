package com.example.cockatiel.controller;



import com.example.cockatiel.cockatiel.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("cockatiel")

public class CockatielController {

    @RequestMapping(value = "", method = RequestMethod.OPTIONS)
    @ResponseStatus(HttpStatus.OK)
    public void handleOptions() {
    }


    @Autowired
    private CockatielRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders="*")
    @PostMapping
    public void saveCockatiel(@RequestBody CockatielRequestDTO data){

        Cockatiel cockatielData = new Cockatiel(data);
        repository.save(cockatielData);

    }
    @CrossOrigin(origins = "*", allowedHeaders="*")
    @GetMapping
    public List<CockatielResponseDTO> getAll(){

        List<CockatielResponseDTO> cockatielList = repository.findAll().stream().map(CockatielResponseDTO::new).toList();
        return cockatielList;
    }

    @CrossOrigin(origins = "*", allowedHeaders="*")
    @PutMapping
    @Transactional
    public void updateCockatiel(@RequestBody @Validated CockatielUpdateDTO data){
        var cockatiel = repository.getReferenceById(data.id());
        cockatiel.updateInfo(data);

    }
    @CrossOrigin(origins = "*", allowedHeaders="*")
    @DeleteMapping("/{id}")
    @Transactional
    public void deleteCockatiel(@PathVariable UUID id){
        repository.deleteById(id);
    }
}
