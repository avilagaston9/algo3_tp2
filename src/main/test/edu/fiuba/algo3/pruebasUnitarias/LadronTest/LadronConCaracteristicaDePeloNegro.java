package edu.fiuba.algo3.pruebasUnitarias.LadronTest;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import org.junit.jupiter.api.Test;

public class LadronConCaracteristicaDePeloNegro {
    @Test
    public void miPrueba(){
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
        builder.setHobby(new CaracteristicaLadron("le gusta escalar"));
        builder.setSexo(new CaracteristicaLadron("es hombre"));
        builder.setSenia(new CaracteristicaLadron("llevaba puesto un anillo"));
        builder.setVehiculo(new CaracteristicaLadron("manejaba un deportivo"));

        Ladron ricardo = builder.getLadron();

        CaracteristicaLadron caracteristica= new CaracteristicaLadron("tiene el pelo negro");

        assert ricardo.tieneLaCaracteristica(caracteristica);
    }
}
