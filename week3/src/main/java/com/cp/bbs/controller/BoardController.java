package com.cp.bbs.controller;

import com.cp.bbs.model.Board;
import com.cp.bbs.service.BbsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    final private BbsService bbsService;
    @GetMapping
    public Page<Board> getList(@PageableDefault Pageable pageable){
        return this.bbsService.getList(pageable);
    }
}
