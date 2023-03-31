package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.Sprint;
import com.example.springexamen.Repositories.ProjectRepository;
import com.example.springexamen.Repositories.SprintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SprintServiceImp implements ISprintService{
    private final SprintRepository sprintRepository;
    private final ProjectRepository projectRepository;
    @Override
    public Sprint addSprint(Sprint sprint) {
        sprintRepository.save(sprint);
        return sprint;
    }

    @Override
    public void addSprintAndAssignToProject(Sprint sprint, int idProject) {
        Project project = projectRepository.findById(idProject).orElse(null);
        Assert.notNull(project);
        sprint.setProject(project);
        sprintRepository.save(sprint);
    }
}
