package com.github.wojtechm.c_specjalistyczne_fasolki;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Kontroler - w aplikacjach webowych bramka wejściowa do aplikacji.
 * Pobiera dane od użytkownika, oraz zwraca odpowiedni widok - HTML.
 *
 * W imię prezentacji HTML jest zaszyty w zmiennej. Na projekcie tak nie róbcie ;(
 *
 *
 * Q: What did the server say to his client who was having a bad day?
 *
 * A: Everything's going to be 200
 *
 * @author Wojciech Makiela
 */
@Controller
class KreatywnyKontroler {

    private static final String HTML = "<!DOCTYPE html>\n" +
           "<html>\n" +
            "<head>\n" +
            "    <title>Akademia Java</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<h1>No siema %s</h1>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";

    private SuperSerwis serwis;
    private int idOsoby = 0;

    public KreatywnyKontroler(SuperSerwis superSerwis) {
        System.out.println(this.getClass().getName() + " - Konstruktor");
        this.serwis = superSerwis;
    }

    @GetMapping
    private ResponseEntity<?> pobierzDane() {
        return ResponseEntity.ok(String.format(HTML, serwis.pobierzImieOsoby(idOsoby++)));
    }

}
