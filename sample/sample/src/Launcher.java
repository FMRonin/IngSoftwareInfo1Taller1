
import presentacion.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class Launcher {

    private Modelo miApp;
    
    public static void main(String[] args) {
        new Launcher();
    }

    public Launcher() {
        miApp = new Modelo();
        miApp.iniciar();
    }
    
}
