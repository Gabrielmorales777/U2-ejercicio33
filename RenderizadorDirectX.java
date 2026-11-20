
public class RenderizadorDirectX implements MotorGrafico {

    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("DirectX: Contexto inicializado correctamente.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("DirectX: Error, el contexto no esta inicializado.");
            return;
        }

        System.out.println("DirectX: Dibujando malla " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("DirectX: No hay recursos para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("DirectX: Recursos liberados correctamente.");
    }
}
