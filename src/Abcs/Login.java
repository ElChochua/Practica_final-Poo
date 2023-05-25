package Abcs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton loginButton = new JButton("Acceder");
    JButton registerButton = new JButton("Registrarse");
    JLabel imagenLabel = new JLabel();
    Connection con = null;
    private JLabel usuarioLabel, passwordLabel;
    private JTextField usuarioTextField;
    private JPasswordField passwordText;
    public int inicioSesion(String User, String Password){
        Integer resultado = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Login WHERE Nombre = '"+User+"' AND Contraseña = '"+Password+"'");
            if(rs.next()) {
                resultado = 1;
                JOptionPane.showMessageDialog(null, "Bienvenido " + User + "!");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                resultado = 0;
            }
        }catch(SQLException sqlEx){
            JOptionPane.showMessageDialog(null, sqlEx.toString());
        }
        return resultado;
    }
    public Login() {

        super("Login");
        //Conexion
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                    "databaseName=Sesiones;" +
                    "user=sa;" +
                    "password=06440566;"+
                    "trustServerCertificate=True;");//Esta linea es para validar el certificado de seguridad

            JOptionPane.showMessageDialog(null, "Conexión con la BD exitosa");
        }catch(SQLException sqlEx){
            JOptionPane.showMessageDialog(null, sqlEx.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Interfaz
        //PlaceHolder luego lo cambio 👍👍👍👍
        imagenLabel.setIcon(new ImageIcon("src/Abcs/images/Jhon.jpg"));
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
        if(e.getSource() == loginButton) {
                String pass = String.valueOf(passwordText.getPassword());
                if(inicioSesion(usuarioTextField.getText(), pass) == 1){
                    dispose();
                    new Menu();
                }
        } else if(e.getSource() == registerButton) {
            try{
                String pass = String.valueOf(passwordText.getPassword());
                String strSql = "INSERT INTO Login (Nombre, Contraseña) VALUES ('" + usuarioTextField.getText() + "','" + pass + "')";
                Statement stmt = con.createStatement();
                int rowsEffected = stmt.executeUpdate(strSql);
                JOptionPane.showMessageDialog(null, "Usuario registrado");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }
}
