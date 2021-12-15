package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Policia;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import org.junit.jupiter.api.Test;

public class caso2 {

    @Test
    public void detectiveConRangoInvestigadorTomaCasoDeUnRoboViajaDeMontrealAMexico(){

        // Set Up
        LadronBuilder ladronBuilder = new LadronBuilder();
        ladronBuilder.setCabello(new Negro());
        ladronBuilder.setHobby(new Tenis());
        ladronBuilder.setSexo(new Masculino());
        ladronBuilder.setSenia(new Joyas());
        ladronBuilder.setVehiculo(new Limusina());
        Ladron Luis = ladronBuilder.getLadron();

        Ciudad ciudadInicial = new Ciudad("Montreal");

        Policia policia= new Policia(new Investigador(),new Ciudad("montreal"));

        Ciudad ciudadProximoDestino = new Ciudad("Ciudad De Mexico");

        policia.viajarA(ciudadProximoDestino);

    }
}
