public class CursoGrabado extends Curso{
    private String plataformaAlojamiento;
    private String fechaLimiteAcceso;

    public CursoGrabado(String nombreCurso, double horasTotales, double precioBase, String plataformaAlojamiento, String fechaLimiteAcceso){
        super(nombreCurso, horasTotales, precioBase);
        this.plataformaAlojamiento = fechaLimiteAcceso;
        this.fechaLimiteAcceso = fechaLimiteAcceso;
    }


    @Override
    public boolean inscribirAlumno(String nombreEstudiante) {
        System.out.println("[Curso Grabado] Estudiante " + nombreEstudiante + " inscrito con éxito. Acceso inmediato habilitado en " + this.plataformaAlojamiento + ".");
        return true;
    }

    @Override
    public String obtenerDetalles() {
        return "[Modalidad Grabada] " + super.obtenerDetalles() +
                " | Plataforma: " + this.plataformaAlojamiento +
                " | Acceso hasta: " + this.fechaLimiteAcceso;
    }
}
