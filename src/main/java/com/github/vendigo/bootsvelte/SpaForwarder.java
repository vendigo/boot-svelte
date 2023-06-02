package com.github.vendigo.bootsvelte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaForwarder {

    @RequestMapping({
            "/messages/**"
    })
    public String forward() {
        return "forward:/";
    }

}
