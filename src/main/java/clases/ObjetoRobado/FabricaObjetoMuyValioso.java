package clases.ObjetoRobado;

public class FabricaObjetoMuyValioso implements FabricaObjetoRobado{
    @Override
    public ObjetoRobado crearObjeto(String nombre, String ciudad) {
        return new ObjetoMuyValioso(nombre, ciudad);
    }
}
