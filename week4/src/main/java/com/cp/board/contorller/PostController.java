package com.cp.board.contorller;

import com.cp.board.dto.BoardDTO;
import com.cp.board.dto.ResponseDTO;
import com.cp.board.dto.WriteRequestDTO;
import com.cp.board.service.BoardService;
import com.cp.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    final private PostService postService;

    @PostMapping("/write")
    public String writePost(@RequestBody WriteRequestDTO writeRequestDTO){
        this.postService.writePost(writeRequestDTO);
        return "/home";
    }

    @PostMapping("/delete")
    public String writePost(@RequestBody Long id){
        this.postService.deletePost(id);
        return "/home";
    }

    @GetMapping("/view")
    public ResponseDTO viewPost(@RequestParam("id") Long id){

        return ResponseDTO.builder()
                .data(this.postService.viewPost(id))
                .build();
        //return this.postService.viewPost(id);
    }

    @GetMapping("/count")
    public ResponseDTO updateCountPost(@RequestParam("id") Long id){

        return ResponseDTO.builder()
                .data(this.postService.updatePostCount(id))
                .build();
    }


}


