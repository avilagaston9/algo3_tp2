package edu.fiuba.algo3.entrega1;
import clases.Edificio;
import clases.Pista;
import clases.Ciudad;
import clases.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Caso2 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoYBibliotecaDespliegaPistaCorrecta(){
        //set up
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        FabricaDePistas fabrica= new FabricaDePistas();
        Rango rango = new Novato();

        Edificio bancoProvincia = new Banco(fabrica);
        Edificio bancoFrances = new Banco(fabrica);
        Edificio biblioBsAs = new Biblioteca(fabrica);
        Edificio biblioParis = new Biblioteca(fabrica);

        bancoProvincia.agregarPista("pesos",rango);
        bancoFrances.agregarPista("euros",rango);
        biblioBsAs.agregarPista("Obelisco",rango);
        biblioParis.agregarPista("Torre Eifel",rango);


        montreal.agregarEdificio(bancoFrances);
        montreal.agregarEdificio(biblioParis);
        buenosAires.agregarEdificio(bancoProvincia);
        buenosAires.agregarEdificio(biblioBsAs);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Rango rango = new Novato();
        Policia policia = new Policia(rango, montreal); // crear tiempo y rango

        //act
        Pista pistasPrimeraVisita = policia.visitar(bancoFrances);
        Pista pistasSegundaVisita = policia.visitar(biblioParis);

        Pista pistaEsperadaPrimeraVisita= new PistaFacil();
        pistaEsperadaPrimeraVisita.agregarCaracteristica("pesos");

        Pista pistaEsperadaSegundaVisita= new PistaFacil();
        pistaEsperadaSegundaVisita.agregarCaracteristica("Obelisco");

        //assert
        assertEquals(pistasPrimeraVisita.revelar(),pistaEsperadaPrimeraVisita.revelar());
        assertEquals(pistasSegundaVisita.revelar(),pistaEsperadaSegundaVisita.revelar());
    }
}



