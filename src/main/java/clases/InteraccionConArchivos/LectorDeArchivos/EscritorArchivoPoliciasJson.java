package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Policia;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
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

        empJsonObject.put("policias", policiaJson);

    }
}