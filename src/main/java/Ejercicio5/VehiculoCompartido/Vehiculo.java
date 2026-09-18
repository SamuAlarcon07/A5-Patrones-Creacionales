package Ejercicio5.VehiculoCompartido;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo implements Clonable {

    /**
     * Tipo de vehículo.
     */
    private String tipo;

    /**
     * Placa del vehículo.
     */
    private String placa;

    /**
     * Color del vehículo.
     */
    private String color;

    /**
     * Capacidad de pasajeros.
     */
    private int capacidad;

    /**
     * Lista de accesorios del vehículo.
     */
    private List<String> accesorios;

    /**
     * Constructor del vehículo.
     *
     * @param tipo tipo de vehículo
     * @param placa placa del vehículo
     * @param color color del vehículo
     * @param capacidad capacidad del vehículo
     * @param accesorios accesorios del vehículo
     */
    public Vehiculo(
            String tipo,
            String placa,
            String color,
            int capacidad,
            List<String> accesorios) {

        this.tipo = tipo;
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;

        this.accesorios =
                new ArrayList<>(accesorios);
    }

    /**
     * Constructor utilizado para clonar un vehículo.
     *
     * @param vehiculo vehículo que se desea copiar
     */
    private Vehiculo(Vehiculo vehiculo) {

        this.tipo = vehiculo.tipo;
        this.placa = vehiculo.placa;
        this.color = vehiculo.color;
        this.capacidad = vehiculo.capacidad;

        this.accesorios =
                new ArrayList<>(vehiculo.accesorios);
    }

    /**
     * Crea una copia independiente del vehículo.
     *
     * @return copia del vehículo
     */
    @Override
    public Vehiculo clonar() {

        return new Vehiculo(this);
    }

    /**
     * Muestra la información del vehículo.
     */
    public void mostrarInformacion() {

        System.out.println("===== VEHÍCULO =====");
        System.out.println("Tipo: " + tipo);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Accesorios: " + accesorios);
        System.out.println("====================");
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return tipo de vehículo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene la placa del vehículo.
     *
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Obtiene el color.
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtiene la capacidad.
     *
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Obtiene los accesorios.
     *
     * @return lista de accesorios
     */
    public List<String> getAccesorios() {
        return accesorios;
    }
}
