package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Computadora;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.rangos.Detective;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Caso5 {

    @Test
    public void detectiveHaceSeisArrestosYTomaUnCaso(){


        //Creo ciudad...
        Coordenadas coordenadasMontreal = new Coordenadas(45.50884,-73.58781);
        Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

        //Creo un policia de rango Detective...
        Policia policia = new Policia(new Detective(), montreal);

        LadronBuilder ladronBuilder = new LadronBuilder();
        ladronBuilder.setSexo(new Masculino());
        ladronBuilder.setHobby(new Tenis());
        ladronBuilder.setCabello(new Negro());
        ladronBuilder.setSenia(new Anillo());
        ladronBuilder.setVehiculo(new Moto());

        Ladron juan = ladronBuilder.getLadron();

        //lista de ladrones...
        ArrayList<Ladron> ladrones=new ArrayList<>();
        ladrones.add(juan);


        Computadora compu = new Computadora(ladrones);

        //Cargo en computadora los datos del ladron que se esta persiguiendo
        compu.cargarCaracteristica(new Masculino());
        compu.cargarCaracteristica(new Tenis());
        compu.cargarCaracteristica(new Negro());
        compu.cargarCaracteristica(new Anillo());
        compu.cargarCaracteristica(new Moto());

        policia.emitirOrdenDeArresto(compu.emitirOrdenDeArresto(juan));

        }


    }