package edu.fiuba.algo3.entrega1;


import clases.Edificio;
import clases.Pista;
import clases.Ciudad;
import clases.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Caso1 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoDespliegaPistaCorrecta(){
        //set up
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Pistas pistasBanco = new Pistas();
        Pista pistaBuenosAires = new Pista("pesos");
        pistasBanco.agregarPistaFacil(pistaBuenosAires);
        buenosAires.agregarPistasBanco(pistasBanco);

        Edificio banco = new Banco();
        montreal.agregarEdificio(banco);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Rango rango = new Novato();
        Policia policia = new Policia(rango, montreal); // crear tiempo y rango

        List <Pista> pistas = policia.visitar(banco);

        assert(pistas.get(0).revelar().equals("pesos"));
    }
}
