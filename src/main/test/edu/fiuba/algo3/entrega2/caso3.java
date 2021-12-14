package edu.fiuba.algo3.entrega2;

import clases.*;
import clases.caracteristicasLadron.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import org.junit.jupiter.api.Test;

import java.util.*;

public class caso3 {
    @Test
    public void CargarDatosEnComputadoraYRealizarUnaBusqueda() {
        LadronBuilder builder = new LadronBuilder();
        builder.setCabello(new Rubio());
        builder.setHobby(new Tenis());
        builder.setSexo(new Femenino());
        builder.setSenia(new Tatuaje());
        builder.setVehiculo(new Moto());

        // primer ladron
        Ladron maria = builder.getLadron();

        builder.setCabello(new Negro());
        builder.setHobby(new Musica());
        builder.setSexo(new Masculino());
        builder.setSenia(new Anillo());
        builder.setVehiculo(new Deportivo());

        // segundo ladron
        Ladron ricardo = builder.getLadron();

        builder.setCabello(new Negro());
        builder.setHobby(new Alpinismo());
        builder.setSexo(new Masculino());
        builder.setSenia(new Joyas());
        builder.setVehiculo(new Limusina());

        // tercer ladron
        Ladron juan = builder.getLadron();

        ArrayList<Ladron> ladrones=new ArrayList<>();
        ladrones.add(maria);
        ladrones.add(ricardo);
        ladrones.add(juan);

        Tiempo tiempo= new Tiempo();

        Computadora compu = new Computadora(ladrones);

        CaracteristicaLadron colorDePelo= new Negro();
        CaracteristicaLadron sexo= new Masculino();

        List<CaracteristicaLadron> caracteristicas=new ArrayList<>();

        caracteristicas.add(colorDePelo);
        caracteristicas.add(sexo);

        ArrayList<Ladron> sospechosos = compu.cargarDatosYBuscar(caracteristicas,tiempo);

        assert (sospechosos.contains(juan));
        assert (sospechosos.contains(ricardo));
        assert (sospechosos.size()==2);
        assert (tiempo.tiempoTranscurridoEnHoras()==3);

    }
}
