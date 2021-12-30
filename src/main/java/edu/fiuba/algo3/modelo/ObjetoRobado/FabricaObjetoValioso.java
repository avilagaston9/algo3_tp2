package edu.fiuba.algo3.modelo.ObjetoRobado;

public class FabricaObjetoValioso implements FabricaObjetoRobado{

    @Override
    public ObjetoRobado crearObjeto(String nombre, String ciudad) {
        return new ObjetoValioso(nombre, ciudad);
    }
}
