package com.example.keyword_game.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class BasicInfo {
    @Column(name = "insert_date")
    private LocalDateTime insertDate;
    @Column(name = "update_date")
    private LocalDateTime updateDate;
}
