package edu.fiuba.algo3.integracion;

import clases.*;
import clases.Exceptions.ExcepcionSinOrdenDeArresto;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadrones;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobados;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.rangos.Novato;
import clases.ObjetoRobado.ObjetoRobado;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaDeIntegracionJugadorPierde {


    @Test
    public void jugadorPierdeSinOrdenDeArresto() throws ExcepcionSinOrdenDeArresto {

        LectorArchivoCiudades lectorCiudades = new LectorArchivoCiudades();
        ArrayList<Ciudad> ciudades = lectorCiudades
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");

        LectorArchivoLadrones lectorLadrones = new LectorArchivoLadrones();
        ArrayList<Ladron> ladrones = lectorLadrones
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");

        LectorArchivoObjetosRobados lectorObjetos = new LectorArchivoObjetosRobados();
        ArrayList<ObjetoRobado> objetos = lectorObjetos
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");

        Novato rango = new Novato();

        ObjetoRobado objetoRobado = rango.getObjetoRobado(objetos);

        RutaDeEscape rutaDeEscape = objetoRobado.crearRutaDeEscape(new ArrayList<Ciudad>(ciudades)); // (Baghdad,
        // Atenas,Bamako,Bangkok)
        ArrayList<Ciudad> listaRuta = rutaDeEscape.getRuta();

        Ciudad baghdad = ciudades.get(1);
        Ciudad atenas = ciudades.get(0);
        Ciudad bamako = ciudades.get(2);
        Ciudad bangkok = ciudades.get(3);

        PoliciaBuilder policiaBuilder = new PoliciaBuilder();
        policiaBuilder.setRango(rango);
        policiaBuilder.setPrimerCiudad(baghdad);
        Policia policia = policiaBuilder.getPolicia();

        Ladron ladron = ladrones.get(0); // Carmen Sandiego
        ladron.setCiudad(listaRuta.get(listaRuta.size() - 1)); // Bangkok
        ladron.setRutaDeEscape(rutaDeEscape);
        int contadorPistasLadron = 0;

        // Ladron ladronSpy = Mockito.spy(ladron);
        // Mockito.when(ladronSpy.pedirPista(rango)).thenReturn(new
        // PistaConInformacion("Femenino"));

        Computadora computadora = new Computadora(ladrones);

        // VISITAS EN BAGHDAD
        LinkedList<Pista> pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
        LinkedList<Pista> pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
        LinkedList<Pista> pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

        this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

        this.cargarPistaLadron(pistasDevueltasBanco, computadora);

        this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);

        assertEquals(3, policia.tiempoTranscurridoEnHoras());

        policia.viajarA(atenas);
        assertEquals(5, policia.tiempoTranscurridoEnHoras());

        // VISITAS EN ATENAS
        pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
        pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
        pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

        this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

        this.cargarPistaLadron(pistasDevueltasBanco, computadora);

        this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);

        assertEquals(8, policia.tiempoTranscurridoEnHoras());

        policia.viajarA(bamako);
        assertEquals(12, policia.tiempoTranscurridoEnHoras());

        // VISITAS EN BAMAKO
        pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
        pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
        pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

        this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

        this.cargarPistaLadron(pistasDevueltasBanco, computadora);

        this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);


        computadora.buscarSospechosos();

        //OrdenArresto orden = computadora.emitirOrdenDeArresto(ladron);
       // policia.emitirOrdenDeArresto(orden);
       // assertEquals(26, policia.tiempoTranscurridoEnHoras()); // 3hs de orden de arresto + 8hs de dormir

        policia.viajarA(bangkok);

        try {
            policia.arrestarA(ladron);
        }
        catch (Throwable e){
            assertEquals(policia.cantidadArrestos(), 0);
        }

        assertTrue(policia.tiempoTranscurridoEnHoras() < 154);
    }

    private void cargarPistaLadron(LinkedList<Pista> pistasDevueltas, Computadora computadora) {
        if (!pistasDevueltas.get(1).revelar().equals("Lo sentimos, no tenemos informacion del ladron")) {
            CaracteristicaLadron caracteristicaLadron = new CaracteristicaLadron(pistasDevueltas.get(1).revelar());
            computadora.cargarCaracteristica(caracteristicaLadron);
        }
    }

    @Test
    public void jugadorPierdeTiempoInsuficiente() throws ExcepcionSinOrdenDeArresto {


    }
}
