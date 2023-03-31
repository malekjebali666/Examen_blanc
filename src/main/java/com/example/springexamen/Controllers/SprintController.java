package com.example.springexamen.Controllers;

import com.example.springexamen.Entites.Sprint;
import com.example.springexamen.Services.ISprintService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("sprint")
public class SprintController {
    private final ISprintService sprintService;
    @PostMapping
    public Sprint addSprint(@RequestBody Sprint sprint){
        return sprintService.addSprint(sprint);
    }
    //tested
    @PostMapping("/{idProject}")
    public void addSprintAndAssignToProject(@RequestBody Sprint sprint, @PathVariable int idProject){
        sprintService.addSprintAndAssignToProject(sprint,idProject);
    }
}
