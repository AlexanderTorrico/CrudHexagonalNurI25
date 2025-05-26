package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.task;

import com.example.CrudHexagonal.domain.model.TaskModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.user.UserEntity;
import com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.user.UserJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskJpaRepositoryAdapter implements BaseRepository<TaskModel> {
    private final TaskJpaRepository taskJpaRepository;
    private final UserJpaRepository userJpaRepository;
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
        UserEntity userEntity = userJpaRepository.findById(taskModel.getUserId()).get();

        TaskEntity taskEntity = taskJpaRepository.save(
                taskMapper.toEntity(taskModel, userEntity)
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
