package com.example.SpringCrud.reposotories;

import com.example.SpringCrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // pas besoin d'implémenter quoi que ce soit ici
}
