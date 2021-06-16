package com.SpringMVCRESTfulapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /**
     * Loads the index page
     * @return index page
     */
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

}
