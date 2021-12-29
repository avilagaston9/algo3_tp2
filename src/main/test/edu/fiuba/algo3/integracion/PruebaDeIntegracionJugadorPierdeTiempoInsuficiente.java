package edu.fiuba.algo3.integracion;

import clases.*;
import clases.FabricaEdificios.FabricaAeropuerto;
import clases.FabricaEdificios.FabricaBancos;
import clases.FabricaEdificios.FabricaBiblioteca;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadrones;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobados;
import clases.ObjetoRobado.FabricaObjetoComun;
import clases.ObjetoRobado.FabricaObjetoRobado;
import clases.ObjetoRobado.ObjetoComun;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.ladron.Ladron;
import clases.ObjetoRobado.ObjetoRobado;
import clases.ladron.LadronBuilder;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;
import clases.rangos.Novato;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaDeIntegracionJugadorPierdeTiempoInsuficiente {

    @Test
    public void jugadorPierdePorTiempoInsuficiente(){

        // CREACION CIUDADES //

        //Baghdad
        String nombreBaghdad = "Baghdad";
        String descripcionBaghdad= "";
        Coordenadas coordenadasBaghdad = new Coordenadas(33.35,44.416667);

        //EDIFICIOS
        FabricaBancos fabricaBancos = new FabricaBancos();
        FabricaBiblioteca fabricaBiblioteca = new FabricaBiblioteca();
        FabricaAeropuerto fabricaAeropuerto = new FabricaAeropuerto();

        //Banco
        PistaFacil pistaFacilBanco = new PistaFacil("Dinares");
        PistaMedia pistaMediaBanco = new PistaMedia("Petroleo");
        PistaDificil pistaDificilBanco = new PistaDificil("Puertas de Baghdad");

        Banco bancoBaghdad = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco,pistaDificilBanco);

        //Biblioteca
        PistaFacil pistaFacilBiblioteca = new PistaFacil("Desierto");
        PistaMedia pistaMediaBiblioteca = new PistaMedia("Sumerio");
        PistaDificil pistaDificilBiblioteca = new PistaDificil("Islam");

        Biblioteca bibliotecaBaghdad = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBiblioteca, pistaMediaBiblioteca, pistaDificilBiblioteca);

        //Aeropuerto
        PistaFacil pistaFacilAeropuerto = new PistaFacil("Rojo, Blanco, Negro");
        PistaMedia pistaMediaAeropuerto = new PistaMedia("Arabe");
        PistaDificil pistaDificilAeropuerto = new PistaDificil("Arabe");

        Aeropuerto aeropuertoBaghdad = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto, pistaMediaAeropuerto, pistaDificilAeropuerto);

        // CIUDAD BUILDER
        CiudadBuilder ciudadBuilder = new CiudadBuilder();

        ciudadBuilder.setNombre(nombreBaghdad);
        ciudadBuilder.setCoordenadas(coordenadasBaghdad);
        ciudadBuilder.setAeropuerto(aeropuertoBaghdad);
        ciudadBuilder.setBanco(bancoBaghdad);
        ciudadBuilder.setBiblioteca(bibliotecaBaghdad);
        ciudadBuilder.setDescripcion(descripcionBaghdad);

        Ciudad baghdad = ciudadBuilder.getCiudad();

        //Atenas
        String nombreAtenas = "Atenas";
        String descripcionAtenas= "";
        Coordenadas coordenadasAtenas = new Coordenadas(37.984167,23.728056);

        //EDIFICIOS
        fabricaBancos = new FabricaBancos();
        fabricaBiblioteca = new FabricaBiblioteca();
        fabricaAeropuerto = new FabricaAeropuerto();

        //Banco
        pistaFacilBanco = new PistaFacil("Dracmas");
        pistaMediaBanco = new PistaMedia("Metalurgica");
        pistaDificilBanco = new PistaDificil("Musica");

        Banco bancoAtenas = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco,pistaDificilBanco);

        //Biblioteca
        pistaFacilBiblioteca = new PistaFacil("Montes");
        pistaMediaBiblioteca = new PistaMedia("Plateo");
        pistaDificilBiblioteca = new PistaDificil("Cristianismo");

        Biblioteca bibliotecaAtenas = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBiblioteca, pistaMediaBiblioteca, pistaDificilBiblioteca);

        //Aeropuerto
        pistaFacilAeropuerto = new PistaFacil("Azul y blanco");
        pistaMediaAeropuerto = new PistaMedia("Griego");
        pistaDificilAeropuerto = new PistaDificil("Primer Ministro");

        Aeropuerto aeropuertoAtenas = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto, pistaMediaAeropuerto, pistaDificilAeropuerto);

        // CIUDAD BUILDER
        ciudadBuilder = new CiudadBuilder();

        ciudadBuilder.setNombre(nombreAtenas);
        ciudadBuilder.setCoordenadas(coordenadasAtenas);
        ciudadBuilder.setAeropuerto(aeropuertoAtenas);
        ciudadBuilder.setBanco(bancoAtenas);
        ciudadBuilder.setBiblioteca(bibliotecaAtenas);
        ciudadBuilder.setDescripcion(descripcionAtenas);

        Ciudad atenas = ciudadBuilder.getCiudad();

        //Bamako
        String nombreBamako = "Bamako";
        String descripcionBamako= "";
        Coordenadas coordenadasBamako = new Coordenadas(12.645833,-7.992222);

        //EDIFICIOS
        fabricaBancos = new FabricaBancos();
        fabricaBiblioteca = new FabricaBiblioteca();
        fabricaAeropuerto = new FabricaAeropuerto();

        //Banco
        pistaFacilBanco = new PistaFacil("Franco francés");
        pistaMediaBanco = new PistaMedia("Mineria");
        pistaDificilBanco = new PistaDificil("Musica");

        Banco bancoBamako = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco,pistaDificilBanco);

        //Biblioteca
        pistaFacilBiblioteca = new PistaFacil("Savanna Tropical");
        pistaMediaBiblioteca = new PistaMedia("Tuareg");
        pistaDificilBiblioteca = new PistaDificil("Islam");

        Biblioteca bibliotecaBamako = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBiblioteca, pistaMediaBiblioteca, pistaDificilBiblioteca);

        //Aeropuerto
        pistaFacilAeropuerto = new PistaFacil("Verde, Amarillo, Rojo");
        pistaMediaAeropuerto = new PistaMedia("Inglés, Francés, Hebreo, Idioma bambara");
        pistaDificilAeropuerto = new PistaDificil("Presidente");

        Aeropuerto aeropuertoBamako = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto, pistaMediaAeropuerto, pistaDificilAeropuerto);

        // CIUDAD BUILDER
        ciudadBuilder = new CiudadBuilder();

        ciudadBuilder.setNombre(nombreBamako);
        ciudadBuilder.setCoordenadas(coordenadasBamako);
        ciudadBuilder.setAeropuerto(aeropuertoBamako);
        ciudadBuilder.setBanco(bancoBamako);
        ciudadBuilder.setBiblioteca(bibliotecaBamako);
        ciudadBuilder.setDescripcion(descripcionBamako);

        Ciudad bamako = ciudadBuilder.getCiudad();

        //Bangkok
        String nombreBangkok = "Bangkok";
        String descripcionBangkok= "";
        Coordenadas coordenadasBangkok = new Coordenadas(12.645833,-7.992222);

        //EDIFICIOS
        fabricaBancos = new FabricaBancos();
        fabricaBiblioteca = new FabricaBiblioteca();
        fabricaAeropuerto = new FabricaAeropuerto();

        //Banco
        pistaFacilBanco = new PistaFacil("Baht tailandés");
        pistaMediaBanco = new PistaMedia("Software");
        pistaDificilBanco = new PistaDificil("NFTs");

        Banco bancoBangkok = (Banco) fabricaBancos.crearEdificio(pistaFacilBanco, pistaMediaBanco,pistaDificilBanco);

        //Biblioteca
        pistaFacilBiblioteca = new PistaFacil("Llanura");
        pistaMediaBiblioteca = new PistaMedia("Tailandesa, China, Malaya");
        pistaDificilBiblioteca = new PistaDificil("Budismo");

        Biblioteca bibliotecaBangkok = (Biblioteca) fabricaBiblioteca.crearEdificio(pistaFacilBiblioteca, pistaMediaBiblioteca, pistaDificilBiblioteca);

        //Aeropuerto
        pistaFacilAeropuerto = new PistaFacil("Rojo, Blanco, Azul");
        pistaMediaAeropuerto = new PistaMedia("Tailandes");
        pistaDificilAeropuerto = new PistaDificil("Presidente");

        Aeropuerto aeropuertoBangkok = (Aeropuerto) fabricaAeropuerto.crearEdificio(pistaFacilAeropuerto, pistaMediaAeropuerto, pistaDificilAeropuerto);

        // CIUDAD BUILDER
        ciudadBuilder = new CiudadBuilder();

        ciudadBuilder.setNombre(nombreBangkok);
        ciudadBuilder.setCoordenadas(coordenadasBangkok);
        ciudadBuilder.setAeropuerto(aeropuertoBangkok);
        ciudadBuilder.setBanco(bancoBangkok);
        ciudadBuilder.setBiblioteca(bibliotecaBangkok);
        ciudadBuilder.setDescripcion(descripcionBangkok);

        Ciudad bangkok = ciudadBuilder.getCiudad();

        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(baghdad);
        ciudades.add(atenas);
        ciudades.add(bamako);
        ciudades.add(bangkok);

        FabricaObjetoRobado fabricaObjetoRobado = new FabricaObjetoComun();
        ObjetoRobado objetoRobado = fabricaObjetoRobado.crearObjeto("La Navidad", "Baghdad");

        ArrayList<ObjetoRobado> objetosRobados = new ArrayList<>();
        objetosRobados.add(objetoRobado);

        Novato rango = new Novato();

        //En la versión completa se llama a:
        // rango.getObjetoRobado(objetosRobados)

        RutaDeEscape rutaDeEscape = objetoRobado.crearRutaDeEscape(ciudades); // (Baghdad, Atenas,Bamako,Bangkok)
        ArrayList<Ciudad> listaRuta = rutaDeEscape.getRuta();

        for (int i = 0 ; i< listaRuta.size(); i++){
            assertEquals(ciudades.get(i),listaRuta.get(i));
        }

        //Policia
        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
        policiaBuilder.setRango(rango);
        policiaBuilder.setPrimerCiudad(atenas);
        Policia policia = policiaBuilder.getPolicia();

        //Ladron
        LadronBuilder ladronBuilder = new LadronBuilder();

        ladronBuilder.setNombre("Carmen Sandiego");
        ladronBuilder.setSexo(new CaracteristicaLadron("Femenino"));
        ladronBuilder.setHobby(new CaracteristicaLadron("Tenis"));
        ladronBuilder.setCabello(new CaracteristicaLadron("Castaño"));
        ladronBuilder.setVehiculo(new CaracteristicaLadron("Descapotable"));
        ladronBuilder.setSenia(new CaracteristicaLadron("Anillo"));

        Ladron ladron = ladronBuilder.getLadron();
        ladron.setCiudad(bangkok);
        ladron.setRutaDeEscape(rutaDeEscape);

        ArrayList<Ladron> ladrones = new ArrayList<>();
        ladrones.add(ladron);

        AlgoThief juego = new AlgoThief(ciudades, ladrones, objetosRobados);

        // FIN SETUP //

        while (!juego.tiempoInsuficiente()){
            juego.viajarA(bangkok);
            juego.viajarA(atenas);
        }

        assertEquals(false, juego.juegoGanado());
        assertEquals(false, juego.juegoEnCurso());

    }
}
