package edu.fiuba.algo3.testClases;

import clases.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class detectiveVisitaPorPrimeraVezUnBanco {
    @Test
    public void prueba(){
        Tiempo horas = new Tiempo();
        Detective detective= new Detective();

        // Aca se establece el plazo limite de tiempo para que el detective atrape el ladron
        detective.asignarHoras(horas);
        Ciudad ciudad= new Ciudad();
        Edificio banco = new Banco();

        ciudad.asignarEdificio(banco);

        ciudad.visitarEdificio(banco,detective);

        assertEquals(detective.tiempoRestante(),9);







    }
}
