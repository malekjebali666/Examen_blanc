package com.example.springexamen.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String email;
    private String pwd;
    private String firstName;
    private String lastName;
    private Role role;
    @ManyToMany
    private List<Project> projects ;
    @OneToMany
    @JsonIgnore
    private List<Project> clientProjects;

}
