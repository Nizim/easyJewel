package vues.produits;

import controleurs.CCategorie;
import controleurs.CProduit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeles.Connexion;

/**
 *
 * @author darch
 */
public class AjoutStock extends javax.swing.JFrame {

    CProduit cproduit;
    CCategorie ccategorie;
    Connexion co;
    int nb = 0;
    int idProduit = -1;

    public AjoutStock(int idProduit) {

        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Ajout de stock");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        cproduit = new CProduit(co);
        ccategorie = new CCategorie(co);
        this.idProduit = idProduit;
    }

    public AjoutStock() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Ajout de stock");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        cproduit = new CProduit(co);
        ccategorie = new CCategorie(co);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBord1 = new vues.PanelBord();
        lbl_stockAjout = new javax.swing.JLabel();
        tf_stockAjout = new javax.swing.JTextField();
        bt_stockProduit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_stockAjout.setText("Stock");

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_stockAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_stockAjout))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_stockAjout)
                .addGap(18, 18, 18)
                .addComponent(tf_stockAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bt_stockProduit.setText("Ajouter");
        bt_stockProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stockProduitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_stockProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_stockProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_stockProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stockProduitActionPerformed
        if (!tf_stockAjout.getText().isEmpty()) {
            try {
                this.nb = Integer.parseInt(tf_stockAjout.getText());

                cproduit.ajoutStock(co, idProduit, nb);
                JOptionPane.showMessageDialog(this, "Le stock a été ajouté");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Le stock doit être numérique", "Attention", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Merci de remplir tous les champs du formulaire", "Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_stockProduitActionPerformed

    public int getNb() {
        return nb;
    }

    public boolean isNbNull() {
        return nb != 0;
    }

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
            java.util.logging.Logger.getLogger(AjoutStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_stockProduit;
    private javax.swing.JLabel lbl_stockAjout;
    private vues.PanelBord panelBord1;
    private javax.swing.JTextField tf_stockAjout;
    // End of variables declaration//GEN-END:variables

    public JTextField getTf_stockAjout() {
        return tf_stockAjout;
    }

    public void setTf_stockAjout(JTextField tf_stockAjout) {
        this.tf_stockAjout = tf_stockAjout;
    }

}
