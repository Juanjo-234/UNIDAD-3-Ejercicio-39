//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Curso> ofertaAcademica = new ArrayList<>();

    ofertaAcademica.add(new CursoGrabado("Fundamentos de Programación en Java", 45, 120.0, "Plataforma LMS EdTech", "31/12/2026"));
    ofertaAcademica.add(new MentoriaEnVivo("Masterclass de Arquitectura Cloud", 12, 250.0, "meet.google.com/xrt-mno-pqr", 3 ));
    ofertaAcademica.add(new TallerPresencial("Robótica Aplicada con Microcontroladores", 30, 400.0, "Laboratorio 3B", "Av. Tecnológica 4500, Campus Central", 2 ));

    System.out.println("==========================================================================================");
    System.out.println("                 SIMULACIÓN DE INSCRIPCIONES A LA OFERTA ACADÉMICA                        ");
    System.out.println("==========================================================================================\n");

    System.out.println("--- PROCESO DE MATRÍCULA ---");

    ofertaAcademica.get(0).inscribirAlumno("Carlos Pérez");
    ofertaAcademica.get(0).inscribirAlumno("María Gómez");

    System.out.println();
    ofertaAcademica.get(1).inscribirAlumno("Ana Torres");
    ofertaAcademica.get(1).inscribirAlumno("Juan López");
    ofertaAcademica.get(1).inscribirAlumno("Sofía Ruiz");
    ofertaAcademica.get(1).inscribirAlumno("Pedro Infante");

    System.out.println();
    ofertaAcademica.get(2).inscribirAlumno("Lucía Mendoza");
    ofertaAcademica.get(2).inscribirAlumno("Jorge Ramos");
    ofertaAcademica.get(2).inscribirAlumno("Esteban Quito");

    System.out.println("\n==========================================================================================");
    System.out.println("              ESTADO FINAL DE LA OFERTA ACADÉMICA Y COSTOS CON DESCUENTO                  ");
    System.out.println("==========================================================================================\n");

    double descuentoPromocional = 20.0;
    
    for (Curso curso : ofertaAcademica) {
        System.out.println(curso.obtenerDetalles());
        System.out.printf("-> Costo final con %.0f%% de descuento: $%.2f USD%n", descuentoPromocional, curso.calcularCostoFinal(descuentoPromocional));
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
