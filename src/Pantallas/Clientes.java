package Pantallas;

import Clases.BDCliente;
import Clases.BDSucursal;
import Clases.BDVendedor;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pantalla donde se realizaran las acciones para la tabla "Clientes"
 *
 * @author Leica
 */
public class Clientes extends javax.swing.JFrame {

    BDCliente cliente = new BDCliente();
    String id = "";

    //Inicializacion de los componentes, con los combobox ya cargados y el boton agregar deshabilitado
    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        BDSucursal.obtenerListaSucursales(cboSucursal);
        btnAgregarVend.setEnabled(false);
    }

    //Metodo para limpiar las cajas una vez terminados los procedimientos
    private void limpiarCajas() {
        txtRut.setText("");
        txtRutVerif.setText("");
        txtNombre.setText("");
        txtApePat.setText("");
        txtApeMat.setText("");
        cboSucursal.setSelectedIndex(0);
        txtCorreo.setText("");
        txtTelefono.setText("");
    }

    //Metodo para validar los campos antes de volver a habilitar el boton "Agregar"
    public void validaCampos() {

        if (txtRut.getText().isEmpty()
                || txtRutVerif.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtApePat.getText().isEmpty() || txtApeMat.getText().isEmpty()
                || cboSucursal.getSelectedIndex() == 0 || txtTelefono.getText().isEmpty()
                || txtCorreo.getText().isEmpty()) {
            btnAgregarVend.setEnabled(false);

        } else {
            btnAgregarVend.setEnabled(true);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtRutVerif = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApePat = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblCboSuc = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnAgregarVend = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblApePat = new javax.swing.JLabel();
        lblApeMat = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cboSucursal = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        cboFiltro = new javax.swing.JComboBox<>();
        txtValorBusqueda = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Clientes");

        lblRut.setText("Rut: ");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });

        txtRutVerif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutVerifKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutVerifKeyTyped(evt);
            }
        });

        lblNombre.setText("Nombre: ");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApePat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApePatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApePatKeyTyped(evt);
            }
        });

        txtApeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeMatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeMatKeyTyped(evt);
            }
        });

        jLabel8.setText("-");

        lblCboSuc.setText("Sucursal: ");

        lblCorreo.setText("Correo:");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        btnAgregarVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnAgregarVend.setText("Agregar");
        btnAgregarVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVendActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblApePat.setText("Apellido Paterno:");

        lblApeMat.setText("Apellido Materno: ");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboSucursalKeyReleased(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Rut", "Verificador", "Nombre", "Apellido Paterno", "Apellido Materno", "Sucursal", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        lblBuscar.setText("Buscar por: ");

        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres", "Sucursal" }));
        cboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoom.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTelefono.setText("Telefono: ");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnAgregarVend)
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(166, 166, 166)
                .addComponent(btnEliminar)
                .addGap(0, 210, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCboSuc)
                            .addComponent(lblCorreo)
                            .addComponent(lblApePat)
                            .addComponent(lblApeMat)
                            .addComponent(lblRut)
                            .addComponent(lblTelefono))
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRutVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(30, 30, 30)
                        .addComponent(btnVer)
                        .addGap(147, 147, 147))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApeMat, txtApePat, txtCorreo, txtNombre, txtRut});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtRutVerif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApePat)
                            .addComponent(txtApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscar)
                            .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnVer))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeMat)
                    .addComponent(txtApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCboSuc)
                    .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVend)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(49, 49, 49)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    //Implementa el boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Implementa el boton agregar
    private void btnAgregarVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVendActionPerformed
        int exito = 0;

        exito = cliente.insertar(Integer.parseInt(txtRut.getText()), Integer.parseInt(txtRutVerif.getText()), txtNombre.getText(), txtApePat.getText(), txtApeMat.getText(),
                cboSucursal.getSelectedIndex(), Integer.parseInt(txtTelefono.getText()), txtCorreo.getText());

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente", "Accion terminada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnAgregarVendActionPerformed

    private void cboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboFiltroActionPerformed

    //Implementa el boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cliente.buscar(txtValorBusqueda.getText(), cboFiltro.getSelectedItem().toString(), tblDatos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Implementa el boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos para modificar.\n"
                    + "Por favor seleccione un registro de la tabla", "Error en la operacion", JOptionPane.ERROR_MESSAGE);
        } else {
            cliente.modificar(txtRut.getText(), txtRutVerif.getText(), txtNombre.getText(), txtApePat.getText(), txtApeMat.getText(), cboSucursal.getSelectedIndex(),
                    txtTelefono.getText(), txtCorreo.getText(), id);
        }

        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

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
                String rut = (String) modelotabla.getValueAt(filasel, 1);
                String rutVer = (String) modelotabla.getValueAt(filasel, 2);
                String nombre = (String) modelotabla.getValueAt(filasel, 3);
                String apePat = (String) modelotabla.getValueAt(filasel, 4);
                String apeMat = (String) modelotabla.getValueAt(filasel, 5);
                int suc = Integer.parseInt((String) modelotabla.getValueAt(filasel, 6));
                String telefono = (String) modelotabla.getValueAt(filasel, 7);
                String correo = (String) modelotabla.getValueAt(filasel, 8);

                id = codigo;
                txtRut.setText(rut);
                txtRutVerif.setText(rutVer);
                txtNombre.setText(nombre);
                txtApePat.setText(apePat);
                txtApeMat.setText(apeMat);
                cboSucursal.setSelectedIndex(suc);
                txtTelefono.setText(telefono);
                txtCorreo.setText(correo);
            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e + "\nIntentelo nuevamente", "Error en la operacion", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    //Implementa el boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cliente.eliminar(id);

        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    //Metodo para validar campos
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        char c = evt.getKeyChar(); //Validacion solo numeros

        if (c < '0' || c > '9') {
            evt.consume();
        }

        int largo = 7;

        if (txtRut.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtRutVerifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutVerifKeyTyped
        char c = evt.getKeyChar(); //Validacion solo numeros

        if (c < '0' || c > '9') {
            evt.consume();
        }

        int largo = 1;

        if (txtRutVerif.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRutVerifKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int largo = 20;

        if (txtNombre.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApePatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePatKeyTyped
        int largo = 20;

        if (txtNombre.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApePatKeyTyped

    private void txtApeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeMatKeyTyped
        int largo = 20;

        if (txtNombre.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApeMatKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar(); //Validacion solo numeros

        if (c < '0' || c > '9') {
            evt.consume();
        }

        int largo = 9;

        if (txtTelefono.getText().length() > largo) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        int largo = 100;

        if (txtCorreo.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Limite de caracteres Excedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    //Ejecuta Metodo para validar campos vacios
    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtRutKeyReleased

    private void txtRutVerifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutVerifKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtRutVerifKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApePatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePatKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtApePatKeyReleased

    private void txtApeMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeMatKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtApeMatKeyReleased

    private void cboSucursalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSucursalKeyReleased
        validaCampos();
    }//GEN-LAST:event_cboSucursalKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validaCampos();
    }//GEN-LAST:event_txtCorreoKeyReleased

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVend;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApeMat;
    private javax.swing.JLabel lblApePat;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCboSuc;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtRutVerif;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValorBusqueda;
    // End of variables declaration//GEN-END:variables
}
