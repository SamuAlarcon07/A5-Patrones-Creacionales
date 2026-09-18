package Ejercicio4.BibliotecaLibro;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // CREAR LIBRO ORIGINAL
        // ==========================================

        Libro libroOriginal = new Libro(
                "Interstellar",
                "Christopher Nolan",
                "Libro digital sobre astronomía y espacio."
        );

        System.out.println("===== LIBRO ORIGINAL =====");

        libroOriginal.mostrarInformacion();


        // ==========================================
        // CREAR COPIA CON PROTOTYPE
        // ==========================================

        Libro copia = libroOriginal.clonar();

        copia.agregarAnotacion(
                "Concepto importante sobre el espacio."
        );

        copia.agregarMarcador(
                "Página 25"
        );

        copia.agregarResumen(
                "Resumen personalizado del capítulo."
        );

        System.out.println("\n===== COPIA PERSONALIZADA =====");

        copia.mostrarInformacion();


        // ==========================================
        // COMPROBAR QUE EL ORIGINAL NO CAMBIÓ
        // ==========================================

        System.out.println(
                "\n===== LIBRO ORIGINAL SIN MODIFICAR ====="
        );

        libroOriginal.mostrarInformacion();


        // ==========================================
        // DIP
        // ==========================================

        System.out.println("\n===== PRUEBA DE DIP =====");

        PersonalizadorLibro personalizador =
                new PersonalizadorLibro();

        LibroPrototype nuevaCopia =
                personalizador.agregarAnotacion(
                        libroOriginal,
                        "Nueva anotación."
                );

        nuevaCopia.mostrarInformacion();
    }
}