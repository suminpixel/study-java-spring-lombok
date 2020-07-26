package com.cp.bbs.service;

import com.cp.bbs.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface BbsService {
    Page<Board> getList(Pageable pageable);
    //Pageable page = PageRequest.of(0, 10);
}
