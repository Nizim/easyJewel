package vues.categories;

import controleurs.CCategorie;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeles.Connexion;

/**
 *
 * @author darch
 */
public class AjoutCategorie extends javax.swing.JFrame {

    CCategorie ccategorie;
    Connexion co;

    public AjoutCategorie() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Ajout de catégorie");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        ccategorie = new CCategorie(co);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBord1 = new vues.PanelBord();
        bt_ajoutCategorie = new javax.swing.JButton();
        lbl_libelleAjout = new javax.swing.JLabel();
        tf_libelleAjout = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_ajoutCategorie.setText("Ajouter");
        bt_ajoutCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajoutCategorieActionPerformed(evt);
            }
        });

        lbl_libelleAjout.setText("Libellé");

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_libelleAjout)
                    .addComponent(tf_libelleAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(bt_ajoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ajoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addComponent(lbl_libelleAjout)
                        .addGap(18, 18, 18)
                        .addComponent(tf_libelleAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ajoutCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajoutCategorieActionPerformed
        if (!tf_libelleAjout.getText().isEmpty()) {
            if (!ccategorie.existeNomCategorie(co, tf_libelleAjout.getText())) {
                
                ccategorie.ajoutCategorie(co, tf_libelleAjout.getText());

                JOptionPane.showMessageDialog(this, "La catégorie a bien été ajoutée");
            } else {
                JOptionPane.showMessageDialog(this, "La catégorie existe déjà !", "Attention", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Merci de remplir tous les champs du formulaire", "Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_ajoutCategorieActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutCategorie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutCategorie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutCategorie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutCategorie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ajoutCategorie;
    private javax.swing.JLabel lbl_libelleAjout;
    private vues.PanelBord panelBord1;
    private javax.swing.JTextField tf_libelleAjout;
    // End of variables declaration//GEN-END:variables

    public JButton getBt_ajoutCategorie() {
        return bt_ajoutCategorie;
    }

    public void setBt_ajoutCategorie(JButton bt_ajoutCategorie) {
        this.bt_ajoutCategorie = bt_ajoutCategorie;
    }

    public JTextField getTf_libelleAjout() {
        return tf_libelleAjout;
    }

    public void setTf_libelleAjout(JTextField tf_libelleAjout) {
        this.tf_libelleAjout = tf_libelleAjout;
    }

}
