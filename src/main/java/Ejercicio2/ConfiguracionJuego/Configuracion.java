package Ejercicio2.ConfiguracionJuego;

public class Configuracion {

    private String nombre;
    private String valor;

    public Configuracion(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nombre + ": " + valor;
    }
}
