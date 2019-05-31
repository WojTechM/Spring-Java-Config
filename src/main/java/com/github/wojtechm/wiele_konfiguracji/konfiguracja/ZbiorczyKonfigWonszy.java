package com.github.wojtechm.wiele_konfiguracji.konfiguracja;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Wojciech Makiela
 */
@Configuration
@Import({MegaKonfig.class, RzecznyKonfig.class})
public class ZbiorczyKonfigWonszy {

}
