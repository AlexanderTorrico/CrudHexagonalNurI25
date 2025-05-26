package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.user;

import com.example.CrudHexagonal.domain.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapper {

    public List<UserModel> toModels(List<UserEntity> userEntities){
        return userEntities.stream().map(this::toModel).toList();
    }

    public UserModel toModel(UserEntity userEntity){
        return new UserModel(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getLastName(),
                userEntity.getAddress(),
                userEntity.getEmail(),
                userEntity.getPassword()
        );
    }

    public UserEntity toEntity(UserModel userModel){
        return new UserEntity(
                userModel.getId(),
                userModel.getName(),
                userModel.getLastName(),
                userModel.getAddress(),
                userModel.getEmail(),
                userModel.getPassword()
        );
    }
}
