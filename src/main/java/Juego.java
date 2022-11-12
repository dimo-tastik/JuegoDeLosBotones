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
                rangoDeColor(boton1);
            }
        });
        botonesEnMapa(boton2);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton2);
            }
        });
        botonesEnMapa(boton3);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton3);
            }
        });
        botonesEnMapa(boton4);
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton4);
            }
        });
        botonesEnMapa(boton5);
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton5);
            }
        });
        botonesEnMapa(boton6);
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton6);
            }
        });
        botonesEnMapa(boton7);
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton7);
            }
        });
        botonesEnMapa(boton8);
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton8);
            }
        });
        botonesEnMapa(boton9);
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rangoDeColor(boton9);
            }
        });
    }
    private void botonesEnMapa(JButton boton) {
        botones.put("boton" + boton.getText(), boton);
    }

    private void rangoDeColor(JButton boton) {

        ArrayList<Integer> coords = new ArrayList<Integer>();

        int centro = Integer.parseInt(boton.getText());
        coords.add(centro);
        int norte = centro - 3;
        coords.add(norte);
        int sur = centro + 3;
        coords.add(sur);
        int este = centro + 1;
        coords.add(este);
        int oeste = centro - 1;
        coords.add(oeste);

        //solucion problema con condiciones

        if (centro == 3)
            coords.remove((Integer) 4);

        else if (centro == 4)
            coords.remove((Integer) 3);

        else if (centro == 6)
            coords.remove((Integer) 7);

        else if (centro == 7)
            coords.remove((Integer) 6);

        for (Integer coord : coords) {
            if ((int) coord < 10 && (int) coord > 0) {
                darColor(botones.get("boton" + coord));
            }
        }
    }

    private void darColor(JButton boton) {
        if (boton.getBackground() == Color.green) {
            boton.setForeground(Color.red);
            boton.setBackground(Color.red);
        } else {
            boton.setForeground(Color.green);
            boton.setBackground(Color.green);
        }
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
