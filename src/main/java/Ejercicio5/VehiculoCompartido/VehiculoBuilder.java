package Ejercicio5.VehiculoCompartido;

import java.util.ArrayList;
import java.util.List;

public class VehiculoBuilder implements Construible {

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
     * Capacidad del vehículo.
     */
    private int capacidad;

    /**
     * Lista de accesorios.
     */
    private List<String> accesorios = new ArrayList<>();

    /**
     * Configura el tipo de vehículo.
     *
     * @param tipo tipo de vehículo
     * @return este Builder
     */
    public VehiculoBuilder tipo(String tipo) {

        this.tipo = tipo;

        return this;
    }

    /**
     * Configura la placa del vehículo.
     *
     * @param placa placa del vehículo
     * @return este Builder
     */
    public VehiculoBuilder placa(String placa) {

        this.placa = placa;

        return this;
    }

    /**
     * Configura el color del vehículo.
     *
     * @param color color del vehículo
     * @return este Builder
     */
    public VehiculoBuilder color(String color) {

        this.color = color;

        return this;
    }

    /**
     * Configura la capacidad del vehículo.
     *
     * @param capacidad capacidad del vehículo
     * @return este Builder
     */
    public VehiculoBuilder capacidad(int capacidad) {

        this.capacidad = capacidad;

        return this;
    }

    /**
     * Agrega un accesorio al vehículo.
     *
     * @param accesorio accesorio que se desea agregar
     * @return este Builder
     */
    public VehiculoBuilder agregarAccesorio(String accesorio) {

        this.accesorios.add(accesorio);

        return this;
    }

    /**
     * Construye el vehículo.
     *
     * El tipo y la placa son datos obligatorios.
     *
     * @return vehículo construido
     * @throws IllegalArgumentException si falta el tipo
     *                                  o la placa
     */
    @Override
    public Vehiculo construir() {

        if (tipo == null || tipo.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El tipo de vehículo es obligatorio."
            );
        }

        if (placa == null || placa.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "La placa es obligatoria."
            );
        }

        return new Vehiculo(
                tipo,
                placa,
                color,
                capacidad,
                accesorios
        );
    }
}
