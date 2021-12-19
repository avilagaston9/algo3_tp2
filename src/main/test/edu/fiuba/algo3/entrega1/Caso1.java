package edu.fiuba.algo3.entrega1;


import clases.Coordenadas;
import clases.edificios.*;
import clases.ladron.*;
import clases.pistas.*;
import clases.Ciudad;
import clases.caracteristicasLadron.*;
import clases.rangos.Novato;
import clases.Policia;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso1 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoDespliegaPistaCorrecta() {
        /*
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

        //int distancia = 9000; ESTO NO VA MAS
        montreal.agregarSiguiente(buenosAires);

        Policia policia = new Policia(rango, montreal); // crear tiempo

        Pista pistaDevuelta = policia.visitar(bancoFrances);
        Pista pistaEsperada = new PistaFacil();
        pistaEsperada.agregarCaracteristica("pesos");

        assertEquals(pistaDevuelta.revelar(),pistaEsperada.revelar());
        */


        //se crea al ladrón
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
        builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
        builder.setSexo(new CaracteristicaLadron("es mujer"));
        builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
        builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
        Ladron maria = builder.getLadron();

        //se crea Montreal
        Coordenadas coordenadasMontreal = new Coordenadas(45.50884,-73.58781);
        Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);
        //se crea policia novato en montreal
        Policia policia = new Policia(new Novato(), montreal);

        //se crea la pista
        PistaFacil pistaPrueba = new PistaFacil("Pesos");

        //se crea banco y se guarda la pista
        Edificio banco = new Banco();
        banco.setPista(pistaPrueba);

        //policia visita banco
        LinkedList<Pista> pistasDevueltas = policia.visitar(banco, maria);

        assert(pistasDevueltas.get(0).revelar().equals("Pesos"));
        assertEquals(1, policia.tiempoTranscurridoEnHoras());
    }
}