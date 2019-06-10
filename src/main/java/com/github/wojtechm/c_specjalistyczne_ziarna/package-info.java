/**
 * <h1>Prezentacja konfiguracji programistycznej - Przykład użycia.</h1>
 * Podczas zapoznania się z kodem w tym pakiecie zobaczych przykładową implementację
 * aplikacji webowej (instrukcja uruchomienia na samym dole).<br/>
 * Dowiesz się jak może wyglądać konfiguracja aplikacji webowej, oraz powtórzysz sobie czym są:
 * <ul>
 *     <li>{@link org.springframework.stereotype.Controller @Controller}</li>
 *     <li>{@link org.springframework.stereotype.Service @Service}</li>
 *     <li>{@link org.springframework.stereotype.Repository @Repository}</li>
 * </ul>
 *
 * <ol>
 *     <li>Przegląd kodu<br/>
 *          Polecam przypomnieć sobie czym są repozytoria, serwisy oraz kontrolery (w tej kolejności)
 *          <ol>
 *              <li>{@link com.github.wojtechm.c_specjalistyczne_ziarna.RozsądneRepozytorium}</li>
 *              <li>{@link com.github.wojtechm.c_specjalistyczne_ziarna.SuperSerwis}</li>
 *              <li>{@link com.github.wojtechm.c_specjalistyczne_ziarna.KreatywnyKontroler}</li>
 *          </ol>
 *          W dokumentacji tych klas znajdziesz skrótowe przypomnienie czym są wspomniane stereotypy.
 *     </li><br/>
 *     <li>Konfiguracja<br/>
 *         W klasie {@link com.github.wojtechm.c_specjalistyczne_ziarna.Konfiguracja} możesz znaleźć przykładową
 *         konfigurację aplikacji webowej. Przeczytaj proszę jej dokumentację.
 *         <br/>
 *         Zwróć uwagę na fakt, że do tej pory żadna z metod z adnotacją {@link org.springframework.context.annotation.Bean @Bean}
 *         nie była prywatna. Spróbuj teraz stworzyć nową metodę "konfiguracja()", która będzie zwracać instancje klasy {@link com.github.wojtechm.c_specjalistyczne_ziarna.Konfiguracja},
 *         jednocześnie mając prywatny modyfikator dostępu. Po wprowadzeniu zmian spróbuj uruchomić aplikację.
 *     </li>
 * </ol>
 * <br/>
 * Aby uruchomić Jettiego użyj komendy:
 * <p>{@code mvn jetty:run}</p> lub jeśli chcesz uruchomić go na innym porcie (domyślny port to 8080):
 * <p>{@code mvn -Djetty.port=8888 jetty:run}</p>
 * <br/>
 * @author Wojciech Makiela
 */
package com.github.wojtechm.c_specjalistyczne_ziarna;