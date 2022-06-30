package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Remark {
    @Id
    @GeneratedValue
    @Column(name = "remark_id")
    private Long id;
    @Column(name = "remark_what")
    private RemarkWhat remarkWhat;
    @Column(name="remark_what_id")
    @JoinColumns({@JoinColumn(name = "answer_id"), @JoinColumn(name="keyword_id"), @JoinColumn(name="subject_id")})
    private Long remarkWhatId;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @Embedded
    private BasicInfo basicInfo;

}
