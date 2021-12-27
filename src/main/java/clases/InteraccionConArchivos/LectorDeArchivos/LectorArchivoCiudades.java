package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LectorArchivoCiudades implements LectorArchivos {
    @Override
    public ArrayList leer(String pathArchivo) {

        JSONParser parser = new JSONParser();

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


        return null;
    }// todo hacer lo de lista circular para las pistas

    
}
