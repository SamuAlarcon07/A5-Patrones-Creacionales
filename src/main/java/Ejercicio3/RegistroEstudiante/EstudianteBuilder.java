package Ejercicio3.RegistroEstudiante;

public class EstudianteBuilder {

    /**
     * Nombre del estudiante.
     */
    private String nombre;

    /**
     * Correo del estudiante.
     */
    private String correo;

    /**
     * Teléfono del estudiante.
     */
    private String telefono;

    /**
     * Dirección del estudiante.
     */
    private String direccion;

    /**
     * Intereses del estudiante.
     */
    private String intereses;

    /**
     * Configura el nombre del estudiante.
     *
     * @param nombre nombre del estudiante
     * @return este Builder
     */
    public EstudianteBuilder nombre(String nombre) {

        this.nombre = nombre;

        return this;
    }

    /**
     * Configura el correo del estudiante.
     *
     * @param correo correo del estudiante
     * @return este Builder
     */
    public EstudianteBuilder correo(String correo) {

        this.correo = correo;

        return this;
    }

    /**
     * Configura el teléfono del estudiante.
     *
     * @param telefono teléfono del estudiante
     * @return este Builder
     */
    public EstudianteBuilder telefono(String telefono) {

        this.telefono = telefono;

        return this;
    }

    /**
     * Configura la dirección del estudiante.
     *
     * @param direccion dirección del estudiante
     * @return este Builder
     */
    public EstudianteBuilder direccion(String direccion) {

        this.direccion = direccion;

        return this;
    }

    /**
     * Configura los intereses del estudiante.
     *
     * @param intereses intereses del estudiante
     * @return este Builder
     */
    public EstudianteBuilder intereses(String intereses) {

        this.intereses = intereses;

        return this;
    }

    /**
     * Construye un objeto Estudiante.
     *
     * El nombre y el correo son datos obligatorios.
     *
     * @return estudiante construido
     * @throws IllegalArgumentException si falta el nombre
     *                                  o el correo
     */
    public Estudiante construir() {

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El nombre es obligatorio."
            );
        }

        if (correo == null || correo.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El correo es obligatorio."
            );
        }

        return new Estudiante(
                nombre,
                correo,
                telefono,
                direccion,
                intereses
        );
    }
}
