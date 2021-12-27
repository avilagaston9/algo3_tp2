package clases.InteraccionConArchivos.LectorDeArchivos;

<<<<<<< HEAD
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;

import java.lang.reflect.Array;
=======
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
>>>>>>> 801153dd85520cc26e9a3b7f52436e013ce5cd6b
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoCiudades implements LectorArchivos {


    @Override
    public ArrayList leer(String pathArchivo) {

        JSONParser parser = new JSONParser();

<<<<<<< HEAD
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        try{
            Object obj = parser.parse(pathArchivo);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonLadrones = (JSONArray) jsonObject.get("ciudades");
            JSONObject actual;

            for (int i = 0; i < jsonLadrones.size(); i++){

                actual = (JSONObject) jsonLadrones.get(i);

                String nombre = actual.get("ciudad");
                Array coloresBandera = actual.get("colorBandera");
                String moneda = actual.get("moneda");
                String geografia = actual.get("geografia")
                Array


//                ladronBuilder.setNombre((String) actual.get("nombre"));
//                ladronBuilder.setSexo(new CaracteristicaLadron((String) actual.get("sexo")));
//                ladronBuilder.setHobby(new CaracteristicaLadron((String) actual.get("hobby")));
//                ladronBuilder.setCabello(new CaracteristicaLadron((String) actual.get("colorDelPelo")));
//                ladronBuilder.setVehiculo(new CaracteristicaLadron((String) actual.get("coche")));
//                ladronBuilder.setSenia(new CaracteristicaLadron((String) actual.get("señasParticulares")));

                ladrones.add(ladronBuilder.getLadron());
            }

        }
        catch (ParseException e){ e.printStackTrace();}
        catch (Exception e){ e.printStackTrace();}


        return ladrones;
=======
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




>>>>>>> 801153dd85520cc26e9a3b7f52436e013ce5cd6b


        return null;
    }

    
}
