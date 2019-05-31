package com.github.wojtechm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wojciech Makiela
 */
class Main {

    private enum ŹródłoKonfiguracji {
        KLASA, PAKIET, REGISTER
    }

    private static AnnotationConfigApplicationContext context;
    private static ŹródłoKonfiguracji źródłoKonfiguracji = ŹródłoKonfiguracji.PAKIET;

    public static void main(String[] args) {
        stwórzContext();
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.run();
    }

    private static void stwórzContext() {
        switch (źródłoKonfiguracji) {
            case REGISTER:
                zarejetrujKlasyZKonfiguracją();
            case KLASA:
                wczytajContextZKlasy();
                break;
            case PAKIET:
                wczytajContextZPakietu();
                break;
        }
    }

    private static void zarejetrujKlasyZKonfiguracją() {
        context = new AnnotationConfigApplicationContext();
        context.register(HelloWorldConfig.class);
        context.refresh();
    }

    private static void wczytajContextZKlasy() {
        context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    }

    private static void wczytajContextZPakietu() {
        context = new AnnotationConfigApplicationContext("com.github.wojtechm");
    }
}
