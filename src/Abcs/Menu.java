package Abcs;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem gestorEmpleados, hospital;
    public Menu(){
        super("Menu");
        menuBar = new JMenuBar();
        menu = new JMenu("Programas");
        gestorEmpleados = new JMenuItem("Gestor de empleados");
        hospital = new JMenuItem("Hospital");
        menu.add(gestorEmpleados);
        menu.add(hospital);
        menuBar.add(menu);
        gestorEmpleados.addActionListener(this);
        hospital.addActionListener(this);
        setLayout(new FlowLayout());
        setJMenuBar(menuBar);
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gestorEmpleados){
            dispose();
            new gestorEmpleados();
        } else if(e.getSource() == hospital){
            dispose();
            new Hospital();
        }
    }
}
