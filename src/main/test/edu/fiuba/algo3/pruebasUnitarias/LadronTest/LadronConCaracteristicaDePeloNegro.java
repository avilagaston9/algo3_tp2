package edu.fiuba.algo3.pruebasUnitarias.LadronTest;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.ladron.LadronBuilder;

public class LadronConCaracteristicaDePeloNegro {
	@Test
	public void miPrueba() {
		LadronBuilder builder = new LadronBuilder();
		builder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
		builder.setHobby(new CaracteristicaLadron("le gusta escalar"));
		builder.setSexo(new CaracteristicaLadron("es hombre"));
		builder.setSenia(new CaracteristicaLadron("llevaba puesto un anillo"));
		builder.setVehiculo(new CaracteristicaLadron("manejaba un deportivo"));

		Ladron ricardo = builder.getLadron();

		CaracteristicaLadron caracteristica = new CaracteristicaLadron("tiene el pelo negro");

		assert ricardo.tieneLaCaracteristica(caracteristica);
	}
}
