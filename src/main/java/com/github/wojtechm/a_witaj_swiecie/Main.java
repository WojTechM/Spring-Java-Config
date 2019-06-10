package com.github.wojtechm.a_witaj_swiecie;

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

    private static AnnotationConfigApplicationContext kontekst;
    private static final ŹródłoKonfiguracji ŹRÓDŁO_KONFIGURACJI = ŹródłoKonfiguracji.REJESTR;

    public static void main(String[] args) {
        stwórzContext();
        for (int i = 0; i < 10; i++) {
            WitajŚwiecieZLicznikiem witajŚwiecieZLicznikiem = kontekst.getBean(WitajŚwiecieZLicznikiem.class);
            witajŚwiecieZLicznikiem.run();
        }
    }

    private static void stwórzContext() {
        switch (ŹRÓDŁO_KONFIGURACJI) {
            case REJESTR:
                zarejetrujKlasyZKonfiguracją();
            case KONSTRUKTOR:
                wczytajKontekstZKlasyPrzezKonstruktor();
                break;
            case PAKIET:
                wczytajKontekstZPakietu();
                break;
        }
    }

    private static void zarejetrujKlasyZKonfiguracją() {
        kontekst = new AnnotationConfigApplicationContext();
        kontekst.register(KonfiguracjaWitajŚwiecie.class);
        kontekst.refresh();
    }

    private static void wczytajKontekstZKlasyPrzezKonstruktor() {
        kontekst = new AnnotationConfigApplicationContext(KonfiguracjaWitajŚwiecie.class);
    }

    private static void wczytajKontekstZPakietu() {
        kontekst = new AnnotationConfigApplicationContext("com.github.wojtechm.a_witaj_swiecie");
    }


    /**
     * Dostępne obsługiwane źródła konfiguracji - ułatwia przełączanie się między źródłami
     */
    private enum ŹródłoKonfiguracji {
        /**
         * Wstrzykiwanie klas z konfiguracją przez konstruktor.
         */
        KONSTRUKTOR,
        /**
         * Wyszukiwanie klas z konfiguracją w podanym pakiecie.
         */
        PAKIET,
        /**
         * Wstrzyknięcie klas z konfiguracją za pomocą metody register()
         */
        REJESTR
    }
}
