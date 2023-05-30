/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Abcs;
import java.awt.List;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author jossu
 */
public class Biblioteca extends javax.swing.JFrame {
    private Libro libro = new Libro();
    private AdministradorBD conectorBD =  new AdministradorBD();
    private BarraMenu menu = new BarraMenu();
    private JMenuBar menuBar = menu.getMenu();
    public Biblioteca() {
        initComponents();
        this.setJMenuBar(menuBar);
        conectorBD.conectar();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        titulo_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        autor_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editorial_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fecha_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        generos_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paginas_TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsis_TextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_Anterior = new javax.swing.JButton();
        boton_Siguiente = new javax.swing.JButton();
        boton_Buscar = new javax.swing.JButton();
        boton_Agregar = new javax.swing.JButton();
        boton_Modificar = new javax.swing.JButton();
        boton_Eliminar = new javax.swing.JButton();
        boton_Regresar = new javax.swing.JButton();
        boton_Pruebas = new javax.swing.JButton();
        boton_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo:");

        codigo_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Editorial");

        jLabel5.setText("Fecha de Lanzamiento");

        jLabel6.setText("Generos");

        jLabel7.setText("Paginas");

        sinopsis_TextArea.setColumns(20);
        sinopsis_TextArea.setRows(5);
        jScrollPane1.setViewportView(sinopsis_TextArea);

        jLabel8.setText("Sinopsis");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boton_Anterior.setText("<--Anterior");
        jPanel1.add(boton_Anterior);

        boton_Siguiente.setText("Siguiente-->");
        jPanel1.add(boton_Siguiente);

        boton_Buscar.setText("Buscar");
        boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Buscar);

        boton_Agregar.setText("Agregar");
        boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Agregar);

        boton_Modificar.setText("Modificiar");
        boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Modificar);

        boton_Eliminar.setText("Eliminar");
        boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Eliminar);

        boton_Regresar.setText("Regresar");
        jPanel1.add(boton_Regresar);

        boton_Pruebas.setText("Pruebas");
        boton_Pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PruebasActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Pruebas);

        boton_Limpiar.setText("Limpiar");
        boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(codigo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(boton_Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(titulo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(editorial_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(generos_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(autor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(fecha_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(paginas_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(codigo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_Limpiar)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(titulo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(editorial_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(generos_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(autor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(fecha_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(paginas_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AgregarActionPerformed
        // TODO add your handling code here:
        String consulta = "INSERT INTO Biblioteca (id,titulo,autor,editorial,generos,fecha,sinopsis,paginas)"+
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        int paginas = Integer.valueOf(paginas_TextField.getText());
        libro.setTitulo(titulo_TextField.getText()); 
        libro.setAutor(autor_TextField.getText());
        libro.setEditorial(editorial_TextField.getText());
        libro.setCodigo_Id(codigo_TextField.getText());
        libro.setGeneros(generos_TextField.getText());
        libro.setSinopsis(sinopsis_TextArea.getText());
        libro.setFecha_Lanzamiento(fecha_TextField.getText());
        libro.setPaginas(paginas);
        try {
            conectorBD.ejecutarConsulta(consulta,libro.getCodigo_Id(),libro.getTitulo(),libro.getAutor(),libro.getEditorial(),libro.getGeneros(),libro.getFecha_Lanzamiento(),
                    libro.getSinopsis(),libro.getPaginas());
            JOptionPane.showMessageDialog(null, "Libro Agregado Con Exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

      
    }//GEN-LAST:event_boton_AgregarActionPerformed

    private void boton_PruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PruebasActionPerformed
        // TODO add your handling code here:
       codigo_TextField.setText("1");
        autor_TextField.setText("Joe Shreiber");
        titulo_TextField.setText("Star Wars The Mandalorian");
        fecha_TextField.setText("17/02/2021");
        editorial_TextField.setText("Disney");
        generos_TextField.setText("Accion, Aventura, Drama, Suspenso");
        paginas_TextField.setText("226");
        sinopsis_TextArea.setText("Tras la caída del Imperio, y antes del surgimiento de la Primera Orden, un cazarrecompensas solitario conocido como el Mandaloriano viaja por el borde exterior de la galaxia. Cuando descubre que su nuevo objetivo es un bebé, el Mandaloriano decide proteger al Niño a toda costa.");
    }//GEN-LAST:event_boton_PruebasActionPerformed

    private void codigo_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_TextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_codigo_TextFieldActionPerformed
// TODO add your handling code here:
    private void boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ModificarActionPerformed
        if(codigo_TextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo del libro que desea modificar");
        }else{
            try (
                ResultSet rs = conectorBD.hacerBusqueda("Biblioteca", "id", codigo_TextField.getText())) {
                    if(rs.next()){
                        int paginas = rs.getInt("paginas");
                        codigo_TextField.setText(rs.getString("id"));
                        titulo_TextField.setText(rs.getString("titulo"));
                        autor_TextField.setText(rs.getString("autor"));
                        fecha_TextField.setText(rs.getString("fecha"));
                        generos_TextField.setText(rs.getString("generos"));
                        sinopsis_TextArea.setText(rs.getString("sinopsis"));
                        paginas_TextField.setText(String.valueOf(paginas));
                        String consulta = "UPDATE Biblioteca SET titulo = ?, autor = ?,editorial = ?, generos = ?, fecha = ?, sinopsis = ?, paginas = ?"
                        + " WHERE id = ?";
                        try {
                            conectorBD.ejecutarConsulta(consulta,titulo_TextField.getText(),autor_TextField.getText(),editorial_TextField.getText(),generos_TextField.getText(),fecha_TextField.getText(),sinopsis_TextArea.getText(),paginas_TextField.getText(),codigo_TextField.getText());
                            JOptionPane.showMessageDialog(null, "Libro Modificado Con Exito");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex.toString());
                        }
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

}
//GEN-LAST:event_boton_ModificarActionPerformed

    private void boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliminarActionPerformed
        // TODO add your handling code here:
        String consulta = "DELETE FROM Biblioteca WHERE id = ?";
        try {
            conectorBD.ejecutarConsulta(consulta, codigo_TextField.getText());
            JOptionPane.showMessageDialog(null,"Se ha eliminado el libro de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_boton_EliminarActionPerformed

    private void boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarActionPerformed
        try {
            // TODO add your handling code here:
            ResultSet rs = conectorBD.hacerBusqueda("Biblioteca", "id", codigo_TextField.getText());
            if(rs.next()){
                int paginas = rs.getInt("paginas");
                codigo_TextField.setText(rs.getString("id"));
                titulo_TextField.setText(rs.getString("titulo"));
                autor_TextField.setText(rs.getString("autor"));
                fecha_TextField.setText(rs.getString("fecha"));
                generos_TextField.setText(rs.getString("generos"));
                sinopsis_TextArea.setText(rs.getString("sinopsis"));
                paginas_TextField.setText(String.valueOf(paginas));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL LIBRO VERIFIQUE EL ID" + ex.toString());
        }
        
    }//GEN-LAST:event_boton_BuscarActionPerformed

    private void boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_LimpiarActionPerformed
        // TODO add your handling code here:
        conectorBD.vaciarCampos(codigo_TextField, titulo_TextField, autor_TextField, fecha_TextField, editorial_TextField, generos_TextField, paginas_TextField);
        sinopsis_TextArea.setText(null);
    }//GEN-LAST:event_boton_LimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor_TextField;
    private javax.swing.JButton boton_Agregar;
    private javax.swing.JButton boton_Anterior;
    private javax.swing.JButton boton_Buscar;
    private javax.swing.JButton boton_Eliminar;
    private javax.swing.JButton boton_Limpiar;
    private javax.swing.JButton boton_Modificar;
    private javax.swing.JButton boton_Pruebas;
    private javax.swing.JButton boton_Regresar;
    private javax.swing.JButton boton_Siguiente;
    private javax.swing.JTextField codigo_TextField;
    private javax.swing.JTextField editorial_TextField;
    private javax.swing.JTextField fecha_TextField;
    private javax.swing.JTextField generos_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField paginas_TextField;
    private javax.swing.JTextArea sinopsis_TextArea;
    private javax.swing.JTextField titulo_TextField;
    // End of variables declaration//GEN-END:variables
}
