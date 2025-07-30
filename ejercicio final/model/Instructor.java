
import java.util.ArrayList;
import java.util.List;

public class Instructor extends Persona {
    private LineaFormacion linea;
    private ProgramaFormacion programa;
    private Horario horario;
    private Ambiente ambiente;

    public Instructor(String nombre, String identificacion) {
        super(nombre, identificacion);
    }

    public void asignarLinea(LineaFormacion linea) {
        this.linea = linea;
    }

    public void asignarPrograma(ProgramaFormacion programa) {
        this.programa = programa;
    }

    public void asignarHorario(Horario horario) {
        this.horario = horario;
    }

    public void asignarAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public LineaFormacion getLinea() {
        return linea;
    }

    public ProgramaFormacion getPrograma() {
        return programa;
    }

    public Horario getHorario() {
        return horario;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }
}
