package edu.fiuba.algo3.entrega2;

import clases.*;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.rangos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class caso4 {
    @Test
    public void detectiveIntentaAtraparLadronSinOrdenDeArresto(){

        Rango rango= new Novato();
        // ahora policia tiene un atributo orden de arresto
        Policia policia= new Policia(rango,new Ciudad("Bs.As"));

        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new Rubio());
        builder.setHobby(new Tenis());
        builder.setSexo(new Femenino());
        builder.setSenia(new Tatuaje());
        builder.setVehiculo(new Moto());
        Ladron maria = builder.getLadron();

        assertFalse(policia.arrestarA(maria));

    }
}
