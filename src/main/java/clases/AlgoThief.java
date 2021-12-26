 package clases;

 import clases.InteraccionConArchivos.LectorDeArchivosFachada;
 import clases.ladron.Ladron;
 import clases.rangos.Novato;
 import clases.valorObjetoRobado.ObjetoRobado;
 import java.util.Collections;
 import java.util.List;

 public class AlgoThief {

    private Policia policia;
    private Ladron ladron;
    private List<Ciudad> ciudades;
    private List<Ladron> ladrones;
    private List<ObjetoRobado> objetosRobados;


    private LectorDeArchivosFachada fachada;

    public AlgoThief(List<Ciudad> ciudades, List<Ladron> ladrones, List<ObjetoRobado> objetosRobados) {

        this.ciudades = ciudades;
        this.ladrones = ladrones;
        this.objetosRobados = objetosRobados;// todo pasar esto a variable temporal

        Collections.shuffle(this.ciudades);
        Collections.shuffle(this.objetosRobados);

        Novato rango = new Novato();

        ObjetoRobado objetoRobado = rango.getObjetoRobado(this.objetosRobados);

        RutaDeEscape rutaDeEscape = objetoRobado.crearRutaDeEscape(this.ciudades);

        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
        policiaBuilder.setPrimerCiudad(rutaDeEscape.getRuta().get(0));
        policiaBuilder.setRango(rango);

        this.policia = policiaBuilder.getPolicia();

        

//        this.ladron = ladrones.get(Random.nextInt(this.ladrones.size()));


        // computadora

    }
 }
