package edu.fiuba.algo3.entrega1;
import clases.Edificio;
import clases.Pista;
import clases.Ciudad;
import clases.*;
import org.junit.jupiter.api.Test;
import java.util.List;


public class Caso2 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoYBibliotecaDespliegaPistaCorrecta(){
        //set up
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Pistas pistasBanco = new Pistas();
        Pistas pistasBiblioteca = new Pistas();

        Pista pistaBuenosAires = new Pista("pesos");
        Pista otraPistaBuenosAires = new Pista("Obelisco");

        pistasBanco.agregarPistaFacil(pistaBuenosAires);
        pistasBiblioteca.agregarPistaFacil(otraPistaBuenosAires);

        buenosAires.agregarPistasBanco(pistasBanco);
        buenosAires.agregarPistasBiblioteca(pistasBiblioteca);

        Edificio banco = new Banco();
        Edificio biblioteca = new Biblioteca();
        montreal.agregarEdificio(banco);
        montreal.agregarEdificio(biblioteca);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);

        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Rango rango = new Novato();
        Policia policia = new Policia(rango, montreal); // crear tiempo y rango

        //act
        List <Pista> pistasPrimeraVisita = policia.visitar(banco);
        List <Pista> pistasSegundaVisita = policia.visitar(biblioteca);

        //assert
        assert(pistasPrimeraVisita.get(0)).revelar().equals("pesos");
        assert((pistasSegundaVisita.get(0)).revelar().equals("Obelisco"));
    }
}



