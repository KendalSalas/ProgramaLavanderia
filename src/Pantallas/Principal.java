/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import javax.swing.JOptionPane;

/**
 *
 * @author Leica
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Principal(Login aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Generar = new javax.swing.JMenuBar();
        jMenuSucursal = new javax.swing.JMenu();
        mSucursales = new javax.swing.JMenuItem();
        MenuVend = new javax.swing.JMenu();
        mVendedores = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        mClientes = new javax.swing.JMenuItem();
        MenuRegistro = new javax.swing.JMenu();
        mRegistro = new javax.swing.JMenuItem();
        jMenuGenerar = new javax.swing.JMenu();
        mBoleta = new javax.swing.JMenuItem();
        mDetalle = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        mISalir = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuSucursal.setText("Sucursal");
        jMenuSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSucursalActionPerformed(evt);
            }
        });

        mSucursales.setText("Mis Sucursales");
        mSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSucursalesActionPerformed(evt);
            }
        });
        jMenuSucursal.add(mSucursales);

        Generar.add(jMenuSucursal);

        MenuVend.setText("Vendedores");

        mVendedores.setText("Mis Vendedores");
        mVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVendedoresActionPerformed(evt);
            }
        });
        MenuVend.add(mVendedores);

        Generar.add(MenuVend);

        MenuClientes.setText("Clientes");

        mClientes.setText("Mis Clientes");
        mClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(mClientes);

        Generar.add(MenuClientes);

        MenuRegistro.setText("Servicio");

        mRegistro.setText("Registrar");
        mRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistroActionPerformed(evt);
            }
        });
        MenuRegistro.add(mRegistro);

        Generar.add(MenuRegistro);

        jMenuGenerar.setText("Generar");

        mBoleta.setText("Boleta");
        mBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBoletaActionPerformed(evt);
            }
        });
        jMenuGenerar.add(mBoleta);

        mDetalle.setText("Detalle");
        mDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDetalleActionPerformed(evt);
            }
        });
        jMenuGenerar.add(mDetalle);

        Generar.add(jMenuGenerar);

        MenuSalir.setText("Salir");

        mISalir.setText("Salir ");
        mISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mISalirActionPerformed(evt);
            }
        });
        MenuSalir.add(mISalir);

        Generar.add(MenuSalir);

        setJMenuBar(Generar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSucursalesActionPerformed
        RegistroSucursal objSuc = new RegistroSucursal();
        objSuc.setVisible(true);
    }//GEN-LAST:event_mSucursalesActionPerformed

    private void jMenuSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSucursalActionPerformed
        
    }//GEN-LAST:event_jMenuSucursalActionPerformed

    private void mVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVendedoresActionPerformed
        Vendedores objVend = new Vendedores();
        objVend.setVisible(true);
    }//GEN-LAST:event_mVendedoresActionPerformed

    private void mClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClientesActionPerformed
        Clientes objCli = new Clientes();
        objCli.setVisible(true);
    }//GEN-LAST:event_mClientesActionPerformed

    private void mRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistroActionPerformed
        Orden_Servicio objOrdSer = new Orden_Servicio();
        objOrdSer.setVisible(true);
    }//GEN-LAST:event_mRegistroActionPerformed

    private void mBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBoletaActionPerformed
        Boleta objBol = new Boleta();
        objBol.setVisible(true);
    }//GEN-LAST:event_mBoletaActionPerformed

    private void mDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDetalleActionPerformed
        Detalle objDet = new Detalle();
        objDet.setVisible(true);
    }//GEN-LAST:event_mDetalleActionPerformed

    private void mISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mISalirActionPerformed
       int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Salir de la aplicacion?");

        if (confirmar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mISalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Generar;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuRegistro;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenu MenuVend;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenuGenerar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jMenuSucursal;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem mBoleta;
    private javax.swing.JMenuItem mClientes;
    private javax.swing.JMenuItem mDetalle;
    private javax.swing.JMenuItem mISalir;
    private javax.swing.JMenuItem mRegistro;
    private javax.swing.JMenuItem mSucursales;
    private javax.swing.JMenuItem mVendedores;
    // End of variables declaration//GEN-END:variables
}
