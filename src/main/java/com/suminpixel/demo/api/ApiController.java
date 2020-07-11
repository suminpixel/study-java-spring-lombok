package com.suminpixel.demo.api;

import com.suminpixel.demo.api.servcie.TestService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor//controller : 페이지 연결을 위한 routing, dispatch
public class ApiController {

    //디펜던시 인덱션 : new() 하지 않고 한꺼번에 올려서 자동으로 맵핑
    // DI/ IOC 스프링의 경우 코드상의 모든 객체를 싱글턴으 스프링 컨트롤러가 자동으로 조립하여 메모리에 올림
    // -> 생성자로 불러올 필요가 없어짐
    //
    final private TestService testService;

    //DTO : 데이터 를 주고 받기 위한 Object ex)JSON, XML
    @GetMapping("/api") //LOMBOK :
    public TestDTO index(){
        return testService.index();
    }

}
