package com.fiuty.demo.spring.boot.starter.configure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@ConfigurationProperties(prefix = "com.demo1")
@Configuration
@Data
public class StudentProperties {

    private String name;

    private Integer age;
}
