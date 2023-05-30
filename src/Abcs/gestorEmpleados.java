package Abcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class gestorEmpleados extends JFrame implements ActionListener {
    private JButton botonRegreso,buscarId,buscarNombre,modificar, eliminar,agregar;
    private JTextField campoId, campoNombre, campoApellido, campoEdad, campoPuesto, campoSalario;
    private JPanel panel_Derechaa, panel_Izquierda, panel_Botones;


    public static void main(String[] args) {
        new gestorEmpleados();
    }
    public gestorEmpleados(){
        super("Gestor de empleados");
        setLayout(new BorderLayout());
        panel_Izquierda = new JPanel();
        panel_Botones = new JPanel();
        panel_Derechaa = new JPanel();
        campoId = new JTextField();
        campoNombre = new JTextField();
        campoApellido = new JTextField();
        campoEdad = new JTextField();
        campoPuesto = new JTextField();
        campoSalario = new JTextField();
        buscarId = new JButton("Buscar por ID");
        botonRegreso = new JButton("Regresar");
        buscarNombre = new JButton("Buscar por nombre");
        modificar = new JButton("Modificar");
        eliminar = new JButton("Eliminar");
        agregar = new JButton("Agregar");
        panel_Izquierda.add(new JLabel("ID: "));
        panel_Izquierda.add(campoId);
        panel_Izquierda.add(new JLabel("Nombre: "));
        panel_Izquierda.add(campoNombre);
        panel_Izquierda.add(new JLabel("Apellido: "));
        panel_Izquierda.add(campoApellido);
        panel_Izquierda.add(new JLabel("Edad: "));
        panel_Izquierda.add(campoEdad);
        panel_Izquierda.add(new JLabel("Puesto: "));
        panel_Izquierda.add(campoPuesto);
        panel_Izquierda.add(new JLabel("Salario: "));
        panel_Izquierda.add(campoSalario);
        panel_Botones.add(buscarId);
        panel_Botones.add(buscarNombre);
        panel_Botones.add(modificar);
        panel_Botones.add(eliminar);
        panel_Botones.add(agregar);
        panel_Botones.add(botonRegreso);
        panel_Derechaa.setLayout(new BoxLayout(panel_Derechaa, BoxLayout.Y_AXIS));
        botonRegreso.addActionListener(this);
        buscarId.addActionListener(this);
        buscarNombre.addActionListener(this);
        modificar.addActionListener(this);
        eliminar.addActionListener(this);
        agregar.addActionListener(this);
        add(panel_Izquierda, SpringLayout.EAST);
        add(panel_Derechaa);
        add(panel_Botones, BorderLayout.NORTH);
        setSize(1200, 500);
        setDefaultCloseOperation(2);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton para ir al Menu de inicio al presionarlo
        if(e.getSource() == botonRegreso){
            dispose();
            new BarraMenu();
        }
    }
}
