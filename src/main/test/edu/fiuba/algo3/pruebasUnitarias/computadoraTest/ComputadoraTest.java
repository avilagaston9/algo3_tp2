package edu.fiuba.algo3.pruebasUnitarias.computadoraTest;

import clases.Computadora;
import clases.OrdenArresto;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ComputadoraTest {
    @Test
    public void EmitoOrdenDeArrestoContraMariaCorrectamente(){
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
        builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
        builder.setSexo(new CaracteristicaLadron("es mujer"));
        builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
        builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));

        // primer ladron
        Ladron maria = builder.getLadron();

        ArrayList<Ladron> ladrones= new ArrayList<>();
        ladrones.add(maria);

        Computadora compu=new Computadora(ladrones);

        OrdenArresto orden;

        orden=compu.emitirOrdenDeArresto(maria);

        assert (orden.comparar(maria));
    }
}
