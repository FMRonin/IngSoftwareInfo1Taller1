package presentation;

public class ViewLayer extends javax.swing.JFrame{

    private ControllerLayer control;
    private final ModelLayer sistema;

    public ViewLayer(ControllerLayer aThis) {
        control = aThis;
        initComponent();
        asignarEvent();
    }

    private void initComponent() {

    }
}
