package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.Policia.Policia;
import edu.fiuba.algo3.modelo.Policia.PoliciaBuilder;
import edu.fiuba.algo3.modelo.rangos.RangoBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivoPoliciasJson implements Lector{

    private String filePath;

    public LectorArchivoPoliciasJson(String filePath){
        this.filePath = filePath;
    }

    @Override
    public ArrayList leer() { //similar a los lectores de jsons para ciudades y ladrones...

        JSONParser parser = new JSONParser();
        FileReader fileReader = null;

        FileReader jsonReader;

        try {
            String pathCompleto = ((String) System.getProperty("user.dir") + this.filePath);
            fileReader = new FileReader(pathCompleto);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            return new ArrayList<Policia>();
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

        JSONArray jsonArray = (JSONArray) empJsonObject.get("policias");

        //LISTA DE POLICIAS A CARGAR Y DEVOLVER
        ArrayList<Policia> policias = new ArrayList<Policia>();

        //Policia Builder
        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
        RangoBuilder rangoBuilder = new RangoBuilder();

        for (int i = 0; i < jsonArray.size(); i++){

            JSONObject policiaJson = (JSONObject) jsonArray.get(i);

            policiaBuilder.setNombre((String) policiaJson.get("nombre"));

            rangoBuilder.setArrestos( Integer.valueOf(String.valueOf(policiaJson.get("arrestos"))));
            policiaBuilder.setRango(rangoBuilder.getRango());

            policias.add(policiaBuilder.getPolicia());
        }

        return policias;
    }

}

