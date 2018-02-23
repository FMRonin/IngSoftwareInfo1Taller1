/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.LightBot;

/**
 *
 * @author estudiantes
 */
public class Modelo implements Runnable{

    private LightBot miJuego;
    private Vista ventana;
    private boolean running;
    private Thread hiloDibujo;

    public Modelo() {
        running = false;
        hiloDibujo = new Thread(this);
    }
    
    

    public LightBot getMiJuego() {
        if(miJuego == null){
            miJuego = new LightBot();
        }
        return miJuego;
    }

    public Vista getVentana() {
        if(ventana == null){
            ventana = new Vista(this);
        }
        return ventana;
    }
    
    
    
    
    //-----metodos del sistema
    public void iniciar() {
        running = true;
        
        
        
        
        hiloDibujo.start();
    }

    @Override
    public void run() {
        while(running){
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
            dibujar();
        }
    }

    private void dibujar() {
        Canvas lienzo = getVentana().getLienzo();
        Graphics lapiz = lienzo.getGraphics();
        
        
        lapiz.drawLine(0, 0, 100, 100);
        // Punto2D p = getLightBot().getPersonaje().getPosicion();
        
    }

    void avanzar() {
        // getLightBot().getPersonaje().avance();
    }
    
}
