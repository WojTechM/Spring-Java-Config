package com.github.wojtechm.wiele_konfiguracji;

import com.github.wojtechm.wiele_konfiguracji.fasolka.WonszBehaviour;
import com.github.wojtechm.wiele_konfiguracji.konfiguracja.MegaKonfig;
import com.github.wojtechm.wiele_konfiguracji.konfiguracja.RzecznyKonfig;
import com.github.wojtechm.wiele_konfiguracji.konfiguracja.ZbiorczyKonfigWonszy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wojciech Makiela
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = stwórzContext();

        WonszBehaviour megaWonsz = (WonszBehaviour) context.getBean("wonsz9");
        megaWonsz.sycz();

        WonszBehaviour rzecznyWonsz = (WonszBehaviour) context.getBean("wonszRzeczny");
        rzecznyWonsz.sycz();
    }

    private static AnnotationConfigApplicationContext stwórzContext() {
        // Zmień aby użyć konfiguracji zbiorczej, lub konfiguracji poprzez podawanie pojedynczych klas
        boolean użyjZbiorczej = false;
        if (użyjZbiorczej)
            return new AnnotationConfigApplicationContext(ZbiorczyKonfigWonszy.class);

        return new AnnotationConfigApplicationContext(MegaKonfig.class, RzecznyKonfig.class);
    }
}
