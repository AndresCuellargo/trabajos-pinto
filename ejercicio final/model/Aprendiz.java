
public class Aprendiz extends Persona {
    private LineaFormacion linea;
    private ProgramaFormacion programa;
    private Ambiente ambiente;
    private Horario horario;

    public Aprendiz(String nombre, String identificacion) {
        super(nombre, identificacion);
    }

    public void asignarLinea(LineaFormacion linea) {
        this.linea = linea;
    }

    public void asignarPrograma(ProgramaFormacion programa) {
        this.programa = programa;
    }

    public void asignarAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public void asignarHorario(Horario horario) {
        this.horario = horario;
    }

    public LineaFormacion getLinea() {
        return linea;
    }

    public ProgramaFormacion getPrograma() {
        return programa;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public Horario getHorario() {
        return horario;
    }
}
