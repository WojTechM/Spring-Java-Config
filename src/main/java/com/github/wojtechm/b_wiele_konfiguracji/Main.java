package com.github.wojtechm.b_wiele_konfiguracji;

import com.github.wojtechm.b_wiele_konfiguracji.ziarno.WonszBehaviour;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.MegaKonfig;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.RzecznyKonfig;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.ZbiorczyKonfigWonszy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Przykład użycia różnych źródeł konfiguracji - należy zerknąć na adnotację @{@link org.springframework.context.annotation.Import}
 * za pomocą której możemy łączyć klasy w grupy.
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
