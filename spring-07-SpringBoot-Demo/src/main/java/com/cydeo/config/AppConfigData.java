package com.cydeo.config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;



@Data
@Configuration // @Component is included of @Configuration

public class AppConfigData {

    @Value("${myUserName}")
    private String myUserName;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;
}
