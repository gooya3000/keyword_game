package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class History {
    @Id @GeneratedValue
    @Column(name="history_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "keyword_id")
    private Keyword keyword;
    private Status status;
    @Embedded
    private BasicInfo basicInfo;

}
