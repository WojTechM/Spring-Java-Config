package com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł;

import com.github.wojtechm.b_wiele_konfiguracji.ziarno.GwiazdaNeutronowa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class KonfiguracjaGwiazdyNeutronowej {

    @Bean
    public GwiazdaNeutronowa gwiazdaNeutronowa() {
        return new GwiazdaNeutronowa();
    }
}
