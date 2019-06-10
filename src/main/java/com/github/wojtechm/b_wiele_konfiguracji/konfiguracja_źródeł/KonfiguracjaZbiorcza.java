package com.github.wojtechm.b_wiele_konfiguracji.konfiguracja_źródeł;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Wojciech Makiela
 */
@Configuration
@Import({MegaKonfig.class, RzecznyKonfig.class})
public class ZbiorczyKonfigWonszy {

}
