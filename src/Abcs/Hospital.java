package Abcs;
import javax.swing.*;
import java.awt.event.*;
public class Hospital extends JFrame implements ActionListener{
    JButton botonRegreso = new JButton("Regresar");
    public Hospital(){
        super("Hospital");
        botonRegreso.addActionListener(this);
        add(botonRegreso);
        setSize(1200, 500);
        setDefaultCloseOperation(2);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == botonRegreso){
            dispose();
            new BarraMenu();
        }
    }
}
