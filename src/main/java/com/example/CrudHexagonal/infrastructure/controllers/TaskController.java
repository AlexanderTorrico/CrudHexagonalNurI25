package com.example.CrudHexagonal.infrastructure.controllers;


import com.example.CrudHexagonal.application.useCases.TaskUseCase;
import com.example.CrudHexagonal.domain.model.TaskModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/task")
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
