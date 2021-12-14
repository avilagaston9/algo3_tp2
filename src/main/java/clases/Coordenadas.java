package clases;

public class Coordenadas {

    private float latitud;
    private float longitud;

    public Coordenadas(float latitud, float longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double calcularDistancia(Coordenadas otrasCoordenadas){
        return otrasCoordenadas.calcularDistancia(this.latitud, this.longitud);
    }

    protected double calcularDistancia(float otraLatitud, float otraLongitud){
        double lon1 = Math.toRadians(otraLongitud);
        double lon2 = Math.toRadians(this.longitud);
        double lat1 = Math.toRadians(otraLatitud);
        double lat2 = Math.toRadians(this.latitud);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6371;

        return(c * r);
    }


}
