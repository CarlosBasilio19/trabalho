

package Login;

import conexao.ConnectionFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class Mercado extends javax.swing.JFrame {

    public Mercado() {
        initComponents();
        
    }
    
  
    
    // Outros métodos...

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        secoseenlats = new javax.swing.JButton();
        congela = new javax.swing.JButton();
        bebs = new javax.swing.JButton();
        doces = new javax.swing.JButton();
        fresco = new javax.swing.JButton();
        realizarpdidos = new javax.swing.JToggleButton();
        fazeravaliaçao = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/WhatsApp Image 2024-07-31 at 23.14.21 (1) (1).jpeg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("                 LA PLATA");

        secoseenlats.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        secoseenlats.setText("   Secos e enlatados");
        secoseenlats.setBorder(new javax.swing.border.MatteBorder(null));
        secoseenlats.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        secoseenlats.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        secoseenlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secoseenlatsActionPerformed(evt);
            }
        });

        congela.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        congela.setText("Congelados");
        congela.setBorder(new javax.swing.border.MatteBorder(null));
        congela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congelaActionPerformed(evt);
            }
        });

        bebs.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        bebs.setText("Bebidas");
        bebs.setBorder(new javax.swing.border.MatteBorder(null));
        bebs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebsActionPerformed(evt);
            }
        });

        doces.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        doces.setText("Doces e Snacks");
        doces.setBorder(new javax.swing.border.MatteBorder(null));

        fresco.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        fresco.setText("Frescos");
        fresco.setBorder(new javax.swing.border.MatteBorder(null));

        realizarpdidos.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        realizarpdidos.setBorder(new javax.swing.border.MatteBorder(null));
        realizarpdidos.setLabel("Realizar pedido");
        realizarpdidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarpdidosActionPerformed(evt);
            }
        });

        fazeravaliaçao.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        fazeravaliaçao.setText("Fazer avaliaçao");
        fazeravaliaçao.setBorder(new javax.swing.border.MatteBorder(null));
        fazeravaliaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazeravaliaçaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fazeravaliaçao, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarpdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fresco, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(congela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secoseenlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bebs, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doces, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(256, 256, 256))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secoseenlats, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fresco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(congela)
                    .addComponent(bebs)
                    .addComponent(doces))
                .addGap(18, 18, 18)
                .addComponent(realizarpdidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fazeravaliaçao)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void congelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congelaActionPerformed
   
    }//GEN-LAST:event_congelaActionPerformed

    private void secoseenlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secoseenlatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secoseenlatsActionPerformed

    private void realizarpdidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarpdidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_realizarpdidosActionPerformed

    private void bebsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebsActionPerformed

    private void fazeravaliaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazeravaliaçaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fazeravaliaçaoActionPerformed

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
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bebs;
    private javax.swing.JButton congela;
    private javax.swing.JButton doces;
    private javax.swing.JToggleButton fazeravaliaçao;
    private javax.swing.JButton fresco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton realizarpdidos;
    private javax.swing.JButton secoseenlats;
    // End of variables declaration//GEN-END:variables

}
