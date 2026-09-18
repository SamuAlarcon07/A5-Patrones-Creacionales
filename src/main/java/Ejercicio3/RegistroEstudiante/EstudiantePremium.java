package Ejercicio3.RegistroEstudiante;

public class EstudiantePremium extends Estudiante {

    /**
     * Constructor del estudiante premium.
     *
     * @param nombre nombre del estudiante
     * @param correo correo del estudiante
     * @param telefono teléfono del estudiante
     * @param direccion dirección del estudiante
     * @param intereses intereses del estudiante
     */
    public EstudiantePremium(
            String nombre,
            String correo,
            String telefono,
            String direccion,
            String intereses) {

        super(
                nombre,
                correo,
                telefono,
                direccion,
                intereses
        );
    }

    /**
     * Muestra la información del estudiante premium.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("===== ESTUDIANTE PREMIUM =====");

        super.mostrarInformacion();

        System.out.println("Tipo: Premium");
    }
}
