package com.github.wojtechm.a_hello_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Scope("singleton")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
