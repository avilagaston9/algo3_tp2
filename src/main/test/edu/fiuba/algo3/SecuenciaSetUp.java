package edu.fiuba.algo3;

import java.util.ArrayList;

import clases.*;
import clases.ladron.LadronBuilder;
import clases.rangos.Novato;
import clases.rangos.Rango;
import clases.valorObjetoRobado.ObjetoComun;

public class SecuenciaSetUp {

	public SecuenciaSetUp() {

		Coordenadas coordenadas1 = new Coordenadas(0, 0);
		Ciudad ciudad1 = new Ciudad("ciudad1", coordenadas1);

		Coordenadas coordenadas2 = new Coordenadas(1, 1);
		Ciudad ciudad2 = new Ciudad("ciudad2", coordenadas2);

		Coordenadas coordenadas3 = new Coordenadas(2, 2);
		Ciudad ciudad3 = new Ciudad("ciudad3", coordenadas3);

		Coordenadas coordenadas4 = new Coordenadas(3, 3);
		Ciudad ciudad4 = new Ciudad("ciudad4", coordenadas4);

		Coordenadas coordenadas5 = new Coordenadas(4, 4);
		Ciudad ciudad5 = new Ciudad("ciudad5", coordenadas5);

		Coordenadas coordenadas6 = new Coordenadas(5, 5);
		Ciudad ciudad6 = new Ciudad("ciudad6", coordenadas6);

		Coordenadas coordenadas7 = new Coordenadas(6, 6);
		Ciudad ciudad7 = new Ciudad("ciudad7", coordenadas7);

		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		ciudades.add(ciudad1);
		ciudades.add(ciudad2);
		ciudades.add(ciudad3);
		ciudades.add(ciudad4);
		ciudades.add(ciudad5);
		ciudades.add(ciudad6);
		ciudades.add(ciudad7);

		Rango novato = new Novato();

		ObjetoComun objetoRobado = new ObjetoComun();

		RutaDeEscape rutaDeEscape = new RutaDeEscape(ciudades, objetoRobado);

		PoliciaBuilder builderPolicia = new PoliciaBuilder();
		builderPolicia.setRango(novato);
		builderPolicia.setUltimaCiudad(rutaDeEscape);

		Policia policia = builderPolicia.getPolicia();

		LadronBuilder builderLadron = new LadronBuilder();
	}

}
