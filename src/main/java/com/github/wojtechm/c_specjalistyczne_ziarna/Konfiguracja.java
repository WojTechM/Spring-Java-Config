package com.github.wojtechm.c_specjalistyczne_ziarna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Przykładowa konfiguracja.
 * <br/>
 * W tym przykładzie nic poza {@link KreatywnyKontroler KreatywnyKontrolerem} nie potrzebuje ani serwisu,
 * ani repozytorium, więc mamy znakomitą okazję by się przekonać, że w klasach z konfiguracją możemy mieć
 * również metody, które nie będą miały adnotacji {@link Bean @Bean} (w sumie dlaczego miałyby nie móc?).
 * <br/>
 *
 * @author Wojciech Makiela
 */
@Configuration
class Konfiguracja {

    private RozsądneRepozytorium randomoweRepozytorium() {
        return new RozsądneRepozytorium();
    }

    private SuperSerwis superSerwis() {
        return new SuperSerwis(randomoweRepozytorium());
    }

    @Bean
    @Scope(scopeName = "singleton")
    KreatywnyKontroler kreatywnyKontroler() {
        return new KreatywnyKontroler(superSerwis());
    }
}
