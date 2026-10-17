import java.util.ArrayList;
import java.util.List;

public class MentoriaEnVivo extends  Curso{
    private String enlaceVideollamada;
    private int cupoMaximo;
    private List<String> alumnosInscritos;

    public MentoriaEnVivo(String nombreCurso, double horasTotales, double precioBase, String enlaceVideollamada, int cupoMaximo){
        super(nombreCurso, horasTotales, precioBase);
        this.enlaceVideollamada = enlaceVideollamada;
        this.cupoMaximo = cupoMaximo;
        this.alumnosInscritos = new ArrayList<>();
    }

    @Override
    public boolean inscribirAlumno(String nombreEstudiante) {
        if (this.alumnosInscritos.size() < this.cupoMaximo) {
            this.alumnosInscritos.add(nombreEstudiante);
            System.out.println("[Mentoría En Vivo] Estudiante " + nombreEstudiante + " registrado correctamente. Cupos restantes: " + (this.cupoMaximo - this.alumnosInscritos.size()));
            return true;
        } else {
            System.out.println("[Mentoría En Vivo] Error de inscripción: Sala virtual llena (Cupo máximo de " + this.cupoMaximo + " alcanzado para " + this.nombreCurso + ").");
            return false;
        }
    }

        @Override
        public String obtenerDetalles () {
            return "[Modalidad En Vivo] " + super.obtenerDetalles() +
                    " | Enlace: " + this.enlaceVideollamada +
                    " | Inscritos: " + this.alumnosInscritos.size() + "/" + this.cupoMaximo;
    }
}

