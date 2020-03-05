package Pantallas;

import Clases.BDCliente;
import Clases.BDEstado_Orden;
import Clases.BDOrden_Servicio;
import Clases.BDVendedor;
import java.awt.HeadlessException;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla donde se realizaran las acciones a la tabla "Orden_Servicio"
 *
 * @author Kendall
 */
public class Orden_Servicio extends javax.swing.JFrame {

    String id = "";
    BDOrden_Servicio ordSer = new BDOrden_Servicio();

    //Inicializacion de los componentes, con los combobox ya cargados
    public Orden_Servicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        BDVendedor.obtenerListaVendedores(cboVendedor);
        BDCliente.obtenerListaClientes(cboCliente);
        BDEstado_Orden.obtenerListaEstado(cboEstado);

    }

    //Metodo para limpiar las cajas una vez terminados los procedimientos
    private void limpiarCajas() {
        cboEstado.setSelectedIndex(0);
        cboCliente.setSelectedIndex(0);
        cboVendedor.setSelectedIndex(0);
        jdcFechaRec.setDateFormatString("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboVendedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jdcFechaRec = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Orden");

        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });
        cboCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboClienteKeyReleased(evt);
            }
        });

        lblCliente.setText("Cliente: ");

        jLabel2.setText("Vendedor: ");

        cboVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVendedorActionPerformed(evt);
            }
        });
        cboVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboVendedorKeyReleased(evt);
            }
        });

        jLabel3.setText("Estado: ");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboEstadoKeyReleased(evt);
            }
        });

        jLabel4.setText("Fecha Recepcion: ");

        jdcFechaRec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdcFechaRecKeyReleased(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Vendedor", "Estado", "Recepcion", "Entrega"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoom.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(51, 51, 51)
                .addComponent(btnVer)
                .addGap(299, 299, 299))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(lblCliente)
                    .addComponent(jLabel4))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(145, 145, 145)
                                .addComponent(btnEliminar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFechaRec, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVer))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCliente)
                                .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(cboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(64, 64, 64)
                            .addComponent(jLabel4))
                        .addComponent(jdcFechaRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(46, 46, 46)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed

    }//GEN-LAST:event_cboClienteActionPerformed

    private void cboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVendedorActionPerformed

    }//GEN-LAST:event_cboVendedorActionPerformed

    //Implementa el boton guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int exito = 0;

        int anio = jdcFechaRec.getCalendar().get(Calendar.YEAR);
        int mes = jdcFechaRec.getCalendar().get(Calendar.MONTH) + 1;
        int dia = jdcFechaRec.getCalendar().get(Calendar.DAY_OF_MONTH);

        String fecha_rec = dia + "-" + mes + "-" + anio;
        String fecha_dev = dia + 7 + "-" + mes + "-" + anio;

        exito = ordSer.insertar(cboCliente.getSelectedIndex(), cboVendedor.getSelectedIndex(), cboEstado.getSelectedIndex(), fecha_rec, fecha_dev);

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Orden de Servicio guardada exitosamente", "Accion terminada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Implementa el boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ordSer.buscar(tblDatos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Implementa el boton ver
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        int filasel;

        try {

            filasel = tblDatos.getSelectedRow();

            if (filasel == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro");

            } else {

                DefaultTableModel modelotabla = (DefaultTableModel) tblDatos.getModel();

                String codigo = (String) modelotabla.getValueAt(filasel, 0);
                int cliente = Integer.parseInt((String) modelotabla.getValueAt(filasel, 1));
                int vendedor = Integer.parseInt((String) modelotabla.getValueAt(filasel, 2));
                int estado = Integer.parseInt((String) modelotabla.getValueAt(filasel, 3));
                String recepcion = (String) modelotabla.getValueAt(filasel, 4);

                id = codigo;
                cboCliente.setSelectedIndex(cliente);
                cboVendedor.setSelectedIndex(vendedor);
                cboEstado.setSelectedIndex(estado);
                jdcFechaRec.setDateFormatString(recepcion);

            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e + "\nIntentelo nuevamente", "Error en la operacion", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    //Implementa el boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int anio = jdcFechaRec.getCalendar().get(Calendar.YEAR);
        int mes = jdcFechaRec.getCalendar().get(Calendar.MONTH) + 1;
        int dia = jdcFechaRec.getCalendar().get(Calendar.DAY_OF_MONTH);

        String fecha_rec = dia + "-" + mes + "-" + anio;
        String fecha_dev = dia + 7 + "-" + mes + "-" + anio;

        if (id.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No hay datos para modificar", "Error en la operacion", JOptionPane.ERROR_MESSAGE);

        } else {

            ordSer.modificar(cboCliente.getSelectedIndex(), cboVendedor.getSelectedIndex(), cboEstado.getSelectedIndex(), fecha_rec, id);

        }

        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    //Implementa el boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ordSer.eliminar(id);

        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Implementa el boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboClienteKeyReleased

    }//GEN-LAST:event_cboClienteKeyReleased

    private void cboVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboVendedorKeyReleased

    }//GEN-LAST:event_cboVendedorKeyReleased

    private void cboEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEstadoKeyReleased

    }//GEN-LAST:event_cboEstadoKeyReleased

    private void jdcFechaRecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcFechaRecKeyReleased

    }//GEN-LAST:event_jdcFechaRecKeyReleased

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
            java.util.logging.Logger.getLogger(Orden_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orden_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orden_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orden_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orden_Servicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaRec;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
