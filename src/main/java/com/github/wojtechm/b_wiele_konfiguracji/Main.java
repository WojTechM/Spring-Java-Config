package com.github.wojtechm.b_wiele_konfiguracji;

import com.github.wojtechm.b_wiele_konfiguracji.ziarno.Wybuchable;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaPetardy;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaGwiazdyNeutronowej;
import com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł.KonfiguracjaZbiorcza;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Przykład użycia różnych źródeł konfiguracji - należy zerknąć na adnotację {@link org.springframework.context.annotation.Import @Import}
 * za pomocą której możemy łączyć klasy w grupy.
 * @author Wojciech Makiela
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = stwórzContext();

        Wybuchable petarda = (Wybuchable) context.getBean("nazwaNadpisującaDomyślnąNazwę");
        petarda.wybuchaj();

        Wybuchable gwiazdaNeutronowa = context.getBean("gwiazdaNeutronowa", Wybuchable.class);
        gwiazdaNeutronowa.wybuchaj();
    }

    private static AnnotationConfigApplicationContext stwórzContext() {
        // Zmień aby użyć konfiguracji zbiorczej, lub konfiguracji poprzez podawanie pojedynczych klas
        boolean użyjZbiorczej = false;
        if (użyjZbiorczej)
            return new AnnotationConfigApplicationContext(KonfiguracjaZbiorcza.class);

        return new AnnotationConfigApplicationContext(KonfiguracjaPetardy.class, KonfiguracjaGwiazdyNeutronowej.class);
    }
}
