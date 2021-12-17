package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Computadora;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.*;
import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.pistas.Pista;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import com.sun.javafx.event.EventDispatchChainImpl;
import com.sun.javafx.iio.bmp.BMPImageLoaderFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Caso5 {

    @Test
    public void detectiveHaceSeisArrestosYTomaUnCaso() {

        //Creo ciudad...
        Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
        Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

        //Creo un policia de rango Detective...
        Policia policia = new Policia(new Detective(), montreal);

        /*
        HACE 6 ARRESTOS
        Chequear rango aca
         */

        LadronBuilder ladronBuilder = new LadronBuilder();
        ladronBuilder.setSexo(new Masculino());
        ladronBuilder.setHobby(new Tenis());
        ladronBuilder.setCabello(new Negro());
        ladronBuilder.setSenia(new Anillo());
        ladronBuilder.setVehiculo(new Moto());

        Ladron jose = ladronBuilder.getLadron();

        //Lista de ladrones...
        ArrayList<Ladron> sospechosos =new ArrayList<>();
        sospechosos.add(jose);


        //==================================================================================================

        //PROXIMA CIUDAD, DF
        Coordenadas coordenadasMexico = new Coordenadas(23.634501, -102.552784);
        Ciudad mexico = new Ciudad("Mexico", coordenadasMexico);

        //BANCO
        PistaMedia pistaMedia = new PistaMedia("Pesos Mexicanos");
        Edificio banco = new Banco();
        banco.setPista(pistaMedia);

        //AEROPUERTO
        PistaMedia pistaMedia1 = new PistaMedia("Avion con bandera verde blanco rojo");
        Edificio aeropuerto = new Aeropuerto();
        aeropuerto.setPista(pistaMedia1);

        //BIBLIOTECA
        PistaMedia pistaMedia2 = new PistaMedia("Dijo que iba a un lugar donde hay piramides");
        Edificio biblioteca = new Biblioteca();
        biblioteca.setPista(pistaMedia2);

        //PISTAS
        LinkedList<Pista> pistasDevueltasBanco = policia.visitar(banco, jose); //primera visita
        LinkedList<Pista> pistasDevueltasAeropuero = policia.visitar(aeropuerto, jose);//segunda visita
        LinkedList<Pista> pistasDevueltasBiblioteca = policia.visitar(biblioteca, jose);//tercer visita

        assert(pistasDevueltasBanco.get(0).revelar().equals("Pesos Mexicanos"));
        assert(pistasDevueltasAeropuero.get(0).revelar().equals("Avion con bandera verde blanco rojo"));
        assert(pistasDevueltasBiblioteca.get(0).revelar().equals("Dijo que iba a un lugar donde hay piramides"));
        assertEquals(3, policia.tiempoTranscurridoEnHoras()); //no se suman bien las horas


        policia.viajarA(mexico);

        //==================================================================================================

        //PROXIMA CIUDAD, ROMA
        Coordenadas coordenadasRoma = new Coordenadas(41.8905, 12.4942);
        Ciudad roma = new Ciudad("Roma", coordenadasRoma);

        //BANCO
        PistaMedia pistaMediaRoma = new PistaMedia("Euros");
        Edificio banco2 = new Banco();
        banco2.setPista(pistaMediaRoma);

        //AEROPUERTO
        PistaMedia pistaMediaRoma2 = new PistaMedia("Avion con bandera de italia");
        Edificio aeropuerto2 = new Aeropuerto();
        aeropuerto2.setPista(pistaMediaRoma2);

        //BIBLIOTECA
        PistaMedia pistaMediaRoma3 = new PistaMedia("Dijo que iba a un lugar donde hay un coliseo romano");
        Edificio biblioteca2 = new Biblioteca();
        biblioteca2.setPista(pistaMediaRoma3);

        //PISTAS
        LinkedList<Pista> pistasDevueltasBanco2 = policia.visitar(banco2, jose); //primera visita
        LinkedList<Pista> pistasDevueltasAeropuerto2 = policia.visitar(aeropuerto2, jose);//segunda visita

        assert(pistasDevueltasBanco2.get(0).revelar().equals("Euros"));
        assert(pistasDevueltasAeropuerto2.get(0).revelar().equals("Avion con bandera de italia"));

        //Se crea la computadora para registrar datos...
        Computadora computadora = new Computadora(sospechosos);

        computadora.cargarCaracteristica(new Negro());


        assertEquals(6, policia.tiempoTranscurridoEnHoras());


        policia.viajarA(roma);

        //==================================================================================================

        //PROXIMA CIUDAD, PARIS
        Coordenadas coordenadasParis = new Coordenadas(48.8032, 2.3511);
        Ciudad paris = new Ciudad("Roma", coordenadasParis);

        //BANCO
        Edificio bancoParis = new Banco();
        PistaMedia pistaMediaParisBanco = new PistaMedia("Euros");
        bancoParis.setPista(pistaMediaParisBanco);

        //AEROPUERTO
        Edificio aeropuertoParis = new Aeropuerto();
        PistaMedia pistaMediaParisAeropuerto = new PistaMedia("bandera de francia");
        aeropuertoParis.setPista(pistaMediaParisAeropuerto);

        //BIBLIOTECA
        Edificio bibliotecaParis = new Biblioteca();
        PistaMedia pistaMediaParisBiblioteca = new PistaMedia("Pais que limita con Portugal");
        bibliotecaParis.setPista(pistaMediaParisBiblioteca);

        //PISTAS
        LinkedList<Pista> pistasDevueltasbancoParis = policia.visitar(bancoParis, jose); //primera visita
        LinkedList<Pista> pistasDevueltasAeropuertoParis = policia.visitar(aeropuertoParis, jose);//segunda visita

        assert(pistasDevueltasbancoParis.get(0).revelar().equals("Euros"));
        assert(pistasDevueltasAeropuertoParis.get(0).revelar().equals("bandera de francia"));

        computadora.cargarCaracteristica(new Anillo());


        policia.viajarA(paris);

        //==================================================================================================

        //PROXIMA CIUDAD, BUENOS ARIES
        Coordenadas coordenadasBsas = new Coordenadas(-34.6131500,  -58.3772300);
        Ciudad bsas = new Ciudad("Buenos Aires", coordenadasBsas);

        //BANCO
        Edificio bancoBsas = new Banco();
        PistaMedia pistaMediaBsasBanco = new PistaMedia("Pesos argentinos");
        bancoBsas.setPista(pistaMediaBsasBanco);

        //BIBLIOTECA
        Biblioteca bibliotecaBsas = new Biblioteca();
        PistaMedia pistaMediaBiblioteca = new PistaMedia("Rio de la plata");
        bibliotecaBsas.setPista(pistaMediaBiblioteca);

        //PISTAS
        LinkedList<Pista> pistasDevueltasBancoBsas = policia.visitar(bancoBsas, jose); //primera visita
        LinkedList<Pista> pistasDevueltasBibliotecaBsas = policia.visitar(bibliotecaBsas, jose);//segunda visita

        assert(pistasDevueltasBancoBsas.get(0).revelar().equals("Pesos argentinos"));
        assert (pistasDevueltasBibliotecaBsas.get(0).revelar().equals("Rio de la plata"));

        computadora.cargarCaracteristica(new Masculino());

        policia.emitirOrdenDeArresto(computadora.emitirOrdenDeArresto(jose));

        policia.viajarA(bsas);

        //==================================================================================================

        policia.arrestarA(jose);

    }
}