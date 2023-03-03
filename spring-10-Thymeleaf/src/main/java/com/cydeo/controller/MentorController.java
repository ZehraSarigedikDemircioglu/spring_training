package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {
//    @RequestMapping("/mentor/register") // localhost:8080/mentor/register
//    public String register(){
//        return "student/register";
//    }
//    @RequestMapping("/mentor/drop") // localhost:8080/mentor/drop
//    public String drop(){
//        return "student/register";
//    }

    @RequestMapping("/register") // localhost:8080/mentor/register
    public String register(){
        return "student/register";
    }
    @RequestMapping("/drop") // localhost:8080/mentor/drop
    public String drop(){
        return "student/register";
    }


}
