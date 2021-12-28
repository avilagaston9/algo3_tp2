package clases.valorObjetoRobado;

import java.util.List;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public class ObjetoMuyValioso extends ObjetoRobado {

	public ObjetoMuyValioso() {
		this.largoRutaDeEscape = 7;
	}

	@Override
	public boolean esValidoPara(Novato rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Detective rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Investigador rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Sargento rango) {
		return true;
	}

	@Override
	public RutaDeEscape crearRutaDeEscape(List<Ciudad> ciudades) {
		return new RutaDeEscape(ciudades, this.nombreCiudad, this.largoRutaDeEscape);
	}
}
