package Ejercicio1.TurnosHospital;


public class Main { public static void main(String[] args) {

    AdministradorTurnos administrador1 =
            AdministradorTurnos.getInstancia();

    AdministradorTurnos administrador2 =
            AdministradorTurnos.getInstancia();

    System.out.println("Turno paciente 1: " + administrador1.asignarTurno());
    System.out.println("Turno paciente 2: " + administrador2.asignarTurno());
    System.out.println("Turno paciente 3: " + administrador1.asignarTurno());
    System.out.println("Turno paciente 4: " + administrador2.asignarTurno());


    if (administrador1 == administrador2) {
        System.out.println("El administrador de turnos es único.");
    } else {
        System.out.println("Hay más de un administrador de turnos.");
    }
}
}
