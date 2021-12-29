package clases.ObjetoRobado;

import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public class ObjetoMuyValioso extends ObjetoRobado {

	public ObjetoMuyValioso(String nombre, String ciudad) {
		super(nombre, ciudad);
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

}
