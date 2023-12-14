package com.cybersoft.demospringboot04;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/baitap")
public class BaiTap1Controller {
    @GetMapping("/greeting")
    public String greeting(){


        return "login";
    }

    @PostMapping("/welcome")
    public String welcome(@RequestParam("tennguoidung") String tennguoidung, Model model){
        model.addAttribute("tennguoidung", tennguoidung);

        return "welcome";
    }
}
