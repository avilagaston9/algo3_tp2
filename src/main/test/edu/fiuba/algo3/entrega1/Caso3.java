package edu.fiuba.algo3.entrega1;

import clases.*;
import clases.rangos.Novato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso3 {

    @Test
    public void policiaViajaDeMontrealAMexico() {

        Ciudad montreal = new Ciudad("Montreal");
        Ciudad mexico = new Ciudad("Mexico");

        Policia policia = new Policia(new Novato(), montreal);

        policia.viajarA(mexico);

        assertEquals(10,policia.tiempoTranscurridoEnHoras());
        assert(policia.esCiudadActual(mexico));
    }
}




