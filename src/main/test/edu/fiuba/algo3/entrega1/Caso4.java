package edu.fiuba.algo3.entrega1;

import clases.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso4 {

    @Test
    public void NovatoVisitaUnAeropuertoTresVeces(){

        //arrange
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Pistas pistasAeropuerto = new Pistas();
        Pista pistaBuenosAires = new Pista("Su bandera es blanca y celeste");
        pistasAeropuerto.agregarPistaFacil(pistaBuenosAires);
        buenosAires.agregarPistasAeropuerto(pistasAeropuerto);

        Edificio aeropuerto = new Aeropuerto();
        montreal.agregarEdificio(aeropuerto);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);
        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(new Novato(), montreal); // crear tiempo y rango

        //act
        List <Pista> pistas;
        for(int i = 0; i < 3; i++){

            pistas = policia.visitar(aeropuerto);
            //Chequea que siempre sea la misma pista
            assertEquals(pistas.get(0).revelar(), pistaBuenosAires.revelar());
        }
        assertEquals(policia.tiempoTranscurrido(), 0);
    }

    @Test
    public void NovatoVisitaUnAeropuerto55Veces(){

        //arrange
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");

        Pistas pistasAeropuerto = new Pistas();
        Pista pistaBuenosAires = new Pista("Su bandera es blanca y celeste");
        pistasAeropuerto.agregarPistaFacil(pistaBuenosAires);
        buenosAires.agregarPistasAeropuerto(pistasAeropuerto);

        Edificio aeropuerto = new Aeropuerto();
        montreal.agregarEdificio(aeropuerto);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);
        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(new Novato(), montreal); // crear tiempo y rango

        //act
        List<Pista> pistas;
        for(int i = 0; i < 55; i++){

            pistas = policia.visitar(aeropuerto);
            //Chequea que siempre sea la misma pista
            assertEquals(pistas.get(0).revelar(), pistaBuenosAires.revelar());
        }
        assertEquals(policia.tiempoTranscurrido(), 0);
    }

}
