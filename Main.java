
public class Main {

    public static void main(String[] args) {

        MotorGrafico motor = new RenderizadorOpenGL();

        SistemaGrafico sistema = new SistemaGrafico(motor);

        System.out.println("=== RENDERIZADO CON OPENGL ===");
        sistema.ejecutarCicloGrafico("Personaje");

        System.out.println("\n=== RENDERIZADO CON DIRECTX ===");

        sistema.cambiarMotor(new RenderizadorDirectX());
        sistema.ejecutarCicloGrafico("Escenario");

        System.out.println("\n=== RENDERIZADO CON VULKAN ===");

        sistema.cambiarMotor(new RenderizadorVulkan());
        sistema.ejecutarCicloGrafico("Vehiculo");
    }
}
