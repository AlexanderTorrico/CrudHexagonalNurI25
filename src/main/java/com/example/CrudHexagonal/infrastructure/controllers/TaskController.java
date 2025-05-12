package com.example.CrudHexagonal.infrastructure.controllers;


import com.example.CrudHexagonal.application.useCases.TaskUseCase;
import com.example.CrudHexagonal.domain.model.TaskModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    private final TaskUseCase taskUseCase;

    @GetMapping
    public List<TaskModel> getAll(){
        return taskUseCase.getAll();
    }

    @PostMapping
    public TaskModel save(@RequestBody TaskModel taskModel){
        return taskUseCase.save(taskModel);
    }
}
