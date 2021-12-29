package edu.fiuba.algo3.integracion;

import clases.AlgoThief;
import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadrones;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobados;
import clases.ladron.Ladron;
import clases.ObjetoRobado.ObjetoRobado;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaDeIntegracionJugadorPierdeTiempoInsuficiente {

    @Test
    public void jugadorPierdePorTiempoInsuficiente(){

        LectorArchivoCiudades lectorCiudades = new LectorArchivoCiudades();
        ArrayList<Ciudad> ciudades = lectorCiudades
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");

        LectorArchivoLadrones lectorLadrones = new LectorArchivoLadrones();
        ArrayList<Ladron> ladrones = lectorLadrones
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");

        LectorArchivoObjetosRobados lectorObjetos = new LectorArchivoObjetosRobados();
        ArrayList<ObjetoRobado> objetos = lectorObjetos
                .leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");

        AlgoThief juego = new AlgoThief(ciudades, ladrones, objetos);

        Ciudad ciudad1 = ciudades.get(5);
        Ciudad ciudad2 = ciudades.get(3);

        while (!juego.tiempoInsuficiente()){
            juego.viajarA(ciudad1);
            juego.viajarA(ciudad2);
        }

        assertEquals(false, juego.juegoGanado());
        assertEquals(false, juego.juegoEnCurso());

    }
}
