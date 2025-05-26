package com.example.CrudHexagonal.application.useCases;

import com.example.CrudHexagonal.domain.model.TaskModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import com.example.CrudHexagonal.domain.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUseCase {
    private final BaseRepository<TaskModel> taskRepository;

    public TaskUseCase(BaseRepository<TaskModel> taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskModel> getAll(){
        return taskRepository.getAll();
    }

    public TaskModel getById(Long id){
        return taskRepository.getById(id);
    }

    public TaskModel save(TaskModel taskModel){
        System.out.println("use case " + taskModel.getTitle());
        return taskRepository.save(taskModel);
    }

}
