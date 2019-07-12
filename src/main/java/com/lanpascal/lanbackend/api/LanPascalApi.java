package com.lanpascal.lanbackend.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;

@Controller
@EnableAutoConfiguration
public class LanPascalApi extends HttpServlet {

    @RequestMapping("/")
    @ResponseBody
    String test() {
        return "Hello, World!";
    }

}
