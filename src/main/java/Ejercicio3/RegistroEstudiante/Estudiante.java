package Ejercicio3.RegistroEstudiante;


public class Estudiante {

    /**
     * Nombre del estudiante.
     */
    private String nombre;

    /**
     * Correo electrónico del estudiante.
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
     * Constructor de Estudiante.
     *
     * @param nombre nombre del estudiante
     * @param correo correo del estudiante
     * @param telefono teléfono del estudiante
     * @param direccion dirección del estudiante
     * @param intereses intereses del estudiante
     */
    public Estudiante(
            String nombre,
            String correo,
            String telefono,
            String direccion,
            String intereses) {

        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.intereses = intereses;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el correo del estudiante.
     *
     * @return correo del estudiante
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Obtiene el teléfono del estudiante.
     *
     * @return teléfono del estudiante
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la dirección del estudiante.
     *
     * @return dirección del estudiante
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene los intereses del estudiante.
     *
     * @return intereses del estudiante
     */
    public String getIntereses() {
        return intereses;
    }

    /**
     * Muestra la información del estudiante por consola.
     */
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Intereses: " + intereses);
    }
}



