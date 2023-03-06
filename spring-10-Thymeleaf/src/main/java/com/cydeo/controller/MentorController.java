package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


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

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model){

        List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        model.addAttribute("batchList",batchList);
        model.addAttribute("mentor",new Mentor());

        return "mentor/mentor-register";
    }

    @RequestMapping("/register") // localhost:8080/mentor/register
    public String register() {
        return "student/register";
    }

    @RequestMapping("/drop") // localhost:8080/mentor/drop
    public String drop() {
        return "student/register";
    }

//    @PostMapping("/confirm")
//    public String submitForm(@ModelAttribute("mentor") Mentor mentor, Model model){
//
//        how can I access to "mentor" attribute in this method? It comes @ModelAttribute("mentor")
//        model.addAttribute("mentor",new Mentor());
//        return "mentor/mentor-register";
//    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor){

//        return "mentor/mentor-register";
//        no need repeated codes, it comes redirect:
//        each completed registration, page will refresh with empty form and gives me register
        return "redirect:/mentor/register";
    }



//    @GetMapping("/confirm")
//    // it is possible an end-point works both get and post-mapping
//    public String submitForm2(){
//
//        return "mentor/mentor-confirmation";
//    }
}
