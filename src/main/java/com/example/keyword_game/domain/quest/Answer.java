package com.example.keyword_game.domain.quest;

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
    private int frequency;
    @OneToMany(mappedBy = "answer")
    private List<Keyword> keywords = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private int keywordCount;
    private String contents;

}
