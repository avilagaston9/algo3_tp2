package edu.fiuba.algo3.entrega1;

import clases.Ciudad;
import clases.Policia;
import org.junit.jupiter.api.Test;

public class Caso5 {

    @Test
    public void DetectiveDuerme(){

        //arrange
        int cantArrestos = 0;
        Policia policia = new Policia(cantArrestos, new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.dormir();
        //assert
        assertEquals(policia.tiempoTranscurrido(), 8);
    }
    @Test
    public void DetectiveRecibeHeridaDeCuchillo(){

        //arrange
        Arma cuchillo = new Cuchillo();
        int cantArrestos = 0;
        Policia policia = new Policia(cantArrestos, new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.herirCon(cuchillo);
        //assert
        assertEquals(policia.tiempoTranscurrido(), 2);
    }
}
