package com.example.keyword_game.domain.myinfo;

import com.example.keyword_game.domain.BasicInfo;
import com.example.keyword_game.domain.myinfo.Member;
import com.example.keyword_game.domain.quest.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Basket {
    @Id @GeneratedValue
    @Column(name="basket_id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Answer answer;
    @Embedded
    private BasicInfo basicInfo;

}
