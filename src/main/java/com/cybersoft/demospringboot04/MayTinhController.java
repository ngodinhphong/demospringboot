package com.cybersoft.demospringboot04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/maytinh")
public class MayTinhController {
    @GetMapping("")
    public String maytinh(@RequestParam int soa, @RequestParam int sob){
        System.out.println("Tổng 2 số " +soa + " và " +sob + " = " + (soa + sob)) ;
        return "hello";
    }

}
