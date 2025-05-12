package com.example.CrudHexagonal.application.useCases;

import com.example.CrudHexagonal.domain.model.TaskModel;
import com.example.CrudHexagonal.domain.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUseCase {
    private final TaskRepository taskRepository;

    public TaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskModel> getAll(){
        return taskRepository.getAll();
    }

    public TaskModel getById(Long id){
        return taskRepository.getById(id);
    }

    public TaskModel save(TaskModel taskModel){
        return taskRepository.save(taskModel);
    }

}
