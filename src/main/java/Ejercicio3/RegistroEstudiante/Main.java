package Ejercicio3.RegistroEstudiante;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // CREAR ESTUDIANTE CON BUILDER
        // ==========================================

        Estudiante estudiante1 =
                new EstudianteBuilder()
                        .nombre("Manuel")
                        .correo("manuel@gmail.com")
                        .telefono("3054486477")
                        .direccion("Armenia")
                        .intereses("videojuegos")
                        .construir();

        System.out.println("===== ESTUDIANTE CREADO =====");

        estudiante1.mostrarInformacion();


        // ==========================================
        // ESTUDIANTE CON SOLO DATOS OBLIGATORIOS
        // ==========================================

        Estudiante estudiante2 =
                new EstudianteBuilder()
                        .nombre("Carla")
                        .correo("carla@gmail.com")
                        .construir();

        System.out.println("\n===== SEGUNDO ESTUDIANTE =====");

        estudiante2.mostrarInformacion();


        // ==========================================
        // CREAR ESTUDIANTES PARA PROBAR LSP
        // ==========================================

        Estudiante estudiantePremium =
                new EstudiantePremium(
                        "Ana",
                        "ana@gmail.com",
                        "3205555555",
                        "Medellín",
                        "Programación"
                );


        // ==========================================
        // PROBAR LSP
        // ==========================================

        System.out.println("\n===== PRUEBA DE LSP =====");

        System.out.println();

        mostrarEstudiante(estudiantePremium);
    }

    /**
     * Muestra la información de cualquier objeto
     * que sea de tipo Estudiante.
     *
     * Este método demuestra el principio LSP,
     * ya que acepta tanto EstudianteRegular como
     * EstudiantePremium.
     *
     * @param estudiante estudiante que se desea mostrar
     */
    public static void mostrarEstudiante(Estudiante estudiante) {

        estudiante.mostrarInformacion();
    }
}