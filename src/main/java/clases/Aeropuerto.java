package clases;

import java.util.List;

public class Aeropuerto extends Edificio {
    @Override
    Pista serVisitado(Novato rango) {
        return null;
    }

    @Override
    Pista serVisitado(Detective rango) {
        return null;
    }

    @Override
    Pista serVisitado(Investigador rango) {
        return null;
    }

    @Override
    Pista serVisitado(Sargento rango) {
        return null;
    }/*
    private String tipo="Aeropuerto";
    private FabricaDePistas fabrica;
    private Pista pista;

    public Aeropuerto(FabricaDePistas unaFabrica){
        this.fabrica=unaFabrica;
        this.pista=null;
    }


    @Override
    public void agregarPista(String caracteristica, Rango rango) {
        this.pista=fabrica.crearPista(rango);
        this.pista.agregarCaracteristica(caracteristica);

    }
    @Override
    public Pista serVisitado(Edificio edificio, Ciudad siguienteCiudad,Tiempo tiempo,int visitas) {
        return siguienteCiudad.darPistaDe(edificio);
    }

    @Override
    public Pista darPista() {
        return this.pista;
    }

    @Override
    public boolean sosIgual(Edificio edificio) {
        return this.tipo.equals(edificio.tipo());
    }

    @Override
    public String tipo() {
        return this.tipo;
    }
    */
}