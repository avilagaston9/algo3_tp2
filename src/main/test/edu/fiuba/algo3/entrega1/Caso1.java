package edu.fiuba.algo3.entrega1;


import clases.edificios.Edificio;
import clases.edificios.Banco;
import clases.pistas.Pista;
import clases.Ciudad;
import clases.*;
import clases.pistas.PistaConInformacion;
import clases.caracteristicasLadron.*;
import clases.pistas.PistaFacil;
import clases.rangos.Novato;
import clases.Policia;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

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

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(rango, montreal); // crear tiempo

        Pista pistaDevuelta = policia.visitar(bancoFrances);
        Pista pistaEsperada = new PistaFacil();
        pistaEsperada.agregarCaracteristica("pesos");

        assertEquals(pistaDevuelta.revelar(),pistaEsperada.revelar());
        */


        //se crea al ladrón
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new Rubio());
        builder.setHobby(new Tenis());
        builder.setSexo(new Femenino());
        builder.setSenia(new Tatuaje());
        builder.setVehiculo(new Moto());
        Ladron maria = builder.getLadron();

        //se crea al policia
        Policia policia = new Policia(new Novato(), new Ciudad("Montreal"));

        //se crea la pista
        PistaFacil pistaPrueba = new PistaFacil("Pesos");

        //se crea banco y se guarda la pista
        Edificio banco = new Banco();
        banco.setPista(pistaPrueba);

        //policia visita banco
        LinkedList<Pista> pistasDevueltas = policia.visitar(banco, maria);

        assert(pistasDevueltas.get(0).revelar().equals("Pesos"));
    }
}