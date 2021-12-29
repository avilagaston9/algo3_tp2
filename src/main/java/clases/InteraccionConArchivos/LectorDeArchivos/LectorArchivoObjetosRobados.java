package clases.InteraccionConArchivos.LectorDeArchivos;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import clases.ObjetoRobado.ObjetoComun;
import clases.ObjetoRobado.ObjetoMuyValioso;
import clases.ObjetoRobado.ObjetoRobado;
import clases.ObjetoRobado.ObjetoValioso;

public class LectorArchivoObjetosRobados implements LectorArchivos {
	@Override
	public ArrayList leer(String pathArchivo) {
		JSONParser parser = new JSONParser();
		ArrayList<ObjetoRobado> objetosRobados = new ArrayList<ObjetoRobado>();
		try {
			String pathCompleto = (System.getProperty("user.dir") + pathArchivo);
			FileReader fileReader = new FileReader(pathCompleto);
			Object obj = parser.parse(fileReader);
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray jsonLadrones = (JSONArray) jsonObject.get("tesoros");
			JSONObject actual;
			ObjetoRobado objetoRobadoActual;
			for (int i = 0; i < jsonLadrones.size(); i++) {

				actual = (JSONObject) jsonLadrones.get(i);

				String nombre = (String) actual.get("tesoro");
				String ciudad = (String) actual.get("ciudad");

				switch ((String) actual.get("valor")) {
					case "Comun" : {
						objetoRobadoActual = new ObjetoComun(nombre, ciudad);
					}
						break;
					case "Valioso" : {
						objetoRobadoActual = new ObjetoValioso(nombre, ciudad);
					}
						break;
					default : {
						objetoRobadoActual = new ObjetoMuyValioso(nombre, ciudad);
					}
				}

				objetosRobados.add(objetoRobadoActual);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objetosRobados;
	}
}
