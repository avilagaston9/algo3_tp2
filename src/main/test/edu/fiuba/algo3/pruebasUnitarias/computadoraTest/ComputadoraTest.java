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
        builder.setCabello(new Rubio());
        builder.setHobby(new Tenis());
        builder.setSexo(new Femenino());
        builder.setSenia(new Tatuaje());
        builder.setVehiculo(new Moto());

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
