package com.github.wojtechm.wiele_konfiguracji.konfiguracja;

import com.github.wojtechm.wiele_konfiguracji.fasolka.WonszRzeczny;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class RzecznyKonfig {

    @Bean
    WonszRzeczny wonszRzeczny() {
        return new WonszRzeczny();
    }
}
