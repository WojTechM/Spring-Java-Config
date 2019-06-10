package com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł;

import com.github.wojtechm.b_wiele_konfiguracji.ziarno.MegaWonsz9;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class MegaKonfig {

    @Bean
    public MegaWonsz9 wonsz9() {
        return new MegaWonsz9();
    }
}
