package edu.fiuba.algo3;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;

import java.util.ArrayList;

public class Ladrones {
    ArrayList<Ladron> ladrones;

    public Ladrones(){
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new CaracteristicaLadron("Su pelo es rubio"));
        builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
        builder.setSexo(new CaracteristicaLadron("es mujer"));
        builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
        builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
        Ladron maria = builder.getLadron();
    }
}
