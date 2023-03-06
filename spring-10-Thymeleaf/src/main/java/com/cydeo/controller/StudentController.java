package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

//    @RequestMapping("/student/register") // localhost:8080/student/register
//    public String register(){
//        return "student/register";
//    }
//
//    @RequestMapping("/student/drop") // localhost:8080/student/drop
//    public String drop(){
//        return "student/register";
//    }

    // student/ register and student/drop are repeating name as student.
    // So, instead of we can use @RequestMapping("/student") at the class level, basically it concatenates

    @RequestMapping("/register") // localhost:8080/student/register
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    @RequestMapping("/drop") // localhost:8080/student/drop
    public String drop(){
        return "student/register";
    }

    @RequestMapping("/welcome") // localhost:8080/student/welcome
    public String welcome(@RequestParam String name){

        System.out.println(name);
        return "student/welcome";
    }
}
