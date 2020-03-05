package Pantallas;

import Clases.BDBoleta;
import Clases.BDMetodoPago;
import Clases.BDOrden_Servicio;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla donde se ejecutaran las acciones para la tabla "Boleta"
 * @author Kendall
 */
public class Boleta extends javax.swing.JFrame {

    BDBoleta boleta = new BDBoleta();
    String id = "";

    //Inicializacion de los componentes con los combobox previamente cargados, y un campo de texto desactivado 
    public Boleta() {
        initComponents();
        this.setLocationRelativeTo(null);
        BDOrden_Servicio.obtenerOrdenServicio(cboOrden);
        BDMetodoPago.obtenerListaMetodos(cboMedioPago);
        txtIva.disable();
        
    }

    //Metodo para limpiar las cajas una vez ejecutados los procedimientos
    private void limpiarCajas() {
        cboMedioPago.setSelectedIndex(0);
        cboOrden.setSelectedIndex(0);
        txtNeto.setText("");
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNeto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboMedioPago = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboOrden = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Boleta");

        jLabel2.setText("Monto Neto: ");

        txtNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNetoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNetoKeyTyped(evt);
            }
        });

        jLabel3.setText("Iva: ");

        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIvaKeyReleased(evt);
            }
        });

        jLabel5.setText("Medio de Pago:");

        cboMedioPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboMedioPagoKeyReleased(evt);
            }
        });

        jLabel6.setText("Orden: ");

        cboOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboOrdenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboOrdenKeyTyped(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Orden", "Neto", "Iva", "Medio Pago"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNeto)
                            .addComponent(txtIva)
                            .addComponent(cboMedioPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboOrden, 0, 78, Short.MAX_VALUE))))
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(66, 66, 66)
                        .addComponent(btnVer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnGuardar)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(86, 86, 86)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(60, 60, 60)
                .addComponent(btnSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Implementa el boton guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int exito = 0;

        double iva = Integer.parseInt(txtNeto.getText()) * 0.19;

        exito = boleta.insertar(cboOrden.getSelectedIndex(), Integer.parseInt(txtNeto.getText()), iva, cboMedioPago.getSelectedIndex());

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Boleta guardada exitosamente", "Accion terminada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        limpiarCajas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Implementa el boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boleta.buscar(tblTabla);
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Implementa el boton ver
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        int filasel;

        try {

            filasel = tblTabla.getSelectedRow();

            if (filasel == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro");

            } else {

                DefaultTableModel modelotabla = (DefaultTableModel) tblTabla.getModel();

                String codigo = (String) modelotabla.getValueAt(filasel, 0);
                int orden = Integer.parseInt((String) modelotabla.getValueAt(filasel, 1));
                String neto = (String) modelotabla.getValueAt(filasel, 2);
                String iva = (String) modelotabla.getValueAt(filasel, 3);
                int medio = Integer.parseInt((String) modelotabla.getValueAt(filasel, 4));

                id = codigo;
                cboOrden.setSelectedIndex(orden);
                txtNeto.setText(neto);
                txtIva.setText(iva);
                cboMedioPago.setSelectedIndex(medio);

            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e + "\nIntentelo nuevamente", "Error en la operacion", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    //Implementa el boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        double iva = Integer.parseInt(txtNeto.getText()) * 0.19;

        if (id.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No hay datos para modificar", "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        } else {
            boleta.modificar(cboOrden.getSelectedIndex(), Integer.parseInt(txtNeto.getText()), iva, cboMedioPago.getSelectedIndex(), id);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    //Implementa el boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boleta.eliminar(id);
        
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed
 
    //Implementa el boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Valida campos de texto
    private void txtNetoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetoKeyTyped
        char c = evt.getKeyChar(); //Validacion solo numeros

        if (c < '0' || c > '9') {
            evt.consume();
        }

        int largo = 11;

        if (txtNeto.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNetoKeyTyped

    private void cboOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboOrdenKeyTyped
       
    }//GEN-LAST:event_cboOrdenKeyTyped

    private void txtNetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetoKeyReleased
        
    }//GEN-LAST:event_txtNetoKeyReleased

    private void cboMedioPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboMedioPagoKeyReleased
;
    }//GEN-LAST:event_cboMedioPagoKeyReleased

    private void cboOrdenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboOrdenKeyReleased

    }//GEN-LAST:event_cboOrdenKeyReleased

    private void txtIvaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyReleased
       
    }//GEN-LAST:event_txtIvaKeyReleased

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
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleta().setVisible(true);
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
    private javax.swing.JComboBox<String> cboMedioPago;
    private javax.swing.JComboBox<String> cboOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNeto;
    // End of variables declaration//GEN-END:variables
}
