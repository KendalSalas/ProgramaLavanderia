package Pantallas;

import Clases.BDCiudad;
import Clases.BDComuna;
import Clases.BDRegiones;
import Clases.BDSucursal;
import Clases.Sucursal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import static javafx.beans.binding.Bindings.length;
import javax.swing.Action;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla donde se realizaran las acciones a la tabla SUCURSAL
 *
 * @author Kendall
 */
public class RegistroSucursal extends javax.swing.JFrame {

    BDSucursal bdSuc = new BDSucursal();
    String idsuc = "";

    //Metodo para limpiar las cajas una vez ejecutados los procedimientos
    private void limpiarCajas() {
        cboRegion.setSelectedIndex(0);
        cboComuna.setSelectedIndex(0);
        cboCiudad.setSelectedIndex(0);
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtBuscarId.setText("");
        txtTelefono.setText("");
    }

    public RegistroSucursal() {
        /**
         * Inicializacion de componentes, con los combobox ya cargadados con
         * datos de nuestra base de datos
         */

        initComponents();
        this.setLocationRelativeTo(null);
        BDRegiones.obtenerListaRegiones(cboRegion);
        BDCiudad.obtenerListaCiudades(cboCiudad);
        BDComuna.obtenerListaComunas(cboComuna);
        btnAgregar.setEnabled(false);

    }

    /**
     * Metodo que desactiva el boton "Agregar" hasta que esten todos los campos
     * llenos
     */
    public void validaCampos() {

        if (txtDireccion.getText().isEmpty()
                || txtCorreo.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || cboRegion.getSelectedIndex() == 0 || cboCiudad.getSelectedIndex() == 0
                || cboComuna.getSelectedIndex() == 0 || lblValCor.getText().equals("*Correo Invalido")) {
            btnAgregar.setEnabled(false);

        } else {
            btnAgregar.setEnabled(true);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        lblRegion = new javax.swing.JLabel();
        lblAgregarSucursal = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        cboRegion = new javax.swing.JComboBox<>();
        cboCiudad = new javax.swing.JComboBox<>();
        lblComuna = new javax.swing.JLabel();
        cboComuna = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblBuscarId = new javax.swing.JLabel();
        txtBuscarId = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblValDir = new javax.swing.JLabel();
        lblValCor = new javax.swing.JLabel();
        lblValTel = new javax.swing.JLabel();
        lblValCboReg = new javax.swing.JLabel();
        lblValCboCiu = new javax.swing.JLabel();
        lblValCboCom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblRegion.setText("Region: ");

        lblAgregarSucursal.setText("Agregar Sucursal");

        lblCiudad.setText("Ciudad: ");

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoom.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        cboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboRegion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboRegionKeyReleased(evt);
            }
        });

        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCiudadActionPerformed(evt);
            }
        });
        cboCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboCiudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboCiudadKeyTyped(evt);
            }
        });

        lblComuna.setText("Comuna:");

        cboComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboComunaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboComunaKeyTyped(evt);
            }
        });

        lblDireccion.setText("Direccion: ");

        lblCorreo.setText("Correo:");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sucursal", "Comuna", "Direccion", "Correo", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        lblBuscarId.setText("Buscar Id: ");

        lblTelefono.setText("Telefono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lblValDir.setForeground(new java.awt.Color(255, 0, 51));

        lblValCor.setForeground(new java.awt.Color(255, 0, 51));

        lblValTel.setForeground(new java.awt.Color(255, 0, 51));

        lblValCboReg.setForeground(new java.awt.Color(255, 0, 51));

        lblValCboCiu.setForeground(new java.awt.Color(255, 0, 0));

        lblValCboCom.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComuna)
                            .addComponent(lblRegion)
                            .addComponent(lblCiudad))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo)
                            .addComponent(lblDireccion)
                            .addComponent(lblTelefono))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscarId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnBuscar)
                        .addGap(45, 45, 45)
                        .addComponent(btnVer))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValDir)
                                    .addComponent(btnAgregar)
                                    .addComponent(lblValCboReg)
                                    .addComponent(lblValCboCiu)
                                    .addComponent(lblValCboCom))
                                .addGap(92, 92, 92)
                                .addComponent(btnModificar)
                                .addGap(117, 117, 117)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValTel)
                                    .addComponent(lblValCor))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregarSucursal)
                .addGap(448, 448, 448))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarSucursal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscarId)
                            .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnVer))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegion)
                            .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValCboReg))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCiudad)
                            .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValCboCiu))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblComuna)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValCboCom)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValDir))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValCor))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValTel))
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(55, 55, 55)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Se implementa boton guardar
     *
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Se implementa el metodo Insertar al boton Aregar

        try {
            //Obtiene los datos por el usuario para luego agregarlos a la tabla

            int id_com = cboComuna.getSelectedIndex();
            String direccion = txtDireccion.getText();
            String correo = txtCorreo.getText();
            int telefono = Integer.parseInt(txtTelefono.getText());
            BDSucursal.insertar(id_com, direccion, correo, telefono);

        } catch (Exception e) {
            System.err.println("Excepción al guardar : " + e);
        }
        //Ejecuta el metodo "limpiar cajas" para que los campos esten vacios
        limpiarCajas();

    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Se implementa el boton "Salir" para cerrar la ventana actual
     *
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Boton para Cerrar la ventana sin cerrar la aplicacion
        dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Valida el campo de texto segun corresponda
     */
    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        //Valida que el campo "Direccion" no exceda el largo permitido de 20 caracteres
        char c = evt.getKeyChar();
        int largo = 20;

        if (txtDireccion.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    //Implementa el boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Agrega el metodo "Buscar" de la base de datos, recibiendo un "ID" y ademas cargando los datos correspondientes a ese registro a una tabla
        bdSuc.buscar(Integer.parseInt(txtBuscarId.getText()), tblDatos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Implementa el boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Implementa el metodo Modificar, recibiendo los datos correspondientes para su ejecucion
        if (idsuc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos para modificar", "Error en la operación", JOptionPane.ERROR_MESSAGE);
        } else {
            bdSuc.modificar(cboComuna.getSelectedIndex(), txtDireccion.getText(), txtCorreo.getText(), Integer.parseInt(txtTelefono.getText()), idsuc);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    //Implementa el boton "Eliminar"
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Implementa el metodo eliminar, recibiendo los datos correspondientes para su ejecución
        if (idsuc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el registro a eliminar", "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        } else {
            bdSuc.eliminar(idsuc);
        }

        limpiarCajas();

    }//GEN-LAST:event_btnEliminarActionPerformed

    //Implementa el boton ver
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        //Permite ver los registros de la base de datos en una tabla
        int filasel;

        try {
            filasel = tblDatos.getSelectedRow();

            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //Agrega los datos correspondientes a sus celdas correspondientes
                DefaultTableModel modelotabla = (DefaultTableModel) tblDatos.getModel();

                String id = (String) modelotabla.getValueAt(filasel, 0);
                int idcom = Integer.parseInt((String) modelotabla.getValueAt(filasel, 1));
                String dir = (String) modelotabla.getValueAt(filasel, 2);
                String corr = (String) modelotabla.getValueAt(filasel, 3);
                String tel = (String) modelotabla.getValueAt(filasel, 4);

                idsuc = id;
                cboComuna.setSelectedIndex(idcom);
                txtDireccion.setText(dir);
                txtCorreo.setText(corr);
                txtTelefono.setText(tel);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    //Valida el campo de texto segun corresponda
    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        int largo = 20;

        if (txtCorreo.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtCorreoKeyTyped

    //Valida el campo de texto segun corresponda
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Valida que el campo "Telefono" solo acepte numeros y que no exceda el largo permitido
        char c = evt.getKeyChar();
        int largo = 10;

        if (txtTelefono.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    //Valida que los campos no esten vacios
    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void cboRegionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboRegionKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboRegionKeyReleased

    private void cboCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCiudadKeyTyped
    }//GEN-LAST:event_cboCiudadKeyTyped

    private void cboComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboComunaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cboComunaKeyTyped

    private void cboCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCiudadKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboCiudadKeyReleased

    private void cboComunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboComunaKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboComunaKeyReleased

    private void cboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCiudadActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroSucursal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroSucursal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroSucursal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroSucursal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JComboBox<String> cboComuna;
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarSucursal;
    private javax.swing.JLabel lblBuscarId;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblComuna;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblValCboCiu;
    private javax.swing.JLabel lblValCboCom;
    private javax.swing.JLabel lblValCboReg;
    private javax.swing.JLabel lblValCor;
    private javax.swing.JLabel lblValDir;
    private javax.swing.JLabel lblValTel;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void JOptionPaneshowMessageDialog(Object object, String se_guardo_la_sucursal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
