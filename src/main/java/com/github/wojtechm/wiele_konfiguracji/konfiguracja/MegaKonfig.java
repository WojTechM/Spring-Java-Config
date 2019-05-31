package com.github.wojtechm.wiele_konfiguracji.konfiguracja;

import com.github.wojtechm.wiele_konfiguracji.fasolka.MegaWonsz9;
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
