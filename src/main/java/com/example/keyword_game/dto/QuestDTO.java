package com.example.keyword_game.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter @ToString
public class QuestDTO {
    //Subject 0 / Answer 1 / Keyword 2
    private int questType;
    @NotBlank(message = "필수 입력 항목입니다.")
    private String questName;
    private String questContents;
}
