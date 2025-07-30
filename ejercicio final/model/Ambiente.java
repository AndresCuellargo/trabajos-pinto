
public class Ambiente {
    private String descripcion;
    private boolean especializado;
    private int capacidad;

    public Ambiente(String descripcion, boolean especializado, int capacidad) {
        this.descripcion = descripcion;
        this.especializado = especializado;
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEspecializado() {
        return especializado;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
