package edu.fiuba.algo3.entrega1;

import clases.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso4 {

    @Test
    public void NovatoVisitaUnAeropuertoTresVeces(){
        /*

        //arrange
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        FabricaDePistas fabrica= new FabricaDePistas();
        Rango rango=new Novato();

        Edificio aeropuertoFrances = new Aeropuerto(fabrica);
        Edificio ezeiza= new Aeropuerto(fabrica);
        ezeiza.agregarPista("Su bandera es blanca y celeste",rango);
        aeropuertoFrances.agregarPista("Su bandera es azul ,roja y blanca",rango);
        montreal.agregarEdificio(aeropuertoFrances);
        buenosAires.agregarEdificio(ezeiza);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);
        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(rango, montreal); // crear tiempo

        //act
        Pista pista;
        Pista pistaEsperada= new PistaFacil();
        pistaEsperada.agregarCaracteristica("Su bandera es blanca y celeste");
        for(int i = 0; i < 3; i++){

            pista = policia.visitar(aeropuertoFrances);
            //Chequea que siempre sea la misma pista
            assertEquals(pista.revelar(), pistaEsperada.revelar());
        }
        assertEquals(policia.tiempoTranscurrido(), 0);
    }

    @Test
    public void NovatoVisitaUnAeropuerto55Veces(){

        //arrange
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        FabricaDePistas fabrica= new FabricaDePistas();
        Rango rango=new Novato();


        Edificio aeropuertoFrances = new Aeropuerto(fabrica);
        Edificio ezeiza= new Aeropuerto(fabrica);
        aeropuertoFrances.agregarPista("Su bandera es azul,roja y blanca",rango);
        ezeiza.agregarPista("Su bandera es blanca y celeste",rango);
        montreal.agregarEdificio(aeropuertoFrances);
        buenosAires.agregarEdificio(ezeiza);

        Ladron maria = new Ladron("Maria");
        buenosAires.agregarLadron(maria);
        int distancia = 9000;
        montreal.agregarSiguiente(buenosAires, distancia);

        Policia policia = new Policia(rango, montreal); // crear tiempo y rango

        //act
        Pista pista;
        Pista pistaEsperada= new PistaFacil();
        pistaEsperada.agregarCaracteristica("Su bandera es blanca y celeste");
        for(int i = 0; i < 55; i++){

            pista = policia.visitar(aeropuertoFrances);
            //Chequea que siempre sea la misma pista
            assertEquals(pista.revelar(),pistaEsperada.revelar());
        }
        assertEquals(policia.tiempoTranscurrido(), 0);

         */
    }
}
