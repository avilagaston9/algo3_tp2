package edu.fiuba.algo3.entrega1;


<<<<<<< HEAD
import clases.Edificio;
import clases.Pista;
import clases.Ciudad
=======
import clases.*;
>>>>>>> 5007e1aaaa0d861cb15c72944186271e89ed5821
import org.junit.jupiter.api.Test;

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

        int cantArrestos = 0;
        Policia policia = new Policia(cantArrestos, montreal); // crear tiempo y rango

        Pista pista =policia.visitar(banco);

        assertEquals(pista.revelar(), pistaBuenosAires.revelar());







    }
}
