package com.example.keyword_game.domain.myinfo;

import com.example.keyword_game.domain.BasicInfo;
import com.example.keyword_game.domain.enumpack.RemarkWhat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Remark {
    @Id
    @GeneratedValue
    @Column(name = "remark_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private RemarkWhat remarkWhat;
    @JoinColumns({@JoinColumn(name = "answer_id"), @JoinColumn(name="keyword_id"), @JoinColumn(name="subject_id")})
    private Long remarkWhatId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    @Embedded
    private BasicInfo basicInfo;

}
