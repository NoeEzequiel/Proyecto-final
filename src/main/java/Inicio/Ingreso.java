/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Manuel Guererro Morales
 */
public class Ingreso extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Ingreso() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/Imagenes/veterinario.png"));
        Imagenes.imagenEscalada("FondoInicio.png", Fondo);
        this.setCursor(Imagenes.Cursor("cursorClick.png"));
        this.setLocationRelativeTo(null);
        Ingresar.setLocationRelativeTo(this.jPanel1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingresar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Cerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        JLusuario = new javax.swing.JLabel();
        JLcontraseña = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        Ingresar.setLocation(new java.awt.Point(0, 0));
        Ingresar.setModal(true);
        Ingresar.setUndecorated(true);
        Ingresar.setResizable(false);
        Ingresar.setSize(new java.awt.Dimension(310, 237));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Rod", 3, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("entrar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        jLabel4.setText("Contraseña");

        txtusuario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 11)); // NOI18N
        txtusuario.setForeground(java.awt.Color.lightGray);
        txtusuario.setText("nombre de usuario");
        txtusuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 51, 0)));
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });

        JLusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icousuario.png"))); // NOI18N
        JLusuario.setToolTipText("");

        JLcontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icocandado.png"))); // NOI18N

        txtcontraseña.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        txtcontraseña.setForeground(java.awt.Color.lightGray);
        txtcontraseña.setText("jPasswordField1");
        txtcontraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 51, 0)));
        txtcontraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontraseñaFocusLost(evt);
            }
        });
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel2.setText("Ingrese sus datos");

        jLabel3.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(Cerrar)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLcontraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtcontraseña)
                            .addComponent(txtusuario)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusuario)
                    .addComponent(JLusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLcontraseña))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout IngresarLayout = new javax.swing.GroupLayout(Ingresar.getContentPane());
        Ingresar.getContentPane().setLayout(IngresarLayout);
        IngresarLayout.setHorizontalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IngresarLayout.setVerticalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setText("como desea ingresar");

        Entrar.setBackground(new java.awt.Color(0, 153, 204));
        Entrar.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pata.png"))); // NOI18N
        Entrar.setText("Paciente");
        Entrar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "en caso de ser", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Entrar.setCursor(Imagenes.Cursor("cursorAcercar.png"));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarMouseExited(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Creditos.setBackground(new java.awt.Color(0, 153, 204));
        Creditos.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        Creditos.setForeground(new java.awt.Color(255, 255, 255));
        Creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pata.png"))); // NOI18N
        Creditos.setText("Empleado");
        Creditos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "en caso de ser", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Creditos.setCursor(Imagenes.Cursor("cursorAcercar.png"));
        Creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreditosMouseExited(evt);
            }
        });
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creditos)
                    .addComponent(Entrar))
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 349));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseEntered
        Entrar.setBackground(Color.white);
        Entrar.setForeground(Color.black);
    }//GEN-LAST:event_EntrarMouseEntered

    private void EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseExited
        Entrar.setBackground(new Color(0, 153, 204));
        Entrar.setForeground(Color.white);
    }//GEN-LAST:event_EntrarMouseExited

    private void CreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditosMouseEntered

    private void CreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditosMouseExited

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
        txtusuario.setForeground(Color.black);
        //en caso de que se ponga aqui se quitara el texto de nombre de usuario
        if (txtusuario.getText().trim().toLowerCase().equals("nombre de usuario"));
        {
            txtusuario.setText("");

        }
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost

        if (txtusuario.getText().trim().equals("")
                || (txtusuario.getText().trim().toLowerCase().equals("nombre de usuario"))) {
            txtusuario.setForeground(Color.LIGHT_GRAY);
            txtusuario.setText("nombre de usuario");
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtcontraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraseñaFocusGained
        txtcontraseña.setForeground(Color.black);
        //en caso de que se ponga aqui se quitara el texto
        if (txtcontraseña.getText().trim().toLowerCase().equals("contraseña"));
        {
            txtcontraseña.setText("");

        }
    }//GEN-LAST:event_txtcontraseñaFocusGained

    private void txtcontraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraseñaFocusLost

        if (txtcontraseña.getText().trim().equals("")
                || (txtcontraseña.getText().trim().toLowerCase().equals("contraseña"))) {
            txtcontraseña.setForeground(Color.LIGHT_GRAY);
            txtcontraseña.setText("contraseña");
        }
    }//GEN-LAST:event_txtcontraseñaFocusLost

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        Ingresar.setVisible(true);

    }//GEN-LAST:event_CreditosActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        Ingresar.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton Creditos;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JDialog Ingresar;
    private javax.swing.JLabel JLcontraseña;
    private javax.swing.JLabel JLusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
