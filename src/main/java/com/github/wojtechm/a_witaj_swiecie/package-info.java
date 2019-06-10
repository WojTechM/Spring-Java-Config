/**
 * <h1>Prezentacja konfiguracji programistycznej - Witaj Świecie!</h1>
 *
 * Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby na inicjalizację kontekstu aplikacji na różne sposoby.
 * Dowiesz się czym są adnotacje:
 * <ul>
 *     <li>{@link org.springframework.context.annotation.Configuration @Configuration}</li>
 *     <li>{@link org.springframework.context.annotation.Bean @Bean}</li>
 *     <li>{@link org.springframework.context.annotation.Scope @Scope}</li>
 * </ul>
 *
 * <ol>
 * <li>Witaj świecie<br/>
 *      W pakiecie dostępna jest klasa {@link com.github.wojtechm.a_witaj_swiecie.WitajŚwiecieZLicznikiem WitajŚwiecieZLicznikiem}.
 *      To jej instancjami będziemy zarządzać w trakcie pracy z tym pakietem.
 *      Zapoznaj się proszę z jej kodem.
 * </li><br/>
 * <li>Konfiguracja programistyczna<br/>
 *      {@link com.github.wojtechm.a_witaj_swiecie.KonfiguracjaWitajŚwiecie KonfiguracjaWitajŚwiecie} jest równie prostą, co ważną klasą.
 *      Jest ona źródłem naszej konfiguracji [przy odniesieniu do adnotacji lub innego kodu zastanów się nad {@code} jak w poprawionym kawałku] ({@code @Configuration}) udostępniającym dostęp do ziaren/instancji klasy
 *      WitajŚwiecieZLicznikiem (@Bean), zgodnie z ich zakresem (@Scope).
 *
 *      <ol>
 *          <li>{@link org.springframework.context.annotation.Bean @Bean}<br/>
 *              Adnotacja umieszczana nad metodą zwracającą instancje pewnej klasy. Po wczytaniu podczas skanu komponentów
 *              ziarno jest udostępniane przez kontener Springa.
 *              <p>// Tutaj odbywa się wycieczka do dokumentacji @Bean</p>
 *              Do zapamiętania - jeśli nie nazwiemy naszego ziarna, to zostanie użyta domyślna nazwa - to jest nazwa
 *              metody zaadnotowanej @Bean.
 *          </li><br/>
 *
 *
 *          <li>{@link org.springframework.context.annotation.Scope @Scope}<br/>
 *              Pozwala nam zdefiniować w jaki sposób tworzone i wstrzykiwane będą instancje danej klasy.
 *              <ul>
 *                  <li><b>"singleton"</b> - (w ramach tej metody) stworzona zostanie tylko jedna instancja i to ona
 *                  będzie zwracana za każdym razem, gdy metoda jest wywołana. Możliwe jest posiadanie wielu
 *                  metod z zakresem "singleton" zwracających różne instancje tej samej klasy.
 *                  </li>
 *                  <li><b>"prototype"</b> - przy każdorazowym pobraniu ziarna z kontenera springa, otrzymamy nową zupełnie nowe ziarno.</li>
 *              </ul>
 *          </li><br/>
 *
 *          <li>{@link org.springframework.context.annotation.Configuration @Configuration}<br/>
 *              Adnotacja {@link org.springframework.context.annotation.Configuration @Configuration}
 *              oznacza klasę, dając znać że znajdziemy w niej metody o adnotacji {@link org.springframework.context.annotation.Bean @Bean}, a więc
 *              klasę, która powinna być uwzględniona podczas tworzenia ziaren.
 *
 *              <p>// Tutaj odbywa się wycieczka do dokumentacji</p>
 *
 *          </li>
 *      </ol>
 * </li><br/>
 * <li>Kontekst aplikacji<br/>
 *      W klasie {@link com.github.wojtechm.a_witaj_swiecie.Main Main} masz okazję zobaczyć w jaki sposób tworzony jest
 *      {@link org.springframework.context.annotation.AnnotationConfigApplicationContext kontekst aplikacji}. Czegoś więcej
 *      dowiesz się o nim z przyszłych prezentacji. Teraz musisz jedynie wiedzieć że jest on głównym źródłem
 *      konfiguracji Springowych aplikacji (bonus dla chętnych - <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html">link do dokumentacji</a>).
 *      // wyszło przypadkiem, ale nadal - joł joł joł
 *      <br/>
 *      Przejrzyj dostępne sposoby inicjalizacji, poczytaj dokumentację. Pobaw się z kodem (polecam zmienić pakiet podany w metodzie wczytajKontekstZPakietu)
 * </li>
 *
 *
 *</ol>
 *
 *
 * @author Wojciech Makiela
 */
package com.github.wojtechm.a_witaj_swiecie;