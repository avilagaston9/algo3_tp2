package clases;

import java.util.List;

public class Banco extends Edificio {
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
    }
    /*
    private String tipo="Banco";
    private FabricaDePistas fabrica;
    private Pista pista;

    public Banco(FabricaDePistas unafabrica){
        this.fabrica=unafabrica;
        this.pista=null;
    }

    @Override
    public void agregarPista(String caracteristica, Rango rango) {
        this.pista=fabrica.crearPista(rango);
        this.pista.agregarCaracteristica(caracteristica);
    }

    @Override
    public Pista serVisitado(Edificio edificio,Ciudad siguienteCiudad,Tiempo tiempo,int visitas) {
        Pista pista = siguienteCiudad.darPistaDe(edificio);
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



}

     */

}