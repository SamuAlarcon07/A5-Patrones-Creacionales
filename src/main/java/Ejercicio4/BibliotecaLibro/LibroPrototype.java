package Ejercicio4.BibliotecaLibro;

public interface LibroPrototype {

    /**
     * Crea una copia del libro.
     *
     * @return copia del libro
     */
    LibroPrototype clonar();

    /**
     * Agrega una anotación al libro.
     *
     * @param anotacion texto de la anotación
     */
    void agregarAnotacion(String anotacion);

    /**
     * Agrega un marcador al libro.
     *
     * @param marcador página o referencia del marcador
     */
    void agregarMarcador(String marcador);

    /**
     * Agrega un resumen al libro.
     *
     * @param resumen resumen personalizado
     */
    void agregarResumen(String resumen);

    /**
     * Muestra la información del libro.
     */
    void mostrarInformacion();
}