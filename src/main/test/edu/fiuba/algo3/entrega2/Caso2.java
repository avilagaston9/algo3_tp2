package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Caso2 {

    @Test
    public void detectiveConRangoInvestigadorTomaCasoDeUnRoboViajaDeMontrealAMexico(){

        //se crea Montreal
        Coordenadas coordenadasMontreal = new Coordenadas(45.50884,-73.58781);
        Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

        //se crea mexico
        Coordenadas coordenadasMexico = new Coordenadas(23.634501, -102.552784);
        Ciudad mexico = new Ciudad("Mexico", coordenadasMexico);

        //se crea policia novato en montreal
        Policia policia = new Policia(new Investigador(), montreal);

        policia.viajarA(mexico);

        assertEquals(2,policia.tiempoTranscurridoEnHoras());
        assert(policia.esCiudadActual(mexico));
        assertFalse(policia.esCiudadActual(montreal));
    }
}