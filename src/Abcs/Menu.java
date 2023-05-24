package Abcs;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu;
    public Menu(){
        super("Menu");
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    }
}
