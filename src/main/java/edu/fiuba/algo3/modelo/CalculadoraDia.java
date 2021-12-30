package edu.fiuba.algo3.modelo;

public class CalculadoraDia {

	public String calcularDia(int cantidadHoras) {

		if (cantidadHoras < 17) {
			return "Lunes";
		}
		if (cantidadHoras < 41) {
			return "Martes";
		}
		if (cantidadHoras < 65) {
			return "Miercoles";
		}
		if (cantidadHoras < 89) {
			return "Jueves";
		}
		if (cantidadHoras < 113) {
			return "Viernes";
		}
		if (cantidadHoras < 137) {
			return "Sábado";
		}
		return "Domingo";
	}
}
