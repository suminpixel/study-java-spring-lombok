package com.cp.bbs;

import com.cp.bbs.service.BbsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.swing.*;

@SpringBootTest
public class BbsTest {
    @Autowired
    private BbsService bbsService; //tip: alt + enter 로 인터페이스 만들기

    @Test
    void 페이징_가능한_리스트(){

        //Pageable page = PageRequest.of(0, 10);
        //this.bbsService.getList(page);
    }

}
