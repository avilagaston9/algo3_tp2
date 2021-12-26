 package clases;

 import clases.InteraccionConArchivos.LectorDeArchivosFachada;
 import clases.OrdenDeArresto.OrdenArresto;
 import clases.edificios.Edificio;
 import clases.ladron.Ladron;
 import clases.pistas.Pista;
 import clases.rangos.Novato;
 import clases.valorObjetoRobado.ObjetoRobado;
 import java.util.*;

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

//        this.objetosRobados = objetosRobados;// todo pasar esto a variable temporal

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

     //métodos para jugar
     public LinkedList<Pista> visitar(Edificio unEdificio, Ladron ladron) {
         return this.policia.visitar(unEdificio, ladron);
     }

     public int tiempoTranscurridoEnHoras() {
         return this.policia.tiempoTranscurridoEnHoras();
     }

     //todo ¿herir con??

     public void viajarA(Ciudad nuevaCiudad) {
         this.policia.viajarA(nuevaCiudad);
     }

     public boolean esCiudadActual(Ciudad unaCiudad) {
         return this.policia.esCiudadActual(unaCiudad);
     }

     public void arrestarA(Ladron unLadron) {
         this.policia.arrestarA(unLadron);
     }

     public void emitirOrdenDeArresto(OrdenArresto ordenDeArresto) {
         this.policia.emitirOrdenDeArresto(ordenDeArresto);
     }

     public int cantidadArrestos() {
         return this.policia.cantidadArrestos();
     }

 }


