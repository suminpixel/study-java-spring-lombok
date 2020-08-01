package com.cp.board;

import com.cp.board.dto.WriteRequestDTO;
import com.cp.board.model.Board;
import com.cp.board.service.PostService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc; // MVC테스트용 어노테이션
    @Autowired
    private PostService postService;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void 리스트() throws Exception{
        mockMvc.perform(get("/api/v1/boards")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(status().isOk())
                    .andDo(print());
    }

    @Test
    void 작성() throws Exception {

            WriteRequestDTO post = WriteRequestDTO.builder()
                    .name("철수")
                    .title("제목입니다...")
                    .content("내용입니다... 내용입니다... 내용입니다... ")
                    .build();


            //MediaType : JSON TYPE의 데이터만 담고있는 요청을 처리
            mockMvc.perform(post("/api/v1/post/write")
                    .content(objectMapper.writeValueAsString(post))
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                            .accept(MediaType.APPLICATION_JSON_VALUE))
                            .andExpect(status().isOk())
                            .andDo(print());


           // this.postService.writePost(post);
    }
    /*
    @Test
    void 삭제() throws Exception {
        mockMvc.perform(post("/api/v1/post/delete")
                .content("1") //post id 1
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andDo(print());
    }*/

    @Test
    void 읽기() throws Exception {
        mockMvc.perform(get("/api/v1/post/view")
                .param("id","5") //post id = 4 조회
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    void 조회수_올리기() throws Exception{
        mockMvc.perform(get("/api/v1/post/count")
                .param("id","4") //post id = 4 조회
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
