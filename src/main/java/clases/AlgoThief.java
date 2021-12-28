 package clases;

 import clases.Exceptions.ExcepcionSinOrdenDeArresto;
 import clases.OrdenDeArresto.OrdenArresto;
 import clases.caracteristicasLadron.CaracteristicaLadron;
 import clases.edificios.Edificio;
 import clases.ladron.Ladron;
 import clases.pistas.Pista;
 import clases.rangos.Novato;
 import clases.valorObjetoRobado.ObjetoRobado;

 import java.util.*;

 public class AlgoThief {

     private ArrayList<Observador> observadores;
     private Policia policia;
     private Ladron ladron;
     private List<Ciudad> ciudades;
     private List<Ladron> ladrones;
     private Computadora computadora;
     private ObjetoRobado objetoRobado;

     private Boolean juegoEnCurso;
     private Boolean juegoGanado;

     public AlgoThief(List<Ciudad> ciudades, List<Ladron> ladrones, List<ObjetoRobado> objetosRobados) {

         this.juegoEnCurso = true;
         this.juegoGanado = false;

         this.observadores = new ArrayList<Observador>();

        this.ciudades = ciudades;
        this.ladrones = ladrones;
        
        Collections.shuffle(this.ciudades);
        Collections.shuffle(objetosRobados);

         Novato rango = new Novato();

         this.objetoRobado = rango.getObjetoRobado(objetosRobados);

         RutaDeEscape rutaDeEscape = this.objetoRobado.crearRutaDeEscape(this.ciudades);

         PoliciaBuilder policiaBuilder = new PoliciaBuilder();
         policiaBuilder.setPrimerCiudad(rutaDeEscape.getRuta().get(0));
         policiaBuilder.setRango(rango);

         this.policia = policiaBuilder.getPolicia();

         Random random = new Random();
         this.ladron = ladrones.get(random.nextInt(this.ladrones.size()));
         this.ladron.setCiudad(rutaDeEscape.getRuta().get(rutaDeEscape.getRuta().size() - 1));

         this.computadora = new Computadora((ArrayList<Ladron>) this.ladrones);

     }

     public void setObservador(Observador observador) {
         this.observadores.add(observador);
     }

     private void actualizarObservadores() {

         for(Observador o : this.observadores){

             o.actualizar();
         }
     }

     //métodos para jugar
     public LinkedList<Pista> visitar(Edificio unEdificio) {
         LinkedList<Pista> pistas = this.policia.visitar(unEdificio, this.ladron);
         this.actualizarObservadores();
         return pistas;
     }

     public int tiempoTranscurridoEnHoras() {
         return this.policia.tiempoTranscurridoEnHoras();
     }

     //todo ¿herir con??

     public void viajarA(Ciudad nuevaCiudad) {

         this.policia.viajarA(nuevaCiudad);
         this.actualizarObservadores();
     }

     public boolean esCiudadActual(Ciudad unaCiudad) {
         return this.policia.esCiudadActual(unaCiudad);
     }

     public void arrestarA(Ladron unLadron) throws ExcepcionSinOrdenDeArresto {

         this.policia.arrestarA(unLadron);
     }

     public void emitirOrdenDeArresto(Ladron ladron) {
         OrdenArresto orden = this.computadora.emitirOrdenDeArresto(ladron);
         this.policia.emitirOrdenDeArresto(orden);
         this.actualizarObservadores();
     }

     public int cantidadArrestos() {
         return this.policia.cantidadArrestos();
     }

     public void cargarCaracteristica(CaracteristicaLadron caracteristica) {
         computadora.cargarCaracteristica(caracteristica);
     }

     public void buscarSospechosos() {
         this.computadora.buscarSospechosos();
     }

     public String nombreObjetoRobado() {
         return this.objetoRobado.getNombre();
     }

     public String nombreCiudadInicial() {
         return this.objetoRobado.getNombreCiudad();
     }

     public void setNombrePolicia(String nombrePolicia) {
         this.policia.setNombre(nombrePolicia);
     }

     public String getNombrePolicia() {
         return this.policia.getNombre();
     }

     public String getNombreCiudadActual() {
         return this.policia.getCiudadActual().getNombre();
     }

     public Ciudad getCiudadActual() {

         return this.policia.getCiudadActual();
     }

     public Computadora getComputadora() {
         return this.computadora;
     }

     //nueva alternativa
     public LinkedList<Pista> visitarBancoActual() {
         LinkedList<Pista> pistas = this.policia.visitarBancoActual(this.ladron);
         this.actualizarObservadores();
         return pistas;
     }

     //nueva alternativa
     public LinkedList<Pista> visitarAeropuertoActual() {
         LinkedList<Pista> pistas = this.policia.visitarAeropuertoActual(this.ladron);
         this.actualizarObservadores();
         return pistas;
     }

     //nueva alternativa
     public LinkedList<Pista> visitarBibliotecaActual() {
         LinkedList<Pista> pistas = this.policia.visitarBibliotecaActual(this.ladron);
         this.actualizarObservadores();
         return pistas;
     }


     private void verEstadoJuego(){
         //Falta sumar Tiempo...
         try{
             if (policia.arrestarA(ladron)){
                 juegoGanado = true;
             }
         }catch (ExcepcionSinOrdenDeArresto e) {
             juegoEnCurso = false;
         }
     }

     public ArrayList<Ladron> getSospechosos() {
         return this.computadora.getSospechosos();
     }


 }

