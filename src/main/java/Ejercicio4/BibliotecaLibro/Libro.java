package Ejercicio4.BibliotecaLibro;

import java.util.ArrayList;
import java.util.List;

public class Libro implements LibroPrototype {

    private String titulo;
    private String autor;
    private String contenido;
    private List<String> anotaciones;
    private List<String> marcadores;
    private String resumen;

    /**
     * Constructor del libro.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param contenido contenido del libro
     */
    public Libro(
            String titulo,
            String autor,
            String contenido) {

        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;

        this.anotaciones = new ArrayList<>();
        this.marcadores = new ArrayList<>();
    }

    /**
     * Constructor utilizado para crear una copia
     * del libro original.
     *
     * @param libro libro que será clonado
     */
    private Libro(Libro libro) {

        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.contenido = libro.contenido;

        this.anotaciones =
                new ArrayList<>(libro.anotaciones);

        this.marcadores =
                new ArrayList<>(libro.marcadores);

        this.resumen = libro.resumen;
    }

    /**
     * Crea una copia independiente del libro.
     *
     * @return copia del libro
     */
    @Override
    public Libro clonar() {

        return new Libro(this);
    }

    /**
     * Agrega una anotación al libro.
     *
     * @param anotacion texto de la anotación
     */
    @Override
    public void agregarAnotacion(String anotacion) {

        anotaciones.add(anotacion);
    }

    /**
     * Agrega un marcador al libro.
     *
     * @param marcador página o referencia
     */
    @Override
    public void agregarMarcador(String marcador) {

        marcadores.add(marcador);
    }

    /**
     * Agrega un resumen al libro.
     *
     * @param resumen resumen personalizado
     */
    @Override
    public void agregarResumen(String resumen) {

        this.resumen = resumen;
    }

    /**
     * Muestra la información del libro.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("===== LIBRO =====");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
        System.out.println("Anotaciones: " + anotaciones);
        System.out.println("Marcadores: " + marcadores);
        System.out.println("Resumen: " + resumen);
        System.out.println("=================");
    }
}