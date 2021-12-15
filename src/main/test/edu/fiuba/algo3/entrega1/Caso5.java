package edu.fiuba.algo3.entrega1;

import clases.*;
import clases.armas.Arma;
import clases.armas.Cuchillo;
import clases.rangos.Novato;
import clases.Policia;
import clases.rangos.Rango;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso5 {

    @Test
    public void DetectiveDuerme(){

        //arrange
        Rango rango= new Novato();
        Policia policia = new Policia(rango, new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.dormir();
        //assert
        assertEquals(8, policia.tiempoTranscurridoEnHoras());
    }

    @Test
    public void DetectiveRecibeHeridaDeCuchillo(){

        //arrange
        Arma cuchillo = new Cuchillo();
        Rango rango= new Novato();
        Policia policia = new Policia(rango, new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.herirCon(cuchillo);
        //assert
        assertEquals(2, policia.tiempoTranscurridoEnHoras());
    }
}
