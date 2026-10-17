import java.util.ArrayList;
import java.util.List;

public class TallerPresencial extends Curso{
    private String numeroAula;
    private String direccionFisica;
    private int cupoMaximo;
    private List<String> alumnosInscritos;

    public TallerPresencial(String nombreCurso, double horasTotales, double precioBase, String numeroAula, String direccionFisica, int cupoMaximo){
        super(nombreCurso, horasTotales, precioBase);
        this.numeroAula = numeroAula;
        this.direccionFisica = direccionFisica;
        this.cupoMaximo = cupoMaximo;
        this.alumnosInscritos = new ArrayList<>();
    }

    @Override
    public boolean inscribirAlumno(String nombreEstudiante) {
        if (this.alumnosInscritos.size() < this.cupoMaximo) {
            this.alumnosInscritos.add(nombreEstudiante);
            System.out.println("[Taller Presencial] Estudiante " + nombreEstudiante + " asignado al Aula " + this.numeroAula + ". Lugares libres: " + (this.cupoMaximo - this.alumnosInscritos.size()));
            return true;
        } else {
            System.out.println("[Taller Presencial] Error de inscripción: Aforo completo en " + this.direccionFisica + " (Capacidad máxima: " + this.cupoMaximo + ").");
            return false;
        }
    }

    @Override
    public String obtenerDetalles() {
        return "[Modalidad Presencial] " + super.obtenerDetalles() +
                " | Aula: " + this.numeroAula + " (" + this.direccionFisica + ")" +
                " | Asistentes: " + this.alumnosInscritos.size() + "/" + this.cupoMaximo;
    }
}
