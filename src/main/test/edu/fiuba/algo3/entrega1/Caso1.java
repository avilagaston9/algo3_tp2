package edu.fiuba.algo3.entrega1;


import clases.Edificio;
import clases.Pista;
import clases.Ciudad;
import clases.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso1 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoDespliegaPistaCorrecta(){
        //set up
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Rango rango= new Novato();
        FabricaDePistas fabrica= new FabricaDePistas();

        Edificio bancoFrances = new Banco(fabrica);
        Edificio bancoProvincia= new Banco(fabrica);

        bancoProvincia.agregarPista("pesos",rango);
        bancoFrances.agregarPista("euros",rango);
        montreal.agregarEdificio(bancoFrances);
        buenosAires.agregarEdificio(bancoProvincia);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(rango, montreal); // crear tiempo

        Pista pistaDevuelta = policia.visitar(bancoFrances);
        Pista pistaEsperada = new PistaFacil();
        pistaEsperada.agregarCaracteristica("pesos");

        assertEquals(pistaDevuelta.revelar(),pistaEsperada.revelar());
    }
}
