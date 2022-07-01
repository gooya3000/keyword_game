package com.example.keyword_game.domain.myinfo;

import com.example.keyword_game.domain.BasicInfo;
import com.example.keyword_game.domain.enumpack.Status;
import com.example.keyword_game.domain.quest.Keyword;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class History {
    @Id @GeneratedValue
    @Column(name="history_id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "keyword_id")
    private Keyword keyword;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Embedded
    private BasicInfo basicInfo;

}
