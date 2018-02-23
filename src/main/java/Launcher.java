import presentation.ModelLayer;

public class Launcher {

    private ModelLayer miApp;

    public static void main(String[] args) {
        new Launcher();
    }

    private Launcher() {
        miApp = new ModelLayer();
        miApp.iniciar();
    }
}
