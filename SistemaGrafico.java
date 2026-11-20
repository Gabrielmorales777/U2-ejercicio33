
public class SistemaGrafico {

    private MotorGrafico motor;

    public SistemaGrafico(MotorGrafico motor) {
        this.motor = motor;
    }

    public void cambiarMotor(MotorGrafico nuevoMotor) {
        motor.liberarRecursos();

        motor = nuevoMotor;

        System.out.println("Se cambio el motor de renderizado.");
    }

    public void ejecutarCicloGrafico(String nombreMalla) {

        motor.inicializarContexto();

        motor.dibujarMalla(nombreMalla);

        motor.liberarRecursos();
    }
}
