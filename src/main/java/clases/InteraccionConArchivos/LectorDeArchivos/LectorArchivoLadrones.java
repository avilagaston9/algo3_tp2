package clases.InteraccionConArchivos.LectorDeArchivos;
import java.util.ArrayList;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LectorArchivoLadrones implements LectorArchivos {
    @Override
    public ArrayList leer(String pathArchivo) {


        JSONParser parser = new JSONParser();
        ArrayList<Ladron> ladrones = new ArrayList<Ladron>();
        LadronBuilder ladronBuilder = new LadronBuilder();
        try{
            Object obj = parser.parse(pathArchivo);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonLadrones = (JSONArray) jsonObject.get("dossiers");
            JSONObject actual;
            for (int i = 0; i < jsonLadrones.size(); i++){

                actual = (JSONObject) jsonLadrones.get(i);

                ladronBuilder.setNombre((String) actual.get("nombre"));
                ladronBuilder.setSexo(new CaracteristicaLadron((String) actual.get("sexo")));
                ladronBuilder.setHobby(new CaracteristicaLadron((String) actual.get("hobby")));
                ladronBuilder.setCabello(new CaracteristicaLadron((String) actual.get("colorDelPelo")));
                ladronBuilder.setVehiculo(new CaracteristicaLadron((String) actual.get("coche")));
                ladronBuilder.setSenia(new CaracteristicaLadron((String) actual.get("señasParticulares")));

                ladrones.add(ladronBuilder.getLadron());
            }

        }
        catch (ParseException e){ e.printStackTrace();}
        catch (Exception e){ e.printStackTrace();}

        return ladrones;
    }

}
