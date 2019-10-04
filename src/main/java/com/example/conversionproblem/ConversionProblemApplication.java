package com.example.conversionproblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ConversionProblemApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConversionProblemApplication.class, args);

        AppProperties properties = context.getBean(AppProperties.class);
        System.out.println(properties);

        context.close();
    }

}
