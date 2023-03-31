package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.Sprint;

import java.util.List;

public interface ISprintService {
    public Sprint addSprint (Sprint sprint);
    public void addSprintAndAssignToProject(Sprint sprint, int idProject);
}
