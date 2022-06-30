package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Subject {
    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private Long id;
    private String subject;
    @OneToMany(mappedBy = "subject")
    private List<Answer> answers = new ArrayList<>();
}
