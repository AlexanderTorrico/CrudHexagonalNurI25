package com.example.CrudHexagonal.application.useCases;

import com.example.CrudHexagonal.application.dto.UserDto;
import com.example.CrudHexagonal.domain.model.UserModel;
import com.example.CrudHexagonal.domain.repositories.BaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserUseCase {

    private final BaseRepository<UserModel> userRepository;


    public UserDto getById(Long id){
        UserModel userModel = userRepository.getById(id);
        return new UserDto(
            userModel.getName(),
            userModel.getLastName(),
            userModel.getEmail(),
            userModel.getAddress()
        );
    }

    public List<UserDto> getAll(){
        List<UserModel> list = userRepository.getAll();

        return list.stream().map(u ->
                new UserDto(u.getName(), u.getLastName(), u.getEmail(), u.getAddress())
        ).toList();
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
