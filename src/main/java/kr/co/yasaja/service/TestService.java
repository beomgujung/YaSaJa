package kr.co.yasaja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.yasaja.service.mapper.TestMapper;
 
@Service
public class TestService {
 
    @Autowired
    private TestMapper mapper;
    
    public String selectNow() {
        return mapper.selectNow();
    }
}
