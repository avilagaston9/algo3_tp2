package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Policia;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivoPoliciasJson implements Escritor{

    private String filePath;

    public EscritorArchivoPoliciasJson(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void escribir(Policia unPolicia) {

        String identificador = unPolicia.getNombre();
        int arrestos = unPolicia.cantidadArrestos();

        JSONObject policiaJson = new JSONObject();
        policiaJson.put("nombre", identificador);
        policiaJson.put("arrestos", arrestos);


        //ESCRIBIR EN EL JSON...
        JSONParser parser = new JSONParser();
        FileReader fileReader = null;

        FileReader jsonReader;

        try {
            String pathCompleto = this.filePath;
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
        JSONArray arrayJson = (JSONArray) empJsonObject.get("policias");

        for(int i = 0; i < arrayJson.size(); i++){
            JSONObject actual = (JSONObject) arrayJson.get(i);
            if(actual.get("nombre").equals(identificador)){
                actual.put("arrestos", arrestos);
            }
        }

        try(FileWriter file = new FileWriter(this.filePath)){
            file.write(String.valueOf(empJsonObject));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}