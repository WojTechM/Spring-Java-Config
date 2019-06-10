package com.github.wojtechm.a_witaj_swiecie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Wojciech Makiela
 */
@Configuration
public class KonfiguracjaWitajŚwiecie {

    @Bean
    @Scope("singleton")
    public WitajŚwiecieZLicznikiem helloWorld() {
        return new WitajŚwiecieZLicznikiem();
    }
}
