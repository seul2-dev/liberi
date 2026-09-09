package com.roozLog.liberi.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "메인 화면 성공");
        return "index";
    }

    /*
    * 로그인 화면으로 이동
    * */
    @GetMapping("/login")
    public String loginPage() {
        // templates/login.html 반환
        return "login/login";
    }
}
