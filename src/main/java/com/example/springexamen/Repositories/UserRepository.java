package com.example.springexamen.Repositories;

import com.example.springexamen.Entites.Role;
import com.example.springexamen.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByFirstNameAndLastName(String firstName, String lastName);
    User findByFirstNameAndLastNameAndRole(String firstName, String lastName, Role role);


}
