package com.suminpixel.demo.api;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestDTO {

    private long id;
    private String name;

    @Builder
    public TestDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
