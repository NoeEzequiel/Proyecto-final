/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import java.awt.*;

/**
 *
 * @author Manuel Guererro Morales
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
            Ingreso in = new Ingreso();

    public Inicio() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/Imagenes/veterinario.png"));
        Imagenes.imagenEscalada("FondoInicio.png", Fondo);
        this.setCursor(Imagenes.Cursor("cursorClick.png"));
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setText("Veterinaria");

        Entrar.setBackground(new java.awt.Color(0, 153, 204));
        Entrar.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pata.png"))); // NOI18N
        Entrar.setText("Entrar");
        Entrar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Bienvenido", 2, 2, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
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
        Creditos.setText("Creditos");
        Creditos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Bienvenido", 2, 2, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Creditos.setCursor(Imagenes.Cursor("cursorAcercar.png"));
        Creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreditosMouseExited(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 153, 204));
        Salir.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pata.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Bienvenido", 2, 2, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Salir.setCursor(Imagenes.Cursor("cursorAcercar.png"));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrar)
                    .addComponent(Creditos)
                    .addComponent(Salir))
                .addContainerGap(121, Short.MAX_VALUE))
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
        Entrar.setBackground(Color.white);
        Entrar.setForeground(Color.black);
    }//GEN-LAST:event_CreditosMouseEntered

    private void CreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditosMouseExited
        Entrar.setBackground(new Color(0, 153, 204));
        Entrar.setForeground(Color.white);
    }//GEN-LAST:event_CreditosMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Entrar.setBackground(Color.white);
        Entrar.setForeground(Color.black);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Entrar.setBackground(new Color(0, 153, 204));
        Entrar.setForeground(Color.white);
    }//GEN-LAST:event_SalirMouseExited

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        this.dispose();
        in.setVisible(true);
    }//GEN-LAST:event_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creditos;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
