package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Ciudad;
import clases.Coordenadas;
import clases.FabricaEdificios.FabricaAeropuerto;
import clases.FabricaEdificios.FabricaBancos;
import clases.FabricaEdificios.FabricaBiblioteca;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoCiudades implements LectorArchivos {


    @Override
    public ArrayList leer(String pathArchivo) {

        JSONParser parser = new JSONParser();

        try {
            FileReader jsonReader = new FileReader(pathArchivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object obj = parser.parse(jsonReader);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JSONObject empJsonObject = (JSONObject) obj;

        JSONArray array = (JSONArray) empJsonObject.get("ciudades");

        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        //CREO LAS FABRICAS DE LOS EDIFICIOS PARA DEVOLVER LAS CIUDADES COMPLETAS...
        FabricaBancos fabricaBancos = new FabricaBancos();
        FabricaBiblioteca fabricaBiblioteca = new FabricaBiblioteca();
        FabricaAeropuerto fabricaAeropuerto = new FabricaAeropuerto();

        for(int i = 0; i < array.size(); i++){

            JSONObject ciudadJson = (JSONObject) array.get(i);

            //Nombre y Coodenadas de la Ciudad...
            Coordenadas coordenadasCiudad = new Coordenadas((double)ciudadJson.get("latitud"), (double)ciudadJson.get("longitud"));
            String nombreCiudad = (String)ciudadJson.get("ciudad");


            // EDIFICIOS...

            // BANCO...
            PistaFacil pistaFacilBanco = new PistaFacil((String)ciudadJson.get("moneda"));
            ArrayList listaIndustrias = (ArrayList) ciudadJson.get("industrias");
            PistaMedia pistaMediaBanco = new PistaMedia((String)listaIndustrias.get(0));
            PistaDificil pistaDificilBanco = new PistaDificil((String) ciudadJson.get("arte"));

            Banco banco = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco, pistaDificilBanco);

            // BIBLIOTECA
            PistaFacil pistaFacilBiblioteca = new PistaFacil((String)ciudadJson.get("geografia"));
            ArrayList listaEtnias = (ArrayList) ciudadJson.get("etnias");
            PistaMedia pistaMediaBiblioteca = new PistaMedia((String)listaEtnias.get(0));
            PistaDificil pistaDificilBiblioteca = new PistaDificil((String)ciudadJson.get("religion"));

            Biblioteca biblioteca = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBanco, pistaMediaBanco, pistaDificilBanco);

            // AEROPUERTO
            PistaFacil pistaFacilAeropuerto = new PistaFacil((String) ciudadJson.get("colorBandera"));
            PistaMedia pistaMediaAeropuero = new PistaMedia((String) ciudadJson.get("idioma"));





        }






        return null;
    }

    
}
