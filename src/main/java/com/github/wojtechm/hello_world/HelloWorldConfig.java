package com.github.wojtechm.hello_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
