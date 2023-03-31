package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;

import java.util.List;

public interface IProjectService {
     Project addProject (Project project);

     List<Project> getAllCurrentProject() ;
     void getNbrSprintByCurrentProject();
}
