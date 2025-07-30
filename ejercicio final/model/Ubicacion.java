
public class Ubicacion {
    private Regional regional;
    private Centro centro;
    private Sede sede;

    public Ubicacion(Regional regional, Centro centro, Sede sede) {
        this.regional = regional;
        this.centro = centro;
        this.sede = sede;
    }

    public Regional getRegional() {
        return regional;
    }

    public Centro getCentro() {
        return centro;
    }

    public Sede getSede() {
        return sede;
    }
}
