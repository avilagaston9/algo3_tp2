package edu.fiuba.algo3.entrega1;
import clases.Ciudad;
import clases.Coordenadas;
import clases.Policia;
import clases.edificios.*;
import clases.ladron.*;
import clases.caracteristicasLadron.*;
import clases.pistas.*;
import clases.rangos.Novato;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Caso2 {

    @Test
    public void NovatoComienzaEnMontrealVisitaBancoYBibliotecaDespliegaPistaCorrecta(){

        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new Rubio());
        builder.setHobby(new Tenis());
        builder.setSexo(new Femenino());
        builder.setSenia(new Tatuaje());
        builder.setVehiculo(new Moto());
        Ladron maria = builder.getLadron();

        //se crea Montreal
        Coordenadas coordenadasMontreal = new Coordenadas(45.50884,-73.58781);
        Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);
        //se crea policia novato en montreal
        Policia policia = new Policia(new Novato(), montreal);

        PistaFacil pistaBanco = new PistaFacil("Pesos");
        PistaFacil pistaBiblioteca= new PistaFacil("Obelisco");


        Edificio banco = new Banco();
        banco.setPista(pistaBanco);

        Edificio biblioteca = new Biblioteca();
        biblioteca.setPista(pistaBiblioteca);

        LinkedList<Pista> pistasDeBanco = policia.visitar(banco, maria);
        LinkedList<Pista> pistasDeBiblioteca=policia.visitar(biblioteca,maria);

        assert(pistasDeBanco.get(0).revelar().equals("Pesos"));
        assert(pistasDeBiblioteca.get(0).revelar().equals("Obelisco"));
        assertEquals(3, policia.tiempoTranscurridoEnHoras());
    }
}



