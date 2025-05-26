package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.user;

import com.example.CrudHexagonal.domain.model.UserModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserJpaRepositoryAdapter implements BaseRepository<UserModel> {
    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserModel> getAll() {
        List<UserEntity> userEntities = userJpaRepository.findAll();

        return userMapper.toModels(userEntities);
    }

    @Override
    public UserModel getById(Long id) {
        UserEntity userEntity = userJpaRepository.findById(id).get();

        return userMapper.toModel(userEntity);
    }

    @Override
    public UserModel save(UserModel userModel) {

        UserEntity userEntity = userJpaRepository.save(
                userMapper.toEntity(userModel)
        );

        return userMapper.toModel(userEntity);
    }

    @Override
    public UserModel update(UserModel userModel) {
        UserEntity userEntity = userJpaRepository.save(
                userMapper.toEntity(userModel)
        );

        return userMapper.toModel(userEntity);
    }

    @Override
    public boolean delete(Long id) {
        try {
            UserEntity userEntity = userJpaRepository.findById(id).get();
            userJpaRepository.delete(userEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
