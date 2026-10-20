Este programa está diseñado para modelar un sistema integral de gestión de oferta académica y plataformas educativas aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para validar inscripciones considerando cupos máximos, restricciones de conectividad y modalidades de cursada.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Curso: Concentra los atributos comunes a cualquier propuesta de formación (nombreCurso, horasTotales y precioBase), provee un constructor centralizado y define un método base para calcular costos con descuentos aplicables.

Desarrollar las clases hijas (CursoGrabado, MentoriaEnVivo y TallerPresencial): Extienden de Curso incorporando sus atributos particulares y especializados (plataforma de alojamiento y días de acceso para el curso grabado; enlace de videollamada y cupo máximo de asistentes para la mentoría; número de aula y dirección física para el taller presencial).

Sobrescribe el método de inscripción de alumnos: Cada subclase implementa su propia regla de validación (controlando disponibilidad de cupos en tiempo real, conectividad o vigencia de accesos).

Ejecuta la prueba en el main: Instancia cursos de diferentes modalidades, simula operaciones de inscripción de estudiantes y muestra el estado consolidado de la oferta académica por consola.
