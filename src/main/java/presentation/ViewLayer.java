package presentation;

import javax.swing.*;
import java.awt.*;

public class ViewLayer extends javax.swing.JFrame{

    private ControllerLayer control;
    private final ModelLayer sistema;

    private JPanel panel1;
    private JButton avanzarButton;
    private JButton girarHorarioButton;
    private JButton girarAntiHorarioButton;
    private JList comandos;
    private JButton correrButton;
    private JButton detenerButton;
    private JButton reiniciarButton;
    private Canvas tablero;

    public ViewLayer(ModelLayer sistema) {
        this.sistema = sistema;
        initComponents();
        //catchEvent();
    }

    private void initComponents() {
        panel1 = new JPanel();
        avanzarButton = new JButton();
        girarHorarioButton = new JButton();
        girarAntiHorarioButton = new JButton();
        comandos = new JList();
        correrButton = new JButton();
        detenerButton = new JButton();
        reiniciarButton = new JButton();
        tablero = new Canvas();

        //panel1.setBounds(5,5,100,100);
        //panel1.setBackground(Color.BLUE);

        getContentPane().add(panel1);
        getContentPane().add(avanzarButton);
        getContentPane().add(girarHorarioButton);
        getContentPane().add(girarAntiHorarioButton);
        getContentPane().add(comandos);
        getContentPane().add(correrButton);
        getContentPane().add(detenerButton);
        getContentPane().add(reiniciarButton);
        getContentPane().add(tablero);

    }

    private void catchEvent() {
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
