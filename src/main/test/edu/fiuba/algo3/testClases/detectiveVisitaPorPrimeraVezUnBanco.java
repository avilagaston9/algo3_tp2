package edu.fiuba.algo3.testClases;

import clases.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class detectiveVisitaPorPrimeraVezUnBanco {
    @Test
    public void prueba(){

        Ciudad ciudad= new Ciudad("Montreal");
        Detective detective = new Detective(ciudad);
        assertEquals(ciudad.nombre, "Montreal");

    }
}