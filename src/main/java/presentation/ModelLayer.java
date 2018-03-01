package presentation;

import logic.LigthBot;

public class ModelLayer implements Runnable{

    private ViewLayer ventana;
    private LigthBot MyGame;

    public ModelLayer() {

    }

    public void iniciar() {
    }

    public ViewLayer getVentana() {
        if (ventana == null){
            ventana = new ViewLayer(control, sistema);
        }
        return ventana;
    }

    public void run() {

    }
}
