package com.example.SpringCrud.controllers;

import com.example.SpringCrud.entities.User;
import com.example.SpringCrud.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/add")
    public ResponseEntity<String> addUserViaGet(
            @RequestParam String nom,
            @RequestParam String adressemail,
            @RequestParam String password
    ) {
        User user = new User();
        user.setNom(nom);
        user.setAdressemail(adressemail);
        user.setPassword(password);

        userService.save(user);

        return ResponseEntity.ok("Utilisateur ajouté avec succès : " + nom);
    }


    @PostMapping
    public void adduser(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody User u) {
        userService.delete(u);
    }
}
