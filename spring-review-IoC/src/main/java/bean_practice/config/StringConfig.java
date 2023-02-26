package bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringConfig {

    @Bean(name = "welcome")
    public String welcome(){
        return "Welcome to CydeoApp";
    }

    @Bean(name = "practice")
    public String practice(){
        return "Spring Core Practice";
    }
}
