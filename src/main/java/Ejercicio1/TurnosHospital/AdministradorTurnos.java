package Ejercicio1.TurnosHospital;

/**
 * Administra los turnos del hospital utilizando el patrón Singleton.
 */
public final class AdministradorTurnos {

    private static AdministradorTurnos instancia;
    private int turnoActual;

    private AdministradorTurnos() {
        turnoActual = 0;
    }

    public static AdministradorTurnos getInstancia() {
        if (instancia == null) {
            instancia = new AdministradorTurnos();
        }

        return instancia;
    }

    public int asignarTurno() {
        turnoActual++;
        return turnoActual;
    }

    public int getTurnoActual() {
        return turnoActual;
    }
}
