package com.example.CrudHexagonal.application.useCases;

import com.example.CrudHexagonal.domain.model.UserModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserUseCase {

    private final BaseRepository<UserModel> userRepository;

    public UserUseCase(BaseRepository<UserModel> userRepository) {
        this.userRepository = userRepository;
    }



    public UserModel getById(Long id){
        return userRepository.getById(id);
    }

    public List<UserModel> getAll(){
        return userRepository.getAll();
    }

    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }

    public UserModel update(UserModel userModel){
        return userRepository.update(userModel);
    }

    public boolean delete(Long id){
        return userRepository.delete(id);
    }
}
