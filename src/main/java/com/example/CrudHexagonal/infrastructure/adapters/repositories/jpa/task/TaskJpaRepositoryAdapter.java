package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.task;

import com.example.CrudHexagonal.domain.model.TaskModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskJpaRepositoryAdapter implements BaseRepository<TaskModel> {
    private final TaskJpaRepository taskJpaRepository;
    private final TaskMapper taskMapper;

    @Override
    public List<TaskModel> getAll() {
        List<TaskEntity> entities = taskJpaRepository.findAll();
        return taskMapper.toModels(entities);
    }

    @Override
    public TaskModel getById(Long id) {
        TaskEntity taskEntity = taskJpaRepository.findById(id).get();
        return taskMapper.toModel(taskEntity);
    }

    @Override
    public TaskModel save(TaskModel taskModel) {
        System.out.println(taskModel.toString());
        TaskEntity taskEntity = taskJpaRepository.save(
                taskMapper.toEntity(taskModel)
        );

        return taskMapper.toModel(taskEntity);
    }

    @Override
    public TaskModel update(TaskModel taskModel) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
