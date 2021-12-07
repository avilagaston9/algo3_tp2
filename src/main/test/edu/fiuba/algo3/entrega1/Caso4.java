package edu.fiuba.algo3.entrega1;

import clases.*;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        int cantArrestos = 0;
        Policia policia = new Policia(cantArrestos, montreal); // crear tiempo y rango

        //act
        List pistas;
        for(int i = 1; i < 4; i++){

            pistas = policia.visitar(aeropuerto);
            assertEquals(pistas.get(0).revelar(), pistaBuenosAires.revelar());
            assertEquals(policia.tiempoTranscurrido(), i);
        }
    }

}
