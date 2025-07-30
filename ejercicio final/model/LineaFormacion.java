
import java.util.ArrayList;
import java.util.List;

public class LineaFormacion {
    private String nombre;
    private List<ProgramaFormacion> programas;

    public LineaFormacion(String nombre) {
        this.nombre = nombre;
        this.programas = new ArrayList<>();
    }

    public void agregarPrograma(ProgramaFormacion programa) {
        programas.add(programa);
    }

    public String getNombre() {
        return nombre;
    }

    public List<ProgramaFormacion> getProgramas() {
        return programas;
    }
}
