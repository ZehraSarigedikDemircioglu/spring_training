package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @component is included
public class HomeController {
@RequestMapping("/home")
    public String getHomePage(){ // method name does not matter
        return "home.html";
    }

    @RequestMapping("/sarah") // we need to refresh page first to detect this method
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping // default page
    public String getHomePage3(){
        return "home.html";
    }

    @RequestMapping ({"/apple", "orange"})// when /apple or /orange put, it occurs home page
    public String getHomePage4(){
        return "home.html";
    }

    @RequestMapping ({"/hi", "/world"})// when /hi or /world put, it occurs home page
    public String getHomePage5(){
        return "home.html";
    }
}
