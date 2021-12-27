package clases.InteraccionConArchivos.LectorDeArchivos;


import clases.valorObjetoRobado.ObjetoComun;
import clases.valorObjetoRobado.ObjetoMuyValioso;
import clases.valorObjetoRobado.ObjetoRobado;
import clases.valorObjetoRobado.ObjetoValioso;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class LectorArchivoObjetosRobados implements LectorArchivos {
    @Override
    public ArrayList leer(String pathArchivo) {
        JSONParser parser = new JSONParser();
        ArrayList<ObjetoRobado> objetosRobados = new ArrayList<ObjetoRobado>();
        try{
            Object obj = parser.parse(pathArchivo);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonLadrones = (JSONArray) jsonObject.get("tesoros");
            JSONObject actual;
            ObjetoRobado objetoRobadoActual;
            for (int i = 0; i < jsonLadrones.size(); i++){

                actual = (JSONObject) jsonLadrones.get(i);

                switch ((String) actual.get("valor")){
                    case "Comun": {
                        objetoRobadoActual = new ObjetoComun();
                    }break;
                    case "Valioso": {
                        objetoRobadoActual = new ObjetoValioso();
                    }break;
                    default:{
                        objetoRobadoActual = new ObjetoMuyValioso();
                    }
                }
                objetoRobadoActual.setNombre((String)actual.get("tesoro"));
                objetoRobadoActual.setNombreCiudad((String) actual.get("ciudad"));

                objetosRobados.add(objetoRobadoActual);
            }

        }
        catch (ParseException e){ e.printStackTrace();}
        catch (Exception e){ e.printStackTrace();}
        return objetosRobados;
    }
}
