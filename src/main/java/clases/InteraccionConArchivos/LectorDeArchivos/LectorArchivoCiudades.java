package clases.InteraccionConArchivos.LectorDeArchivos;


import clases.CiudadBuilder;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import java.lang.reflect.Array;
import clases.Ciudad;
import clases.Coordenadas;
import clases.FabricaEdificios.FabricaAeropuerto;
import clases.FabricaEdificios.FabricaBancos;
import clases.FabricaEdificios.FabricaBiblioteca;
import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
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

        //LISTA DE CIUDADES
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        //CREO LAS FABRICAS DE LOS EDIFICIOS PARA DEVOLVER LAS CIUDADES COMPLETAS...
        FabricaBancos fabricaBancos = new FabricaBancos();
        FabricaBiblioteca fabricaBiblioteca = new FabricaBiblioteca();
        FabricaAeropuerto fabricaAeropuerto = new FabricaAeropuerto();

        //CIUDAD BUILDER
        CiudadBuilder ciudadBuilder = new CiudadBuilder();

        for(int i = 0; i < array.size(); i++){

            JSONObject ciudadJson = (JSONObject) array.get(i);

            //Nombre y Coodenadas de la Ciudad...
            Coordenadas coordenadasCiudad = new Coordenadas((double)ciudadJson.get("latitud"), (double)ciudadJson.get("longitud"));
            String nombreCiudad = (String)ciudadJson.get("ciudad");

            // EDIFICIOS...

            // BANCO...
            PistaFacil pistaFacilBanco = new PistaFacil((String)ciudadJson.get("moneda"));
            PistaMedia pistaMediaBanco = new PistaMedia((String)ciudadJson.get("industrias"));
            PistaDificil pistaDificilBanco = new PistaDificil((String) ciudadJson.get("arte"));

            Banco banco = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco, pistaDificilBanco);

            // BIBLIOTECA
            PistaFacil pistaFacilBiblioteca = new PistaFacil((String)ciudadJson.get("geografia"));
            PistaMedia pistaMediaBiblioteca = new PistaMedia((String)ciudadJson.get("etnias"));
            PistaDificil pistaDificilBiblioteca = new PistaDificil((String)ciudadJson.get("religion"));

            Biblioteca biblioteca = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBanco, pistaMediaBanco, pistaDificilBanco);

            // AEROPUERTO
            PistaFacil pistaFacilAeropuerto = new PistaFacil((String) ciudadJson.get("colorBandera"));
            PistaMedia pistaMediaAeropuero = new PistaMedia((String) ciudadJson.get("idioma"));
            PistaDificil pistaDificilAeropuerto = new PistaDificil((String) ciudadJson.get("representante"));

            Aeropuerto aeropuerto = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto, pistaMediaAeropuero, pistaDificilAeropuerto);

            //Se crea la ciudad
            ciudadBuilder.setNombre(nombreCiudad);
            ciudadBuilder.setCoordenadas(coordenadasCiudad);
            ciudadBuilder.setAeropuerto(aeropuerto);
            ciudadBuilder.setBanco(banco);
            ciudadBuilder.setBiblioteca(biblioteca);

            ciudades.add(ciudadBuilder.getCiudad());

        }
        return ciudades;
    }
}
