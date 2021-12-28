package clases.valorObjetoRobado;

import java.util.List;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public class ObjetoComun extends ObjetoRobado {

	public ObjetoComun() {
		this.largoRutaDeEscape = 4;
	}

	@Override
	public boolean esValidoPara(Novato rango) {
		return true;
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
		return false;
	}

	@Override
	public RutaDeEscape crearRutaDeEscape(List<Ciudad> ciudades) {
		return new RutaDeEscape(ciudades, this.nombreCiudad, this.largoRutaDeEscape);
	}
}
