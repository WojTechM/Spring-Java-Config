package com.github.wojtechm.c_specjalistyczne_ziarna;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Adnotacja {@link org.springframework.stereotype.Repository @Repository} informuje nas, że mamy do czynienia z "Repozytorium" (obviously) - obiektem
 * udostępniającym API do manipulacji danymi, a więc abstrakcją zbioru obiektów.
 * <br/>
 * W tym momencie przejdź proszę do dokumentacji adnotacji {@link org.springframework.stereotype.Repository @Repository} i przeczytaj ją całą.
 * <br/>
 * Repozytoriów najczęściej używamy w powiązaniu z bazami danych, jednak w tym
 * przykładzie (w imię prostoty), skorzystamy z kolekcji obiektów w pamięci.
 * Dodatkowo, zgodnie z dokumentacją repozytorium powinno wspierać przynajmniej 3 podstawowe operacje
 *  <ul>
 *      <li>Zapis</li>
 *      <li>Odczyt</li>
 *      <li>Wyszukiwanie</li>
 *  </ul>
 * ale w imię prostoty (znowu) ograniczymy te funkcjonalności do wyłącznie odczytu.
 *
 * <p>Na pocieszenie bazodanowy suchar:</p>
 * <br/>
 * Q: What's the second movie about a database engineer called?
 * <br/>...<br/>
 * A: The SQL.
 *
 * @author Wojciech Makiela
 */
@Repository
class RozsądneRepozytorium {

    private List<OszołomionaOsoba> ludki;

    public RozsądneRepozytorium() {
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
