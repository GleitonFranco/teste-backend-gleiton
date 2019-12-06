package com.opovodigital.testebackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/index")
@Controller
public class IndexController {
    @RequestMapping("/artigos/novo")
    public String novo() {
        return "pages/index";
    }
}
