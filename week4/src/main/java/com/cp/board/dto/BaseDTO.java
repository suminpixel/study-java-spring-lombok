package com.cp.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BaseDTO {
    private long id;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;

    public BaseDTO(long id, LocalDateTime createAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
    }
}
