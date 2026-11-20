
public class RenderizadorOpenGL implements MotorGrafico {

    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("OpenGL: Contexto inicializado correctamente.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("OpenGL: Error, el contexto no esta inicializado.");
            return;
        }

        System.out.println("OpenGL: Dibujando malla " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("OpenGL: No hay recursos para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("OpenGL: Recursos liberados correctamente.");
    }
}

