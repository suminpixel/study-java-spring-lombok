package com.cp.board.dto;

import lombok.*;
import sun.jvm.hotspot.ci.ciMethodData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WriteRequestDTO implements Serializable {
    @NotNull(message = "이름을 입력하세요.")
    private String name;
    @NotNull(message = "제목을 입력하세요.")
    private String title;
    @NotNull(message = "내용을 입력하세요.")
    private String content;

    @Builder
    public WriteRequestDTO(@NotNull(message = "이름을 입력하세요.") String name, @NotNull(message = "제목을 입력하세요.") String title, @NotNull(message = "내용을 입력하세요.") String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }


}
