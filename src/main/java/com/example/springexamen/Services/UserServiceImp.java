package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.Role;
import com.example.springexamen.Entites.User;
import com.example.springexamen.Repositories.ProjectRepository;
import com.example.springexamen.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements IUserService{
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public void assignProjectToUser(int projectId, int userId) {
            Project project = projectRepository.findById(projectId).orElse(null);
            User user = userRepository.findById(userId).orElse(null);
        Assert.notNull(project);
        Assert.notNull(user);
        user.getProjects().add(project);
        userRepository.save(user);
    }

    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {
        User client = userRepository.findByFirstNameAndLastName(firstName,lastName);
        Project project = projectRepository.findById(projectId).orElse(null);
        Assert.notNull(client);
        Assert.notNull(project);
        client.getClientProjects().add(project);
        userRepository.save(client);

    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
        return userRepository.findByFirstNameAndLastNameAndRole(fName,lName, Role.SCRUM_MASTER).getProjects();
    }
}
