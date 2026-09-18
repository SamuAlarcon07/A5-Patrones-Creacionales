package Ejercicio2.ConfiguracionJuego;

/**
 * Clase principal para probar los patrones
 * Singleton y Builder.
 */
public class Main {

    public static void main(String[] args) {


        ConfiguracionJuego configuracion1 =
                ConfiguracionJuego.getInstancia();

        ConfiguracionJuego configuracion2 =
                ConfiguracionJuego.getInstancia();

        System.out.println("Configuración inicial:");
        configuracion1.mostrarConfiguraciones();


        configuracion1.cambiarConfiguracion("Dificultad", "Dificil");

        System.out.println("\nDespués de cambiar la dificultad:");
        configuracion2.mostrarConfiguraciones();


        configuracion1.agregarConfiguracion("Resolución", "1920x1080");

        System.out.println("\nConfiguración final:");
        configuracion1.mostrarConfiguraciones();


        if (configuracion1 == configuracion2) {
            System.out.println("\nLos dos jugadores usan la misma configuración.");
        } else {
            System.out.println("\nLos jugadores tienen configuraciones diferentes.");
        }
    }
}

