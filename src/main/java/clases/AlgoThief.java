// package clases;
//
// import clases.InteraccionConArchivos.Fachada;
// import clases.ladron.Ladron;
// import clases.rangos.Novato;
// import clases.valorObjetoRobado.ObjetoRobado;
//
// import java.io.File;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;
//
// public class AlgoThief {
//
//    private Policia policia;
//    private Ladron ladron;
//    private ArrayList<Ciudad> ciudades;
//    private ArrayList<Ladron> ladrones;
//    private ArrayList<ObjetoRobado> objetosRobados;
//
//
//    private Fachada fachada;
//
//    public AlgoThief(File archivoCiudades, File archivoLadrones, File archivoObjetos) {
//
////        this.fachada = new Fachada(new LectorJson());
//
//        this.ciudades = this.fachada.obtenerLadrones(archivoLadrones);
//        Collections.shuffle(this.ciudades);
//        this.ladrones = this.fachada.obtenerCiudades(archivoCiudades);
//        this.objetosRobados = this.fachada.obtenerObjetosRobados(archivoObjetos);
//        Collections.shuffle(this.objetosRobados);
//
//
//        Novato rango = new Novato();
//
//        ObjetoRobado objetoRobado = rango.getObjetoRobado(this.objetosRobados);
//
//        RutaDeEscape rutaDeEscape = new RutaDeEscape(this.ciudades, objetoRobado);
//
////        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
//
//
//        }
//    }
//
// }
