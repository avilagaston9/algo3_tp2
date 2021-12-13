package clases;

import java.util.List;

public class Biblioteca extends Edificio {/*
    private String tipo="Biblioteca";
    private FabricaDePistas fabrica;
    private Pista pista;


    public Biblioteca(FabricaDePistas unaFabrica){
        this.fabrica=unaFabrica;
        this.pista=null;
    }


    @Override
    public void agregarPista(String caracteristica, Rango rango) {
        this.pista=fabrica.crearPista(rango);
        this.pista.agregarCaracteristica(caracteristica);
    }

    @Override
    public Pista serVisitado(Edificio edificio,Ciudad siguienteCiudad,Tiempo tiempo,int visitas) {
        Pista pista=  siguienteCiudad.darPistaDe(edificio);
        tiempo.sumarHoras(visitas);
        return pista;
    }

    @Override
    public Pista darPista() {
        return pista;
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
