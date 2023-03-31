package com.example.springexamen.Repositories;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.Sprint;
import com.example.springexamen.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface SprintRepository extends JpaRepository<Sprint,Integer> {
    // current project here not in project repo
    //List<Project> findBy

}
