package com.example.springexamen;

import com.example.springexamen.Entites.Project;
import com.example.springexamen.Services.IProjectService;
import com.example.springexamen.Services.ProjectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringExamenApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringExamenApplication.class, args);

    }

}
