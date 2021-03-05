package com.fiuty.demo.spring.boot.starter.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhengdayue
 */
@Import(DemoConfiguration.class)
@Configuration
public class DemoAutoConfiguration {
}
