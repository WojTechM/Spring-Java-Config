package com.github.wojtechm.c_specjalistyczne_fasolki;

/**
 * Proste POJO. Ot zwykła otoczka na imię.
 *
 * @author Wojciech Makiela
 */
class OszołomionaOsoba {

    String imie;

    OszołomionaOsoba(String imie) {
        this.imie = imie;
        System.out.println(this.getClass().getName() + " - Konstruktor");

    }
}
