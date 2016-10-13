package org.egov.calender;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/calender")
    public String index() {
        return "Welcome to calender App!";
    }
    
}
