/**
 *
 * <h1>Prezentacja konfiguracji programistycznej - Wiele konfiguracji.</h1>
 *
 * Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby na łączenie klas z konfiguracją, oraz zobaczysz
 * 2 nowe sposoby na wyciąganie ziaren.
 * <br/>
 * Dowiesz się:
 * <ul>
 *     <li>Czym jest adnotacja {@link org.springframework.context.annotation.Import @Import}.</li>
 *     <li>Jak wyciągnąć ziarno o konkretnej nazwie.</li>
 * </ul>
 *
 * <ol>
 *     <li>Wiele ziaren<br>
 *          W podpakiecie 'ziarno' znaleźć możesz 2 klasy:
 *          {@link com.github.wojtechm.b_wiele_konfiguracji.ziarno.GwiazdaNeutronowa GwiazdaNeutronowa} oraz
 *          {@link com.github.wojtechm.b_wiele_konfiguracji.ziarno.Petarda Petarda}, które implementują interface {@link com.github.wojtechm.b_wiele_konfiguracji.ziarno.Wybuchable Wybuchable}.
 *          Zapoznaj się proszę z tymi klasami.
 *     </li><br/>
 *     <li>Konfiguracja<br/>
 *          W podpakiecie 'konfiguracja_źródeł' znajdziesz 2 proste klasy z konfiguracją, oraz
 *          jedną klasę zbierającą pozostałe. Klasy
 *          {@link com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaGwiazdyNeutronowej KonfiguracjaGwiazdyNeutronowej} oraz
 *          {@link com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaPetardy KonfiguracjaPetardy}
 *          są łączone przez klasę
 *          {@link com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaZbiorcza KonfiguracjaZbiorcza}
 *          za pomocą adnotacji {@link org.springframework.context.annotation.Import @Import}.
 *     </li><br/>
 *     <li>Przykładowe użycie<br/>
 *         W klasie {@link com.github.wojtechm.b_wiele_konfiguracji.Main} możesz zobaczyć:
 *         <ul>
 *             <li>Wyciąganie ziaren po ich nazwie</li>
 *             <li>Wczytanie konfiguracji z klasy zbiorczej, jak i z poszczególnych klas z kofiguracją z osobna</li>
 *         </ul>
 *         Podczas wyciągania ziaren po nazwie, należy pamiętać o tym, że domyślnie przyjmują one nazwę metody
 *         (patrz {@link com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaGwiazdyNeutronowej#gwiazdaNeutronowa() gwiazdaNeutronowa()})
 *         przez którą są generowane, jednak można tę nazwę nadpisać poprzez parametryzowanie adnotacji {@link org.springframework.context.annotation.Bean @Bean}
 *         (patrz {@link com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaPetardy#petarda() petarda()}).
 *     </li>
 * </ol>
 *
 *
 * @author Wojciech Makiela
 */
package com.github.wojtechm.b_wiele_konfiguracji;