package Abcs;
import java.awt.TextField;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class AdministradorBD {
    public Connection con = null;
    public void conectar(){
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
    }
    //Funcion para registar Usuarios desde el Login        Throw para notificarnos de algun fallo
    public void registrarUsuario(String user, String pass) throws SQLException{
       String strSql = "INSERT INTO Login (Nombre, Contraseña) VALUES ('" + user + "','" + pass + "')";
       Statement stmt = con.createStatement();
       int rowsEffected = stmt.executeUpdate(strSql);
       JOptionPane.showMessageDialog(null, "Usuario " + user + " Registrado");
    }
    //Funcion para validar si el login fue correcto 
    public boolean validarLogin(String user, String password){
        boolean validacion = false;
                try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Login WHERE Nombre = '"+user+"' AND Contraseña = '"+password+"'");
            if(rs.next()) {
                validacion = true;
                JOptionPane.showMessageDialog(null, "Bienvenido " + user + "!");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                validacion = false;
            }
        }catch(SQLException sqlEx){
            JOptionPane.showMessageDialog(null, sqlEx.toString());
        }
        return validacion;
    }
        public void ejecutarConsulta(String consulta, Object... datos)throws SQLException{
        PreparedStatement stmt = con.prepareStatement(consulta);
        for(int i = 0;i<datos.length;i++){
            stmt.setObject(i+1, datos[i]);
        }
        stmt.executeUpdate();
        stmt.close();
        }
        //Funcion para hacer busquedas de algun tipo de dato en especifico
        public ResultSet hacerBusqueda(String tabla, String columna, String dato)throws SQLException{
            String consulta = "SELECT * FROM " + tabla + " WHERE " + columna + " = '"+
                    dato + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            return rs;
        }
        public static void vaciarCampos(JTextField... campos){
            for(JTextField textField : campos){
                textField.setText(null);
            }
        }
}
