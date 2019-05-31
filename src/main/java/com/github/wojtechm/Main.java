package com.github.wojtechm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wojciech Makiela
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HelloWorldConfig.class);
        context.refresh();
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.run();
    }
}
