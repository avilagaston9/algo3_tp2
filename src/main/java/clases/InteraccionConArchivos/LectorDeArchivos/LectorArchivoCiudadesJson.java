package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.ciudades.Ciudad;
import clases.CiudadBuilder;
import clases.Coordenadas;
import clases.FabricaEdificios.FabricaAeropuerto;
import clases.FabricaEdificios.FabricaBancos;
import clases.FabricaEdificios.FabricaBiblioteca;
import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivoCiudadesJson implements Lector {

    private String pathArchivo;

    public LectorArchivoCiudadesJson(String pathArchivo){
        this.pathArchivo = pathArchivo;
    }

    @Override
    public ArrayList leer() {

        JSONParser parser = new JSONParser();
        FileReader fileReader = null;

        FileReader jsonReader;

        try {
            String pathCompleto = ((String) System.getProperty("user.dir") + pathArchivo);
            fileReader = new FileReader(pathCompleto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object obj = null;
        try {
            obj = parser.parse(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JSONObject empJsonObject = (JSONObject) obj;

        JSONArray array = (JSONArray) empJsonObject.get("ciudades");

        // LISTA DE CIUDADES
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        // CREO LAS FABRICAS DE LOS EDIFICIOS PARA DEVOLVER LAS CIUDADES COMPLETAS...
        FabricaBancos fabricaBancos = new FabricaBancos();
        FabricaBiblioteca fabricaBiblioteca = new FabricaBiblioteca();
        FabricaAeropuerto fabricaAeropuerto = new FabricaAeropuerto();

        // CIUDAD BUILDER
        CiudadBuilder ciudadBuilder = new CiudadBuilder();

        for (int i = 0; i < array.size(); i++) {

            JSONObject ciudadJson = (JSONObject) array.get(i);

            // Nombre y Coodenadas de la Ciudad...
            Coordenadas coordenadasCiudad = new Coordenadas((double) ciudadJson.get("latitud"),
                    (double) ciudadJson.get("longitud"));
            String nombreCiudad = (String) ciudadJson.get("ciudad");

            String descripcionCiudad = (String) ciudadJson.get("descripcion");

            // EDIFICIOS...

            // BANCO...
            PistaFacil pistaFacilBanco = new PistaFacil((String) ciudadJson.get("moneda"));
            PistaMedia pistaMediaBanco = new PistaMedia((String) ciudadJson.get("industrias"));
            PistaDificil pistaDificilBanco = new PistaDificil((String) ciudadJson.get("arte"));

            Banco banco = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco, pistaDificilBanco);

            // BIBLIOTECA
            PistaFacil pistaFacilBiblioteca = new PistaFacil((String) ciudadJson.get("geografia"));
            PistaMedia pistaMediaBiblioteca = new PistaMedia((String) ciudadJson.get("etnias"));
            PistaDificil pistaDificilBiblioteca = new PistaDificil((String) ciudadJson.get("religion"));

            Biblioteca biblioteca = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBiblioteca,
                    pistaMediaBiblioteca, pistaDificilBiblioteca);

            // AEROPUERTO
            PistaFacil pistaFacilAeropuerto = new PistaFacil((String) ciudadJson.get("colorBandera"));
            PistaMedia pistaMediaAeropuero = new PistaMedia((String) ciudadJson.get("idioma"));
            PistaDificil pistaDificilAeropuerto = new PistaDificil((String) ciudadJson.get("representante"));

            Aeropuerto aeropuerto = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto,
                    pistaMediaAeropuero, pistaDificilAeropuerto);

            // Se crea la ciudad
            ciudadBuilder.setNombre(nombreCiudad);
            ciudadBuilder.setCoordenadas(coordenadasCiudad);
            ciudadBuilder.setAeropuerto(aeropuerto);
            ciudadBuilder.setBanco(banco);
            ciudadBuilder.setBiblioteca(biblioteca);
            ciudadBuilder.setDescripcion(descripcionCiudad);

            ciudades.add(ciudadBuilder.getCiudad());

        }
        return ciudades;
    }
}

