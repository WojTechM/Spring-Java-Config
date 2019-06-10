/**
 * Prezentacja konfiguracji programistycznej - Witaj Świecie!
 *
 * Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby na inicjalizację kontekstu aplikacji na różne sposoby.
 * Dowiesz się czym są adnotacje:
 * {@link org.springframework.context.annotation.Configuration}
 * {@link org.springframework.context.annotation.Bean}
 * {@link org.springframework.context.annotation.Scope}
 *
 *
 * 1. Witaj świecie
 *      W pakiecie dostępna jest klasa {@link com.github.wojtechm.a_witaj_swiecie.WitajŚwiecieZLicznikiem}
 *      To jej instancjami będziemy zarządzać w trakcie pracy z tym pakietem.
 *      Zapoznaj się proszę z jej kodem.
 *
 * 2. Konfiguracja programistyczna
 *      {@link com.github.wojtechm.a_witaj_swiecie.KonfiguracjaWitajŚwiecie} jest równie prostą, co ważną klasą.
 *      Jest ona źródłem naszej konfiguracji (@Configuration) udostępniającym dostęp do ziaren/instancji (@Bean)
 *      klasy WitajŚwiecieZLicznikiem, zgodnie z ich zakresem (@Scope).
 *
 *      2.1 @Bean
 *          Adnotacja umieszczana nad metodą zwracającą instancje pewnej klasy. Po wczytaniu podczas skanu komponentów
 *          ziarno jest udostępniane przez kontener Springa.
 *
 *          // Tutaj odbywa się wycieczka do dokumentacji {@link org.springframework.context.annotation.Bean}
 *
 *          Do zapamiętania - jeśli nie podamy nazwy naszemu ziarnu, to zostanie użyta domyślna nazwa - to jest nazwa
 *          metody zaadnotowanej @Bean.
 *
 *
 *      2.2 @Scope
 *          Pozwala nam zdefiniować w jaki sposób tworzone i wstrzykiwane będą instancje w danej metodzie.
 *          "singleton" oznacza, że (w ramach tej metody) stworzona zostanie tylko jedna instancja
 *              i to ona będzie zwracana za każdym razem, gdy metoda jest wywołana.
 *          "prototype" sprawia, że przy każdorazowym pobraniu ziarna z kontenera springa, otrzymamy nową zupełnie
 *              nowe ziarno.
 *
 *
 *      2.3 @Configuration
 *          Adnotacja @Configuration oznacza klasę, dając znać że znajdziemy w niej metody o adnotacji @Bean, a więc
 *          klasę, która powinna być uwzględniona podczas tworzenia ziaren
 *
 *
 *
 *
 *
 * @author Wojciech Makiela
 */
package com.github.wojtechm.a_witaj_swiecie;