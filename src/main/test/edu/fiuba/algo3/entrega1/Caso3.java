package edu.fiuba.algo3.entrega1;

import clases.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso3 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoDespliegaPistaCorrecta(){

        Ciudad montreal = new Ciudad("Montreal");
        Ciudad mexico = new Ciudad("Mexico");

        int distancia = 9000;
        montreal.agregarSiguiente(mexico, distancia);

        Policia policia = new Policia(new Novato(), montreal); // crear tiempo y rango

        policia.viajarA(mexico);

        assertEquals(10,policia.tiempoTranscurridoEnHoras());
        assert(policia.esCiudadActual(mexico));
    }
}
