
import java.util.ArrayList;
import java.util.List;

public class Coordinador extends Persona {
    private List<Instructor> instructores;

    public Coordinador(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.instructores = new ArrayList<>();
    }

    public void asignarInstructor(Instructor instructor) {
        instructores.add(instructor);
    }

    public List<Instructor> getInstructores() {
        return instructores;
    }
}
