import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Juego extends JFrame {
    Map<String, JButton> botones = new HashMap<>();
    private JPanel jpBorderLayout;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;

    public Juego() {
        inicializarBotones();
        inicializarVentana();
    }

    private void inicializarBotones() {
        botonesEnMapa(boton1);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton2);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton3);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton4);
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton5);
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton6);
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton7);
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton8);
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botonesEnMapa(boton9);
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    private void botonesEnMapa(JButton boton) {
        botones.put("boton" + boton.getText(), boton);
    }

    private void inicializarVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("El Juego De Los Botones");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setContentPane(jpBorderLayout);
        setVisible(true);
    }
}
