package com.cp.board.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDTO extends BaseDTO implements Serializable {

    @NotNull
    private String name;
    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private long viewCount;

    @Builder
    public BoardDTO(long id, LocalDateTime createAt, LocalDateTime updatedAt, String name, String title, String content, long viewCount) {
        super(id, createAt, updatedAt);
        this.name = name;
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
    }



}
