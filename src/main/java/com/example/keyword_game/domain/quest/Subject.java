package com.example.keyword_game.domain.quest;

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
    private String contents;

    // 카테고리의 계층구조 표현 >> 다른 Entity가 아닌 나 자신을 연결하면 됌
    // 1. parent: 부모 카테고리로 N:1(부모) 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Subject parent;
    // 2. child: 자식 카테고리로 1:N(자식) 연결
    @OneToMany(mappedBy = "parent")
    private List<Subject> child = new ArrayList<>();
}
