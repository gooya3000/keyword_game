package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Basket {
    @Id @GeneratedValue
    @Column(name="basket_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
    @Embedded
    private BasicInfo basicInfo;

}
