package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.task;

import com.example.CrudHexagonal.domain.model.TaskModel;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskMapper {

    public List<TaskModel> toModels(List<TaskEntity> taskEntities){
        return taskEntities.stream()
                            .map(taskEntity -> toModel(taskEntity))
                    .toList();
    }

    public TaskModel toModel(TaskEntity taskEntity){
        return new TaskModel(
            taskEntity.getId(),
            taskEntity.getTitle(),
            taskEntity.getDescription(),
            taskEntity.isDone()
        );
    }

    public TaskEntity toEntity(TaskModel taskModel){
        return new TaskEntity(
                taskModel.getId(),
                taskModel.getTitle(),
                taskModel.getDescription(),
                taskModel.isDone()
        );
    }
}
