package Ejercicio5.VehiculoCompartido;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // CREAR CARRO CON BUILDER
        // ==========================================

        Vehiculo carro =
                new VehiculoBuilder()
                        .tipo("Carro")
                        .placa("ABC123")
                        .color("Negro")
                        .capacidad(5)
                        .agregarAccesorio("GPS")
                        .agregarAccesorio("Cámara")
                        .construir();

        System.out.println("===== VEHÍCULO ORIGINAL =====");

        carro.mostrarInformacion();


        // ==========================================
        // CLONAR CARRO CON PROTOTYPE
        // ==========================================

        Vehiculo carroClonado =
                carro.clonar();

        System.out.println("\n===== VEHÍCULO CLONADO =====");

        carroClonado.mostrarInformacion();


        // ==========================================
        // CREAR MOTO CON BUILDER
        // ==========================================

        Vehiculo moto =
                new VehiculoBuilder()
                        .tipo("Moto")
                        .placa("XYZ789")
                        .color("Rojo")
                        .capacidad(2)
                        .agregarAccesorio("Casco")
                        .construir();

        System.out.println("\n===== MOTO =====");

        moto.mostrarInformacion();


        // ==========================================
        // CREAR BICICLETA CON BUILDER
        // ==========================================

        Vehiculo bicicleta =
                new VehiculoBuilder()
                        .tipo("Bicicleta")
                        .placa("BICI001")
                        .color("Azul")
                        .capacidad(1)
                        .construir();

        System.out.println("\n===== BICICLETA =====");

        bicicleta.mostrarInformacion();


        // ==========================================
        // COMPROBAR PROTOTYPE
        // ==========================================

        System.out.println(
                "\n¿El carro y su clon son objetos diferentes? "
                        + (carro != carroClonado)
        );
    }
}