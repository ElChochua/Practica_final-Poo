package Abcs;

import java.awt.*;
import javax.swing.*;
import java.awt.Image.*;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jossu
 */
public class GestorEmpleadoss extends JFrame {

    /**
     * Creates new form GestorEmpleadoss
     */
    private Empleado empleado = new Empleado();
    private AdministradorBD conectorBD = new AdministradorBD();
    private BarraMenu menu = new BarraMenu();
    private JMenuBar menuBar = menu.getMenu();

    public GestorEmpleadoss() {
        initComponents();
        setearImagenes(icon_Label, "/Abcs/empleado.png");
        this.setJMenuBar(menuBar);
        conectorBD.conectar();

        // setearImagenes(boton_BuscarId,"/Abcs/gato.png");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_BuscarId = new javax.swing.JButton();
        boton_BuscarNombre = new javax.swing.JButton();
        boton_Modificar = new javax.swing.JButton();
        boton_Eliminar = new javax.swing.JButton();
        boton_Agregar = new javax.swing.JButton();
        boton_Limpiar = new javax.swing.JButton();
        boton_Menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sexo_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        puesto_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        supervisor_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edad_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono_TextField = new javax.swing.JTextField();
        correo_TextField = new javax.swing.JTextField();
        icon_Label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nacionalidad_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        estado_TextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salario_TextField = new javax.swing.JTextField();
        boton_Pruebas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boton_BuscarId.setText("BuscarID");
        boton_BuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarIdActionPerformed(evt);
            }
        });
        jPanel1.add(boton_BuscarId);

        boton_BuscarNombre.setText("BuscarNombre");
        boton_BuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(boton_BuscarNombre);

        boton_Modificar.setText("Modificar");
        boton_Modificar.setToolTipText("");
        boton_Modificar.setActionCommand("modificar");
        boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Modificar);

        boton_Eliminar.setText("Eliminar");
        boton_Eliminar.setActionCommand("borrar_Empleado");
        boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Eliminar);

        boton_Agregar.setText("Agregar");
        boton_Agregar.setActionCommand("botonAgregar");
        boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Agregar);

        boton_Limpiar.setText("Limpiar");
        boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Limpiar);

        boton_Menu.setText("Menu");
        boton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_MenuActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Menu);

        jLabel1.setText("ID:");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        id_TextField.setName(""); // NOI18N
        id_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        nombre_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_TextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero:");

        jLabel4.setText("Puesto:");

        jLabel5.setText("Supervisor:");

        supervisor_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_TextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Edad:");

        jLabel7.setText("Contacto:");

        icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abcs/Jhon.jpg"))); // NOI18N

        jLabel8.setText("Nacionalidad:");

        nacionalidad_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidad_TextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado Civil:");

        estado_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_TextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Salario:");

        boton_Pruebas.setText("Pruebas");
        boton_Pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PruebasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sexo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(edad_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_Pruebas))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(estado_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puesto_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(telefono_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(supervisor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(correo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(nacionalidad_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(salario_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidad_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edad_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_Pruebas)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(puesto_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(telefono_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supervisor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salario_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_TextFieldActionPerformed

    private void nombre_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_TextFieldActionPerformed

    private void supervisor_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supervisor_TextFieldActionPerformed
    //Boton para buscar por Id Empleados
    private void boton_BuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarIdActionPerformed
        try {
            ResultSet rs = conectorBD.hacerBusqueda("Empleados", "id", id_TextField.getText());
            if (rs.next()) {
                nombre_TextField.setText(rs.getString("nombre"));
                nacionalidad_TextField.setText(rs.getString("nacionalidad"));
                int edad = rs.getInt("edad");
                edad_TextField.setText(String.valueOf(edad));
                estado_TextField.setText(rs.getString("estadoCivil"));
                sexo_TextField.setText(rs.getString("genero"));
                puesto_TextField.setText(rs.getString("puesto"));
                supervisor_TextField.setText(rs.getString("supervisor"));
                telefono_TextField.setText(rs.getString("telefono"));
                correo_TextField.setText(rs.getString("correo"));
                salario_TextField.setText(rs.getString("salario"));
                JOptionPane.showMessageDialog(null, "Empleado encontrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado verifique el ID " + ex.toString());
        }

    }//GEN-LAST:event_boton_BuscarIdActionPerformed
    //Boton para agregar empleados
    private void boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AgregarActionPerformed

        // Asignar los valores al objeto empleado
        empleado.setNombre(nombre_TextField.getText());
        empleado.setSexo(sexo_TextField.getText());
        empleado.setNacionalidad(nacionalidad_TextField.getText());
        empleado.setEstadoCivil(estado_TextField.getText());
        empleado.setTelefono(telefono_TextField.getText());
        empleado.setCorreo(correo_TextField.getText());
        empleado.setPuesto(puesto_TextField.getText());
        empleado.setSupervisor(supervisor_TextField.getText());

        // Insertar empleado en la base de datos
        try {
            conectorBD.ejecutarConsulta("INSERT INTO Empleados (id, nombre, edad, genero, nacionalidad, estadoCivil, telefono, correo, puesto, supervisor, salario)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", id_TextField.getText(), empleado.getNombre(), edad_TextField.getText(), empleado.getSexo(), empleado.getNacionalidad(),
                    empleado.getEstadoCivil(), empleado.getTelefono(), empleado.getCorreo(), empleado.getPuesto(), empleado.getSupervisor(), salario_TextField.getText());
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar empleado en la base de datos:\n" + ex.toString());
        }
    }//GEN-LAST:event_boton_AgregarActionPerformed
    //Boton para buscar Por nombres
    private void boton_BuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarNombreActionPerformed
        try {
            ResultSet rs = conectorBD.hacerBusqueda("Empleados", "nombre", nombre_TextField.getText());
            if (rs.next()) {
                int edad = rs.getInt("edad");
                int id = rs.getInt("id");
                id_TextField.setText(String.valueOf(id));
                nombre_TextField.setText(rs.getString("nombre"));
                nacionalidad_TextField.setText(rs.getString("nacionalidad"));
                edad_TextField.setText(String.valueOf(edad));
                estado_TextField.setText(rs.getString("estadoCivil"));
                sexo_TextField.setText(rs.getString("genero"));
                puesto_TextField.setText(rs.getString("puesto"));
                supervisor_TextField.setText(rs.getString("supervisor"));
                telefono_TextField.setText(rs.getString("telefono"));
                correo_TextField.setText(rs.getString("correo"));
                salario_TextField.setText(rs.getString("salario"));
                JOptionPane.showMessageDialog(null, "Empleado encontrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado verifique el ID " + ex.toString());
        }
    }//GEN-LAST:event_boton_BuscarNombreActionPerformed
    //Boton para modificar 
    private void boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ModificarActionPerformed
        // TODO add your handling code here:
        String consulta = "UPDATE Empleados SET nombre = ?, edad = ?, genero = ?, nacionalidad = ?, estadoCivil = ?,"
                + " telefono = ?, correo = ?, puesto = ?, supervisor = ?, salario = ? WHERE id = ?";

        try {
            conectorBD.ejecutarConsulta(consulta, nombre_TextField.getText(), edad_TextField.getText(), sexo_TextField.getText(), nacionalidad_TextField.getText(),
                    estado_TextField.getText(), telefono_TextField.getText(), correo_TextField.getText(), puesto_TextField.getText(), supervisor_TextField.getText(), salario_TextField.getText());
            JOptionPane.showMessageDialog(null, "Empleado Modificado Exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_boton_ModificarActionPerformed
    //Boton para Eliminar Empleados
    private void boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliminarActionPerformed
        String consulta = "DELETE FROM Empleados WHERE id = ?";
        try {
            conectorBD.ejecutarConsulta(consulta, id_TextField.getText());
            JOptionPane.showMessageDialog(null, "Se ha eliminado el empleado con exito");
        } catch (SQLException ex) {
            Logger.getLogger(GestorEmpleadoss.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Boton Eliminar");    }//GEN-LAST:event_boton_EliminarActionPerformed

    private void nacionalidad_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidad_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidad_TextFieldActionPerformed

    private void estado_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_TextFieldActionPerformed

    private void boton_PruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PruebasActionPerformed
        // TODO add your handling code here
        nombre_TextField.setText("Jose alberto fierro");
        nacionalidad_TextField.setText("Mexicano");
        id_TextField.setText("23");
        edad_TextField.setText("22");
        estado_TextField.setText("Casado");
        sexo_TextField.setText("M");
        puesto_TextField.setText("Patron");
        supervisor_TextField.setText("Figueroa");
        telefono_TextField.setText("6688851556");
        correo_TextField.setText("jossue.avll@gmail.com");
        salario_TextField.setText("2100");
    }//GEN-LAST:event_boton_PruebasActionPerformed

    private void boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_LimpiarActionPerformed
        // TODO add your handling code here:
        conectorBD.vaciarCampos(nombre_TextField, edad_TextField, sexo_TextField, telefono_TextField,
                correo_TextField, edad_TextField, salario_TextField, supervisor_TextField, salario_TextField, id_TextField,
                nacionalidad_TextField, estado_TextField, puesto_TextField);
    }//GEN-LAST:event_boton_LimpiarActionPerformed

    private void boton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_MenuActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_boton_MenuActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorEmpleadoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorEmpleadoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorEmpleadoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorEmpleadoss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorEmpleadoss().setVisible(true);

            }
        });
    }

    public void setearImagenes(JLabel label, String ruta) {
        ImageIcon image = new ImageIcon(getClass().getResource(ruta));
        int width = label.getWidth();
        int height = label.getHeight();
        Image scaledImage = image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        label.setIcon(scaledIcon);
    }

    public void setearImagenes(JButton boton, String ruta) {
        ImageIcon image = new ImageIcon(getClass().getResource(ruta));
        int width = boton.getWidth();
        int height = boton.getHeight();
        Image scaledImage = image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        boton.setIcon(scaledIcon);
    }

    public void agregarEmpleado(String nombre, String sexo, String nacionalidad, String estadoCivil, String telefono, String correo,
            int numero_Empleado, float salario, String cargo, String puesto, String supervisor) {

    }

    public void eliminarEmpleado(String nombre, String sexo, String nacionalidad, String estadoCivil, String telefono, String correo,
            int numero_Empleado, float salario, String cargo, String puesto, String supervisor) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Agregar;
    private javax.swing.JButton boton_BuscarId;
    private javax.swing.JButton boton_BuscarNombre;
    private javax.swing.JButton boton_Eliminar;
    private javax.swing.JButton boton_Limpiar;
    private javax.swing.JButton boton_Menu;
    private javax.swing.JButton boton_Modificar;
    private javax.swing.JButton boton_Pruebas;
    private javax.swing.JTextField correo_TextField;
    private javax.swing.JTextField edad_TextField;
    private javax.swing.JTextField estado_TextField;
    private javax.swing.JLabel icon_Label;
    private javax.swing.JTextField id_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nacionalidad_TextField;
    private javax.swing.JTextField nombre_TextField;
    private javax.swing.JTextField puesto_TextField;
    private javax.swing.JTextField salario_TextField;
    private javax.swing.JTextField sexo_TextField;
    private javax.swing.JTextField supervisor_TextField;
    private javax.swing.JTextField telefono_TextField;
    // End of variables declaration//GEN-END:variables
}
