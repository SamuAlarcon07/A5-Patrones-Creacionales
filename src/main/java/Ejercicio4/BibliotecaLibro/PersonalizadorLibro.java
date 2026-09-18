package Ejercicio4.BibliotecaLibro;

public class PersonalizadorLibro {

    /**
     * Crea una copia del libro y le agrega una anotación.
     *
     * @param libro libro que se desea clonar
     * @param anotacion anotación que se desea agregar
     * @return copia personalizada
     */
    public LibroPrototype agregarAnotacion(
            LibroPrototype libro,
            String anotacion) {

        LibroPrototype copia = libro.clonar();

        copia.agregarAnotacion(anotacion);

        return copia;
    }
}