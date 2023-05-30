package Abcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    private AdministradorBD conectorBD = new AdministradorBD();
    JButton loginButton = new JButton("Acceder");
    JButton registerButton = new JButton("Registrarse");
    JLabel imagenLabel = new JLabel();
    private JLabel usuarioLabel, passwordLabel;
    private JTextField usuarioTextField;
    private JPasswordField passwordText;

    public Login() {
        super("Login");
        //Conexion
        conectorBD.conectar();
        //Interfaz
        //PlaceHolder luego lo cambio 👍👍👍👍
        imagenLabel.setIcon(new ImageIcon((getClass().getResource("/Abcs/Jhon.jpg"))));
        Image img = Toolkit.getDefaultToolkit().getImage("src/Abcs/images/gato.png");
        setIconImage(img);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        usuarioLabel = new JLabel("Username: ");
        usuarioTextField = new JTextField(15);
        passwordLabel = new JLabel("Contraseña: ");
        passwordText = new JPasswordField(15);
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
        add(imagenLabel);
        add(usuarioLabel);
        add(usuarioTextField);
        add(passwordLabel);
        add(passwordText);
        add(loginButton);
        add(registerButton);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String pass = String.valueOf(passwordText.getPassword());
            if (conectorBD.validarLogin(usuarioTextField.getText(), pass)) {
                dispose();
                new Menu().setVisible(true);
            }
        } else if (e.getSource() == registerButton) {
            String user, pass;
            user = usuarioTextField.getText();
            pass = String.valueOf(passwordText.getPassword());
            try {
                conectorBD.registrarUsuario(user, pass);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }

    public void KeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String pass = String.valueOf(passwordText.getPassword());
            if (conectorBD.validarLogin(usuarioTextField.getText(), pass)) {
                dispose();
                new Menu().setVisible(true);
            }
        }
    }
}
