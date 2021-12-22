package clases.ladron;

import clases.Ciudad;
import clases.caracteristicasLadron.CaracteristicaLadron;

public class LadronBuilder {

	private CaracteristicaLadron cabello;
	private CaracteristicaLadron hobby;
	private CaracteristicaLadron sexo;
	private CaracteristicaLadron senia;
	private CaracteristicaLadron vehiculo;
	private Ciudad ciudad;

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

	public void setCiudad(Ciudad ciudad){
		this.ciudad = ciudad;
	}

	public Ladron getLadron() {
		return new Ladron(this.cabello, this.hobby, this.sexo, this.senia, this.vehiculo);
	}
}