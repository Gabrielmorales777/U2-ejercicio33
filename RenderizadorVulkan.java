
public class RenderizadorVulkan implements MotorGrafico {

    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("Vulkan: Contexto inicializado correctamente.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("Vulkan: Error, el contexto no esta inicializado.");
            return;
        }

        System.out.println("Vulkan: Dibujando malla " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("Vulkan: No hay recursos para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("Vulkan: Recursos liberados correctamente.");
    }
}
