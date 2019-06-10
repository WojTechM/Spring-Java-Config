package com.github.wojtechm.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Przedstawienie 3 z 4 sposobów inicjalizacji klasy {@link AnnotationConfigApplicationContext}
 * - Użycie metody register()
 * - Podanie klas w konstruktorze
 * - Podanie pakietu gdzie poszukiwana będzie konfiguracja
 *
 * W celu przełączania się pomiędzy poszczególnymi sposobami zmień wartość zmiennej ŹRÓDŁO_KONFIGURACJI
 *
 * @author Wojciech Makiela
 */
class Main {

    private enum ŹródłoKonfiguracji {
        KLASA, PAKIET, REGISTER
    }

    private static AnnotationConfigApplicationContext context;
    private static final ŹródłoKonfiguracji ŹRÓDŁO_KONFIGURACJI = ŹródłoKonfiguracji.REGISTER;

    public static void main(String[] args) {
        stwórzContext();
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.run();
    }

    private static void stwórzContext() {
        switch (ŹRÓDŁO_KONFIGURACJI) {
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
