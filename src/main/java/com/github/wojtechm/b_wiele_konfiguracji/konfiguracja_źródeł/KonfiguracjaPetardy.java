package com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł;

import com.github.wojtechm.b_wiele_konfiguracji.ziarno.Petarda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class KonfiguracjaPetardy {

    @Bean("nazwaNadpisującaDomyślnąNazwę")
    public Petarda petarda() {
        return new Petarda();
    }
}
