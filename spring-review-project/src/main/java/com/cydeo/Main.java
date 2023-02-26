package com.cydeo;

import com.cydeo.config.EmployeeConfig;
import com.cydeo.service.Salary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        Salary salary = container.getBean(Salary.class);
        salary.calculateRegularSalary();

    }
}