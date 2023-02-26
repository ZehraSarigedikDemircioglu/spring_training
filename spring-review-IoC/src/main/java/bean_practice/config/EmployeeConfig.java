package bean_practice.config;

import bean_practice.employee.Employee;
import bean_practice.employee.FullTimeEmployee;
import bean_practice.employee.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {
    @Bean
    @Primary
    public Employee fulltime() {
        return new FullTimeEmployee();
    }

    @Bean
    public Employee parttime() {
        return new PartTimeEmployee();
    }
}
