package com.suminpixel.demo.api.servcie;


import com.suminpixel.demo.api.TestDTO;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public TestDTO index() {
        return TestDTO.builder()
                .name("s")
                .build(); //builder 패턴으로
    }
}
