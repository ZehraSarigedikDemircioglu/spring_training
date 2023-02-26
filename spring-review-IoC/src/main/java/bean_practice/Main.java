package bean_practice;

import bean_practice.config.EmployeeConfig;
import bean_practice.config.StringConfig;
import bean_practice.employee.Employee;
import bean_practice.employee.FullTimeEmployee;
import bean_practice.employee.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        ApplicationContext containerString = new AnnotationConfigApplicationContext(StringConfig.class);

        Employee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        Employee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str = containerString.getBean("welcome", String.class);
        System.out.println("str = " + str);

        String str2 = containerString.getBean("practice", String.class);
        System.out.println("str2 = " + str2);

    }
}
