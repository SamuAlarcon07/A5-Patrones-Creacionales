package Ejercicio2.ConfiguracionJuego;

import java.util.ArrayList;

/**
 * Administra la configuración global del videojuego.
 */
public final class ConfiguracionJuego {

    private static ConfiguracionJuego instancia;

    private ArrayList<Configuracion> configuraciones;

    private ConfiguracionJuego() {
        configuraciones = new ArrayList<>();

        configuraciones.add(new Configuracion("Idioma", "Español"));
        configuraciones.add(new Configuracion("Dificultad", "Dificil"));
        configuraciones.add(new Configuracion("Sonido", "Activado"));
    }

    /**
     * Obtiene la única instancia de la configuración del juego.
     */
    public static ConfiguracionJuego getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionJuego();
        }

        return instancia;
    }
    /**
     * Permite agregar una nueva configuración sin modificar la clase principal.
     */
    public void agregarConfiguracion(String nombre, String valor) {
        configuraciones.add(new Configuracion(nombre, valor));
    }

    public void cambiarConfiguracion(String nombre, String nuevoValor) {
        for (Configuracion configuracion : configuraciones) {
            if (configuracion.getNombre().equalsIgnoreCase(nombre)) {
                configuracion.setValor(nuevoValor);
            }
        }
    }

    public void mostrarConfiguraciones() {
        for (Configuracion configuracion : configuraciones) {
            System.out.println(configuracion);
        }
    }
}

