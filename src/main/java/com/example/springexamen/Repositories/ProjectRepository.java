package com.example.springexamen.Repositories;

import com.example.springexamen.Entites.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    List<Project> findBySprintsStartDateAfter(LocalDate currentDate);
}
