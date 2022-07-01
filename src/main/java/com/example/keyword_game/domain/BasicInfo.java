package com.example.keyword_game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Getter //값타입은 변경 불가능하게 설계(Setter를 만들지 않음)
public class BasicInfo {
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;

    protected BasicInfo(){

    }

    public BasicInfo(LocalDateTime insertDate, LocalDateTime updateDate) {
        this.insertDate = insertDate;
        this.updateDate = updateDate;
    }

}
