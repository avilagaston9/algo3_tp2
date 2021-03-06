package edu.fiuba.algo3.modelo.ladron;

import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;

public class LadronBuilder {

	private CaracteristicaLadron cabello;
	private CaracteristicaLadron hobby;
	private CaracteristicaLadron sexo;
	private CaracteristicaLadron senia;
	private CaracteristicaLadron vehiculo;
	private String nombre;

	public void setCabello(CaracteristicaLadron cabello) {
		this.cabello = cabello;
	}

	public void setHobby(CaracteristicaLadron hobby) {
		this.hobby = hobby;
	}

	public void setSexo(CaracteristicaLadron sexo) {
		this.sexo = sexo;
	}

	public void setSenia(CaracteristicaLadron senia) {
		this.senia = senia;
	}

	public void setVehiculo(CaracteristicaLadron vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ladron getLadron() {
		return new Ladron(this.nombre, this.cabello, this.hobby, this.sexo, this.senia, this.vehiculo);
	}

}