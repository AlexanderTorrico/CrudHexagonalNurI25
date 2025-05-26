package com.example.CrudHexagonal.infrastructure.controllers;

import com.example.CrudHexagonal.application.useCases.UserUseCase;
import com.example.CrudHexagonal.domain.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> get(@PathVariable Long id){
        return ResponseEntity.ok(
                userUseCase.getById(id)
        );
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAll(){
        return ResponseEntity.ok(
                userUseCase.getAll()
        );
    }

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody UserModel userModel){
        return ResponseEntity.ok(
                userUseCase.save(userModel)
        );
    }

    @PutMapping
    public ResponseEntity<UserModel> update(@RequestBody UserModel userModel){
        return ResponseEntity.ok(
                userUseCase.update(userModel)
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userUseCase.delete(id);
    }
}
