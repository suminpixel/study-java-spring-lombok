package com.cp.bbs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_boards")
@NoArgsConstructor
@Builder
public class Board extends Auditing implements Serializable { //constructor 만드는 법 commend + n

    private String title;
    private String contents;
    private String name;
    private String file;

    @Builder
    public Board(String title, String contents, String name, String file) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.file = file;
    }


    /*
    @Builder
    public Board(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    */
}
