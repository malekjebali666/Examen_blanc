package com.example.springexamen.Controllers;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Services.IProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("project")
public class ProjectController {
    private final IProjectService projectService;
    //tested
    @PostMapping
    public Project addProject(@RequestBody Project project){
        return projectService.addProject(project);
    }
    @GetMapping
    public List<Project> getAllCurrentProject(){
        return projectService.getAllCurrentProject();
    }
}
