 package clases;

 import clases.InteraccionConArchivos.LectorDeArchivosFachada;
 import clases.ladron.Ladron;
 import clases.rangos.Novato;
 import clases.valorObjetoRobado.ObjetoRobado;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 import java.util.Random;

 public class AlgoThief {

    private Policia policia;
    private Ladron ladron;
    private List<Ciudad> ciudades;
    private List<Ladron> ladrones;
    private Computadora computadora;

    private LectorDeArchivosFachada fachada;

    public AlgoThief(List<Ciudad> ciudades, List<Ladron> ladrones, List<ObjetoRobado> objetosRobados) {

        this.ciudades = ciudades;
        this.ladrones = ladrones;
        
        Collections.shuffle(this.ciudades);
        Collections.shuffle(objetosRobados);

        Novato rango = new Novato();

        ObjetoRobado objetoRobado = rango.getObjetoRobado(objetosRobados);

        RutaDeEscape rutaDeEscape = objetoRobado.crearRutaDeEscape(this.ciudades);

        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
        policiaBuilder.setPrimerCiudad(rutaDeEscape.getRuta().get(0));
        policiaBuilder.setRango(rango);

        this.policia = policiaBuilder.getPolicia();

        Random random = new Random();
        this.ladron = ladrones.get(random.nextInt(this.ladrones.size()));

        this.computadora = new Computadora((ArrayList<Ladron>) this.ladrones);

    }
 }
