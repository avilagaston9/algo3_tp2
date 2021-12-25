package clases.valorObjetoRobado;

import clases.rangos.*;

public abstract class ObjetoRobado {

    public abstract boolean esValidoPara(Novato rango);

    public abstract boolean esValidoPara(Detective rango);

    public abstract boolean esValidoPara(Investigador rango);

    public abstract boolean esValidoPara(Sargento rango);
}
