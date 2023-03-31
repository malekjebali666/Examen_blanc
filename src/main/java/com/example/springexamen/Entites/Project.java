package com.example.springexamen.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private String description;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "projects")
    @JsonIgnore
    private List<User> intervenants;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "project")
    private List<Sprint> sprints;

}
