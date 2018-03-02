package presentation;

import logic.LigthBot;

import javax.swing.*;

public class ModelLayer implements Runnable{

    private ViewLayer window;
    private LigthBot MyGame;

    public ModelLayer() {

    }

    public void iniciar() {
        getWindow().setVisible(true);
    }

    public ViewLayer getWindow() {
        if (window == null){
            window = new ViewLayer(this);
        }
        return window;
    }

    public void run() {

        try {
            animate();
        }catch (Exception e){
            JOptionPane.showConfirmDialog(getWindow(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void animate() {
    }

    void crearNuevoTablero() {
        if(!isAnimando()){
            MyGame = null;
            System.gc();
            boolean animando = false;
        }
    }


    public boolean isAnimando() {
        return Boolean.parseBoolean(null);
    }
}
