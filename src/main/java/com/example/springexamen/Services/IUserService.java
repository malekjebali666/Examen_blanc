package com.example.springexamen.Services;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.User;

import java.util.List;

public interface IUserService {
    public User addUser (User user);
    public void assignProjectToUser (int projectId, int userId);
    public void assignProjectToClient(int projectId, String firstName, String lastName);
    public List<Project> getProjectsByScrumMaster(String fName, String lName);
}
