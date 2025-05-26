package com.example.CrudHexagonal.domain.repositories;

import com.example.CrudHexagonal.domain.model.TaskModel;

import java.util.List;

public interface TaskRepository {

    public List<TaskModel> getAll();

    public TaskModel getById(Long id);

    public TaskModel save(TaskModel taskModel);

}
