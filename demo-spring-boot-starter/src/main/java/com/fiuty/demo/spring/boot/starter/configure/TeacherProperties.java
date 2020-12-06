package com.fiuty.demo.spring.boot.starter.configure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@Configuration
@ConfigurationProperties(prefix = "com.demo2")
@Data
public class TeacherProperties {

    private String name;

    private Integer age;
}
