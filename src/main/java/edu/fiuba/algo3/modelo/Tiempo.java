package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.armas.Cuchillo;
import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class Tiempo {

	private int contadorDeSueño;
	private int horasDeSueño;
	private int horas;
	private boolean heridoConCuchillo;
	private int numeroVisita;

	public Tiempo() {

		this.horas = 0;
		this.contadorDeSueño = 0;
		this.horasDeSueño = 8;
		this.heridoConCuchillo = false;
		this.numeroVisita = 1;
	}

	private int calcularHorasConsumidas(int kilometros, int costoFijo) {
		this.numeroVisita = 1;
		return (kilometros / costoFijo);
	}

	public void sumarHoras(int cantidad) {

		this.horas += cantidad;
		this.contadorDeSueño += cantidad;
		if (this.contadorDeSueño >= 16) {

			this.horas += this.horasDeSueño;
			this.contadorDeSueño = (this.contadorDeSueño - 16);
		}
	}

	public int tiempoTranscurridoEnHoras() {
		return this.horas;
	}

	public void dormir() {

		sumarHoras(8);
	}

	public void sumarVisita() {

		if (this.numeroVisita > 3) {

			this.sumarHoras(3);
			return;
		}
		this.sumarHoras(this.numeroVisita);
		this.numeroVisita++;
	}

	public void herirCon(Cuchillo cuchillo) {

		if (this.heridoConCuchillo) {

			this.sumarHoras(1);
			return;
		}
		this.heridoConCuchillo = true;
		this.sumarHoras(2);
	}

	public void viajar(int kilometros, Novato unRango) {
		this.sumarHoras(calcularHorasConsumidas(kilometros, 900));
	}

	public void viajar(int kilometros, Detective unRango) {
		this.sumarHoras(calcularHorasConsumidas(kilometros, 1100));
	}

	public void viajar(int kilometros, Investigador unRango) {
		this.sumarHoras(calcularHorasConsumidas(kilometros, 1300));
	}

	public void viajar(int kilometros, Sargento unRango) {
		this.sumarHoras(calcularHorasConsumidas(kilometros, 1500));
	}

}
