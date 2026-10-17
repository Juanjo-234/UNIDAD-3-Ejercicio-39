public class Curso {
    String nombreCurso;
    double horasTotales;
    double precioBase;

    public Curso(String nombreCurso, double horasTotales, double precioBase){
        this.nombreCurso = nombreCurso;
        this.horasTotales = horasTotales;
        this.precioBase = precioBase;
    }

    public double calcularCostoFinal(double porcentajeDescuento){
        return this.precioBase - (precioBase * (porcentajeDescuento /100));
    }
    public boolean inscribirAlumno(String nombreEstudiante) {
        System.out.println("Inscripción genérica para el estudiante: " + nombreEstudiante);
        return true;
    }
    public String obtenerDetalles() {
        return "Curso: " + this.nombreCurso + " | Duración: " + this.horasTotales + " hrs | Precio Base: $" + this.precioBase + " USD";
    }
}
