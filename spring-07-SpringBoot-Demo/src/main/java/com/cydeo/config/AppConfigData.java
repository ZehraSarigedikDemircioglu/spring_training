package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration // @Component is included of @Configuration. So, used that.
public class AppConfigData {
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
}
