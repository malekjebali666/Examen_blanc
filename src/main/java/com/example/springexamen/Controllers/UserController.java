package com.example.springexamen.Controllers;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Entites.User;
import com.example.springexamen.Services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final IUserService userService;
    // tested
    @PostMapping
    public User addUser (@RequestBody  User user){
        return userService.addUser(user);
    }
    //tested
    @PutMapping("/{projectId}/{userId}")
    public void assignProjectToUser (@PathVariable int projectId,@PathVariable int userId){
         userService.assignProjectToUser(projectId,userId);
    }
    //tested
    @PutMapping("/{projectId}/{firstName}/{lastName}")
    public void assignProjectToClient(@PathVariable int projectId, @PathVariable String firstName, @PathVariable String lastName){
        userService.assignProjectToClient(projectId,firstName,lastName);
    }
    //tested
    @GetMapping("/{fName}/{lName}")
    public List<Project> getProjectsByScrumMaster(@PathVariable String fName,@PathVariable String lName){
        return userService.getProjectsByScrumMaster(fName,lName);
    }
}
