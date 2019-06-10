package com.github.wojtechm.c_specjalistyczne_fasolki;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Wojciech Makiela
 */
@Configuration
class Konfiguracja extends AnnotationConfigApplicationContext {

    private RandomoweRepozytorium randomoweRepozytorium() {
        return new RandomoweRepozytorium();
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
