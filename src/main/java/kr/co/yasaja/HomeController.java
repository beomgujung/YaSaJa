package kr.co.yasaja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.yasaja.service.TestService;

@Controller
public class HomeController {
	
    @Autowired
    private TestService service;
    
    @RequestMapping("/selectNow.do")
    public void selectNow() {
        String result = service.selectNow();
        System.out.println(result);
    }    
}
