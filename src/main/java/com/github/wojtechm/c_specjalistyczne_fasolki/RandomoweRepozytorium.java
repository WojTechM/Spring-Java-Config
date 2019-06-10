package com.github.wojtechm.c_specjalistyczne_fasolki;

import java.util.Arrays;
import java.util.List;

/**
 * Adnotacja @Repository informuje nas, że mamy do czynienia z "Repozytorium" (obviously) - obiektem
 * udostępniającym API do manipulacji danymi, a więc abstrakcją zbioru obiektów.
 *
 * W tym momencie przejdź proszę do dokumentacji adnotacji {@link @Repository} i przeczytaj ją całą.
 *
 * Repozytoriów najczęściej używamy w powiązaniu z bazami danych, jednak w tym
 * przykładzie (w imię prostoty), skorzystamy z kolekcji obiektów w pamięci.
 * Dodatkowo, zgodnie z dokumentacją repozytorium powinno wspierać przynajmniej 3 podstawowe operacje
 *  - Zapis
 *  - Odczyt
 *  - Wyszukiwanie
 * ale w imię prostoty (znowu) ograniczymy te funkcjonalności do wyłącznie odczytu.
 *
 * Na pocieszenie bazodanowy suchar:
 * Q: What's the second movie about a database engineer called?
 *
 * A: The SQL.
 *
 * @author Wojciech Makiela
 */
class RandomoweRepozytorium {

    private List<OszołomionaOsoba> ludki;

    public RandomoweRepozytorium() {
        System.out.println(this.getClass().getName() + " - Konstruktor");

        ludki = Arrays.asList(new OszołomionaOsoba("Wojciech"),
                new OszołomionaOsoba("Jakub"),
                new OszołomionaOsoba("Krzysztof"),
                new OszołomionaOsoba("Marcin"),
                new OszołomionaOsoba("Kacper"),
                new OszołomionaOsoba("Agnieszka"),
                new OszołomionaOsoba("Kamil"),
                new OszołomionaOsoba("Aleksandra"),
                new OszołomionaOsoba("Bartek"),
                new OszołomionaOsoba("NKrzyś"),
                new OszołomionaOsoba("Wiktor"),
                new OszołomionaOsoba("Patryk")
        );
    }

    OszołomionaOsoba osobaOId(int id) {
        // Modulo w tej linijce sprawia, że możecie w koło przechodzić przez całą listę ludków
        // nie martwiąc się o IndexOutOfBoundsException. W kodzie produkcyjnym tak nie róbcie ;(
        return ludki.get(id % ludki.size());
    }
}
