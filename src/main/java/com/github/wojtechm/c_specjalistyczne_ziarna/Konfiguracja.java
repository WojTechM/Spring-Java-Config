package com.github.wojtechm.c_specjalistyczne_ziarna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
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
