package edu.fiuba.algo3.modelo.ObjetoRobado;

public class FabricaObjetoComun implements FabricaObjetoRobado{
    @Override
    public ObjetoRobado crearObjeto(String nombre, String ciudad) {
        return new ObjetoComun(nombre, ciudad);
    }
}
