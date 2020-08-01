package com.cp.board.service;

import com.cp.board.dto.BoardDTO;
import com.cp.board.dto.ResponseDTO;
import com.cp.board.dto.WriteRequestDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {
    WriteRequestDTO writePost(WriteRequestDTO post);
    Long deletePost(Long id);
    BoardDTO viewPost(Long id);
    BoardDTO updatePostCount(Long id);
}
