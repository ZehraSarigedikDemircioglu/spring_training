package com.cydeo.stereotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor{
    public AcerMonitor() {

        super("25 inch beast","Acer",35);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
