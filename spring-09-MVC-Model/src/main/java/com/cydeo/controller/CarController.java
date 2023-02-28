package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @RequestMapping("/car")
    // localhost:8080/car?make=Honda
    public String carInfo(@RequestParam String make, Model model) {
        // make has to match with browser query parameter

        model.addAttribute("make", make);

        return "car/info";
    }

    @RequestMapping("/car2")   // TO MAKE DEFAULT VALUE
    // localhost:8080/car2 (KIA)
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "KIA") String car, Model model) {

        model.addAttribute("make", car); // make can change with browser query parameter. So we put car instead of make. It is optional

        return "car/info";
    }

    @RequestMapping("/car3")
    // localhost:8080/car3?make=Honda&year=2022
    public String carInfo3(@RequestParam String make, @RequestParam int year, Model model) {
        // order is not important because of & using. Order can be year and make either

        model.addAttribute("make", make);
        model.addAttribute("year", year);

        return "car/info";
    }

    @RequestMapping("/car/{make}")
    // localhost:8080/car/Honda
    public String getCarInfo(@PathVariable String make) { // There is no way to make it optional at PathVariable. Whatever you put, have to pass it.
        // Path variable has to match with browser path variable

        System.out.println(make); // Honda

        return "car/info";
    }

    @RequestMapping("/car2/{make}/{year}")
    // localhost:8080/car2/Honda/2022
    public String getCarInfo2(@PathVariable String make, @PathVariable int year) {
        // order is important because match on the position

        System.out.println(make); // Honda
        System.out.println(year); // 2022

        return "car/info";
    }

    @RequestMapping("/car3/{make}/{year}")
    // localhost:8080/car3/Honda/2022
    public String getCarInfo3(@PathVariable String make, @PathVariable int year, Model model) {
        // Whenever you need to move your data from your method to thymeleaf, use Model. So, basically Model carries to user view, so to my thymeleaf.

        model.addAttribute("make", make); // use in the view
        model.addAttribute("year", year);

        return "car/info";
    }

}
