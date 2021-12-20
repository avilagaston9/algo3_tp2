//package clases;
//
//import clases.ladron.Ladron;
//
//import java.util.ArrayList;
//
//public class RutaDeEscape {
//
//    private ArrayList<Ciudad> ciudades;
//
//    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoComun objeto){
//
//        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, 4));
//        return this.ciudades;
//    }
//
//    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoValioso objeto){
//
//        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, 5));
//        return this.ciudades;
//    }
//
//    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoMuyValioso objeto){
//
//        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, 7));
//        return this.ciudades;
//    }
//
//    public void asignarUltimaCiudadA(Ladron ladron){
//        ladron.setCiudad(this.ciudades.get(-1));
//    }
//
//}
