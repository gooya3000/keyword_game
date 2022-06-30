package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;
    private String userName;
    private String userId;
    private String userPw;
    @OneToMany(mappedBy = "member")
    private List<Remark> remarks = new ArrayList<>();
    @OneToMany(mappedBy = "member")
    private List<History> histories = new ArrayList<>();
    @Embedded
    private BasicInfo basicInfo;

}
