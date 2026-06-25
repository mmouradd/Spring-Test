package com.example.SpringCrud.Service;
import com.example.SpringCrud.reposotories.UserRepository;
import com.example.SpringCrud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository   UserRepository;

    public List<User> getAll()
    {
        return UserRepository.findAll();
    }
    public void save(User u){
        UserRepository.save(u);
    }
    public void delete(User u){
        UserRepository.delete(u);
    }

}
