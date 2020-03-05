package Pantallas;

import Clases.BDDetalle_Orden;
import Clases.BDEstado_Detalle_Orden;
import Clases.BDOrden_Servicio;
import Clases.BDPrenda;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla donde se realizaran las acciones para la tabla "Detalle_Orden"
 *
 * @author Kendall
 */
public class Detalle extends javax.swing.JFrame {

    BDDetalle_Orden detOrd = new BDDetalle_Orden();
    String id = "";

    //Inicializacion de los componentes, con los combobox ya cargados y el boton guardar deshabilitado
    public Detalle() {
        initComponents();
        this.setLocationRelativeTo(null);
        BDOrden_Servicio.obtenerOrdenServicio(cboOrden);
        BDPrenda.obtenerListaPrendas(cboPrenda);
        BDEstado_Detalle_Orden.obtenerListaEstados(cboEstado);
        btnGuardar.setEnabled(false);
    }

    //Metodo para limpiar las cajas una vez terminados los procedimientos
    private void limpiarCajas() {
        cboEstado.setSelectedIndex(0);
        cboOrden.setSelectedIndex(0);
        cboPrenda.setSelectedIndex(0);
        txtObservacion.setText("");
    }

    //Metodo para validar los campos vacios antes de volver a habilitar el boton guardar
    public void validaCampos() {
        if (cboEstado.getSelectedIndex() == 0 || cboOrden.getSelectedIndex() == 0
                || cboPrenda.getSelectedIndex() == 0 || txtObservacion.getText().isEmpty()) {
            btnGuardar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboOrden = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboPrenda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        Detalle = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cboFiltro = new javax.swing.JComboBox<>();
        txtValorBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Detalle");

        jLabel3.setText("Orden: ");

        cboOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboOrdenKeyReleased(evt);
            }
        });

        jLabel4.setText("Prenda: ");

        cboPrenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPrenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboPrendaKeyReleased(evt);
            }
        });

        jLabel5.setText("Estado: ");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboEstadoKeyReleased(evt);
            }
        });

        Detalle.setText("Observacion: ");

        txtObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtObservacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionKeyTyped(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Orden", "Prenda", "Estado", "Observacion"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jLabel6.setText("Buscar por: ");

        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orden", "Prenda", "Estado" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Detalle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEstado, 0, 131, Short.MAX_VALUE)
                                    .addComponent(txtObservacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboPrenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar)
                        .addGap(54, 54, 54)
                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnGuardar)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(104, 104, 104)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVer))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Detalle)
                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(52, 52, 52)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Implementa el boton guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int exito = 0;

        exito = detOrd.insertar(cboOrden.getSelectedIndex(), cboPrenda.getSelectedIndex(), cboEstado.getSelectedIndex(), txtObservacion.getText());

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Detalle guardado exitosamente", "Accion terminada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Implementa el boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        detOrd.buscar(txtValorBusqueda.getText(), cboFiltro.getSelectedItem().toString(), tblDatos);
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
                int orden = Integer.parseInt((String) modelotabla.getValueAt(filasel, 1));
                int prenda = Integer.parseInt((String) modelotabla.getValueAt(filasel, 2));
                int estado = Integer.parseInt((String) modelotabla.getValueAt(filasel, 3));
                String obs = (String) modelotabla.getValueAt(filasel, 4);

                id = codigo;
                cboOrden.setSelectedIndex(orden);
                cboPrenda.setSelectedIndex(prenda);
                cboEstado.setSelectedIndex(estado);
                txtObservacion.setText(obs);

            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e + "\nIntentelo nuevamente", "Error en la operacion", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    //Implementa el boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (id.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No hay datos para modificar", "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        } else {
            detOrd.modificar(cboOrden.getSelectedIndex(), cboPrenda.getSelectedIndex(), cboEstado.getSelectedIndex(), txtObservacion.getText(), id);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    //Implementa el boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        detOrd.eliminar(id);

        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Implementa el boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Validacion de campos de texto
    private void txtObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyTyped
        int largo = 20;

        if (txtObservacion.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtObservacionKeyTyped

    //Valida que los campos no esten vacios
    private void cboOrdenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboOrdenKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboOrdenKeyReleased

    private void cboPrendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboPrendaKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboPrendaKeyReleased

    private void cboEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEstadoKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboEstadoKeyReleased

    private void txtObservacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtObservacionKeyReleased

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
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Detalle;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JComboBox<String> cboOrden;
    private javax.swing.JComboBox<String> cboPrenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtValorBusqueda;
    // End of variables declaration//GEN-END:variables
}
