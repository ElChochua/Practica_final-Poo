package Abcs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BarraMenu extends JFrame implements ActionListener {

    public JMenuBar menuBar;
    public JMenu menu;
    public JMenuItem gestorEmpleados, hospital, biblioteca,inventario;

    public JMenuBar getMenu() {
        menuBar = new JMenuBar();
        menu = new JMenu("Programas");
        gestorEmpleados = new JMenuItem("Gestor de empleados");
        hospital = new JMenuItem("Hospital");
        inventario = new JMenuItem("Inventario");
        biblioteca = new JMenuItem("Biblioteca");
        menu.add(gestorEmpleados);
        menu.add(inventario);
        menu.add(biblioteca);
        menu.add(hospital);
        menuBar.add(menu);
        inventario.addActionListener(this);
        gestorEmpleados.addActionListener(this);
        hospital.addActionListener(this);
        biblioteca.addActionListener(this);
        return menuBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestorEmpleados) {
            dispose();
            GestorEmpleadoss Gestor = new GestorEmpleadoss();
            Gestor.setVisible(true);
        } else if (e.getSource() == hospital) {
            dispose();
            Hospitall hospital = new Hospitall();
            hospital.setVisible(true);
        } else if (e.getSource() == biblioteca) {
            dispose();
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.setVisible(true);
        }else if(e.getSource() == inventario){
            dispose();
            Inventario inventario = new Inventario();
            inventario.setVisible(true);
        }
    }

}
