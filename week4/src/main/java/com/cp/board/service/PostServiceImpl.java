package com.cp.board.service;

import com.cp.board.dto.BoardDTO;
import com.cp.board.dto.WriteRequestDTO;
import com.cp.board.exception.ApiException;
import com.cp.board.model.Board;
import com.cp.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.cp.board.model.ErrorCode.NOT_FOUND_DATA;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    final private BoardRepository boardRepository;
    final private ModelMapper modelMapper;

    @Override
    public WriteRequestDTO writePost(WriteRequestDTO post) {

        this.boardRepository.save(this.modelMapper.map(post, Board.class));
        return post;
    }

    @Override
    public Long deletePost(Long id) {
        this.boardRepository.deleteById(id);
        return id;
    }

    @Override
    public BoardDTO viewPost(Long id) {

        Optional<Board> post = this.boardRepository.findById(id);

        return this.modelMapper.map(post.orElseThrow(() -> new ApiException(NOT_FOUND_DATA)), BoardDTO.class);
    }

    @Override
    public BoardDTO updatePostCount(Long id) {

        BoardDTO post = this.viewPost(id);

        post.setViewCount(post.getViewCount()+1);

        this.boardRepository.save(this.modelMapper.map(post, Board.class));

        return post;
    }
}
