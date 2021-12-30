package edu.fiuba.algo3.interfaz;

public class Resources {
    static public String Ruta = "src/main/resources/";
    static public String Imagenes = "imagenes/";

    static public String IconoApp = "logo.png";
    public static String IconoAppRuta() { return Ruta + Imagenes + IconoApp; }

    static public String FondoPrincipal = "background3.png";
    static public String FondoJuego = "textura.png";
    static public String IconoJugar = "play-button.png";
    static public String IconoSalir = "cancel.png";

    static public String IconoVisitarEdificio = "clue.png";
    static public String IconoAeropuerto = "airport.png";
    static public String IconoBanco = "bank.png";
    static public String IconoBiblioteca = "library.png";

    static public String IconoUsarComputadora = "unknown.png";
    static public String IconoCaracteristicaCabello = "man-hair.png";
    static public String IconoCaracteristicaHobby = "mental-health.png";
    static public String IconoCaracteristicaSenia = "diamond.png";
    static public String IconoCaracteristicaSexo = "sex.png";
    static public String IconoCaracteristicaVehiculo = "searching.png";
    static public String IconoGenerarOrdenDeArresto = "orden-de-arresto.png";
    static public String IconoVolver = "log-out.png";

    static public String IconoViajarACiudad = "planeIcon.png";

    public static String FondoPrincipalRuta() { return "file:" + Ruta + Imagenes + FondoPrincipal; }
    public static String FondoJuegoRuta() { return "file:" + Ruta + Imagenes + FondoJuego; }
    public static String IconoJugarRuta() { return Ruta + Imagenes + IconoJugar; }
    public static String IconoSalirRuta() { return Ruta + Imagenes + IconoSalir; }
    public static String IconoVolver() { return Ruta + Imagenes + IconoVolver; }

    public static String IconoVisitarEdificioRuta() { return Ruta + Imagenes + IconoVisitarEdificio; }
    public static String IconoAeropuertoRuta() { return Ruta + Imagenes + IconoAeropuerto; }
    public static String IconoBancoRuta() { return Ruta + Imagenes + IconoBanco; }
    public static String IconoBibliotecaRuta() { return Ruta + Imagenes + IconoBiblioteca; }

    public static String IconoUsarComputadoraRuta() { return Ruta + Imagenes + IconoUsarComputadora; }
    public static String IconoCaracteristicaCabelloRuta() { return Ruta + Imagenes + IconoCaracteristicaCabello; }
    public static String IconoCaracteristicaHobbyRuta() { return Ruta + Imagenes + IconoCaracteristicaHobby; }
    public static String IconoCaracteristicaSeniaRuta() { return Ruta + Imagenes + IconoCaracteristicaSenia; }
    public static String IconoCaracteristicaSexoRuta() { return Ruta + Imagenes + IconoCaracteristicaSexo; }
    public static String IconoCaracteristicaVehiculoRuta() { return Ruta + Imagenes + IconoCaracteristicaVehiculo; }
    public static String IconoGenerarOrdenDeArrestoRuta() { return Ruta + Imagenes + IconoGenerarOrdenDeArresto; }

    public static String IconoViajarACiudadRuta() { return Ruta + Imagenes + IconoViajarACiudad; }

    static public String ArchivoCiudades = "ciudadesSinTerminar.json";
    static public String ArchivoLadrones = "dossiers.json";
    static public String ArchivoTesoros = "tesoros.json";
    static public String ArchivoPolicias = "policias.json";

    public static String ArchivoCiudadesRuta() { return "/" + Ruta + ArchivoCiudades; }
    public static String ArchivoLadronesRuta() { return "/" + Ruta + ArchivoLadrones; }
    public static String ArchivoTesorosRuta() { return "/" + Ruta + ArchivoTesoros; }
    public static String ArchivoPoliciasRuta() { return "/" + Ruta + ArchivoPolicias; }
}
