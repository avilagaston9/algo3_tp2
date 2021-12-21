package edu.fiuba.algo3.entrega2;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import clases.Computadora;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;

public class Caso3 {
	@Test
	public void CargarDatosEnComputadoraYRealizarUnaBusqueda() {
		LadronBuilder builder = new LadronBuilder();
		builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
		builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		builder.setSexo(new CaracteristicaLadron("es mujer"));
		builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
		builder.setVehiculo(new CaracteristicaLadron("se movia en moto"));

		// primer ladron
		Ladron maria = builder.getLadron();

		builder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
		builder.setHobby(new CaracteristicaLadron("le gusta escalar"));
		builder.setSexo(new CaracteristicaLadron("es hombre"));
		builder.setSenia(new CaracteristicaLadron("llevaba puesto un anillo"));
		builder.setVehiculo(new CaracteristicaLadron("manejaba un deportivo"));

		// segundo ladron
		Ladron ricardo = builder.getLadron();

		builder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
		builder.setHobby(new CaracteristicaLadron("le gusta escalar"));
		builder.setSexo(new CaracteristicaLadron("es hombre"));
		builder.setSenia(new CaracteristicaLadron("usaba muchas joyas"));
		builder.setVehiculo(new CaracteristicaLadron("se movia en una limusina"));

		// tercer ladron
		Ladron juan = builder.getLadron();

		ArrayList<Ladron> ladrones = new ArrayList<>();
		ladrones.add(maria);
		ladrones.add(ricardo);
		ladrones.add(juan);

		Computadora compu = new Computadora(ladrones);

		CaracteristicaLadron colorDePelo = new CaracteristicaLadron("tiene el pelo negro");
		CaracteristicaLadron sexo = new CaracteristicaLadron("es hombre");

		// List<CaracteristicaLadron> caracteristicas=new ArrayList<>();
		// caracteristicas.add(colorDePelo);
		// caracteristicas.add(sexo);

		// ArrayList<Ladron> sospechosos =
		// compu.cargarDatosYBuscar(caracteristicas,tiempo);
		compu.cargarCaracteristica(colorDePelo);
		compu.cargarCaracteristica(sexo);
		ArrayList<Ladron> sospechosos = compu.buscarSospechosos(); // todo nombres variables

		assert (sospechosos.contains(juan));
		assert (sospechosos.contains(ricardo));
		assert (sospechosos.size() == 2);

		// todo formateador de codigo

	}
}
