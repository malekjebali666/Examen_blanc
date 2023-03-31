package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ProjectServiceImp implements IProjectService{
    private final ProjectRepository projectRepository;
    @Override
    @Transactional
    public Project addProject(Project project) {
        projectRepository.save(project);
        return project;
    }

    @Override
    public List<Project> getAllCurrentProject() {
        return projectRepository.findBySprintsStartDateAfter(LocalDate.now());
    }

    @Override
    @Transactional
    @Scheduled(fixedRate = 30000)
    public void getNbrSprintByCurrentProject() {
        List<Project> projects= getAllCurrentProject();
        for (var p: projects) {
            if(p.getSprints() != null){
                log.info("le nombre des sprints pour le projet"+p.getTitle() + "est :"+p.getSprints().size());
            }else {
                log.info("le nombre des sprints pour le projet"+p.getTitle() + "est :0");

            }
        }
    }

}
