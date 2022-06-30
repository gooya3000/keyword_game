package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Answer {
    @Id
    @GeneratedValue
    @Column(name = "answer_id")
    private Long id;
    private String answer;
    @OneToMany(mappedBy = "answer")
    private List<Keyword> keywords = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

}
