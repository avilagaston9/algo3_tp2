package edu.fiuba.algo3.entrega1;


import clases.Edificio;
import clases.Pista;
import org.junit.jupiter.api.Test;

public class Caso1 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoDespliegaPistaCorrecta(){
        //set up
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Pista pistaBuenosAires = new Pista("pesos");
        buenosAires.agregarPistaBanco(pistaBuenosAires);

        Edificio banco = new Banco();
        montreal.agregarEdificio(banco);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        int cantArrestos = 0;
        Policia policia = new Policia(cantArrestos, montreal); // crear tiempo y rango

        Pista pista =policia.visitar(banco);

        assertEquals(pista.revelar(), pistaBuenosAires.revelar());







    }
}
