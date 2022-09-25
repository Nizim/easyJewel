package vues.produits;

import controleurs.CCategorie;
import controleurs.CProduit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modeles.Connexion;

/**
 *
 * @author darch
 */
public class AjoutProduit extends javax.swing.JFrame {

    CProduit cproduit;
    CCategorie ccategorie;
    Connexion co;

    public AjoutProduit() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Ajout de produit");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        cproduit = new CProduit(co);
        ccategorie = new CCategorie(co);
        setCbbModel();
    }

    public void setCbbModel() {
        DefaultComboBoxModel model = cproduit.fillCatCbb();
        cbb_catAjoutProduit.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBord1 = new vues.PanelBord();
        bt_ajoutProduit = new javax.swing.JButton();
        lbl_libelleAjout = new javax.swing.JLabel();
        lbl_prixAjout = new javax.swing.JLabel();
        lbl_descAjout = new javax.swing.JLabel();
        lbl_stockAjout = new javax.swing.JLabel();
        cbb_catAjoutProduit = new javax.swing.JComboBox<>();
        lbl_catAjout = new javax.swing.JLabel();
        tf_libelleAjout = new javax.swing.JTextField();
        tf_prixAjout = new javax.swing.JTextField();
        tf_stockAjout = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descAjout = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_ajoutProduit.setText("Ajouter");
        bt_ajoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajoutProduitActionPerformed(evt);
            }
        });

        lbl_libelleAjout.setText("Libellé");

        lbl_prixAjout.setText("Prix");

        lbl_descAjout.setText("Description");

        lbl_stockAjout.setText("Stock initial");

        cbb_catAjoutProduit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_catAjout.setText("Catégorie");

        ta_descAjout.setColumns(20);
        ta_descAjout.setRows(5);
        jScrollPane1.setViewportView(ta_descAjout);

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addComponent(lbl_descAjout)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBord1Layout.createSequentialGroup()
                                    .addComponent(lbl_prixAjout)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panelBord1Layout.createSequentialGroup()
                                    .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_catAjout)
                                        .addComponent(lbl_stockAjout))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addComponent(lbl_libelleAjout)
                                .addGap(47, 47, 47)))
                        .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_stockAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_libelleAjout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addComponent(tf_prixAjout, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addComponent(cbb_catAjoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(bt_ajoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_libelleAjout)
                    .addComponent(tf_libelleAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_prixAjout)
                    .addComponent(tf_prixAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_descAjout)))
                .addGap(29, 29, 29)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_stockAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_stockAjout))
                .addGap(15, 15, 15)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_catAjoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_catAjout)
                    .addComponent(bt_ajoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ajoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajoutProduitActionPerformed
        if (!tf_libelleAjout.getText().isEmpty() && !tf_prixAjout.getText().isEmpty()
                && !ta_descAjout.getText().isEmpty() && !tf_stockAjout.getText().isEmpty()) {
            try {
                Float prix = Float.parseFloat(tf_prixAjout.getText());
                int stock = Integer.parseInt(tf_stockAjout.getText());
                if (prix >= 0 && stock >= 0) {
                    String cat = cbb_catAjoutProduit.getSelectedItem().toString();
                    Integer idCat = ccategorie.getIdFromCategorie(cat);

                    cproduit.ajoutProduit(co, tf_libelleAjout.getText(), idCat, prix, ta_descAjout.getText(), stock);

                    JOptionPane.showMessageDialog(this, "Le produit a bien été ajouté");
                } else {
                    JOptionPane.showMessageDialog(this, "Le prix et le stock ne peuvent pas être négatifs");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Le prix et le stock doivent être numériques", "Attention", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Merci de remplir tous les champs du formulaire", "Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_ajoutProduitActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ajoutProduit;
    private javax.swing.JComboBox<String> cbb_catAjoutProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_catAjout;
    private javax.swing.JLabel lbl_descAjout;
    private javax.swing.JLabel lbl_libelleAjout;
    private javax.swing.JLabel lbl_prixAjout;
    private javax.swing.JLabel lbl_stockAjout;
    private vues.PanelBord panelBord1;
    private javax.swing.JTextArea ta_descAjout;
    private javax.swing.JTextField tf_libelleAjout;
    private javax.swing.JTextField tf_prixAjout;
    private javax.swing.JTextField tf_stockAjout;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBt_ajoutProduit() {
        return bt_ajoutProduit;
    }

    public void setBt_ajoutProduit(javax.swing.JButton bt_ajoutProduit) {
        this.bt_ajoutProduit = bt_ajoutProduit;
    }

    public javax.swing.JComboBox<String> getCbb_catAjoutProduit() {
        return cbb_catAjoutProduit;
    }

    public void setCbb_catAjoutProduit(javax.swing.JComboBox<String> cbb_catAjoutProduit) {
        this.cbb_catAjoutProduit = cbb_catAjoutProduit;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JLabel getLbl_catAjout() {
        return lbl_catAjout;
    }

    public void setLbl_catAjout(javax.swing.JLabel lbl_catAjout) {
        this.lbl_catAjout = lbl_catAjout;
    }

    public javax.swing.JLabel getLbl_descAjout() {
        return lbl_descAjout;
    }

    public void setLbl_descAjout(javax.swing.JLabel lbl_descAjout) {
        this.lbl_descAjout = lbl_descAjout;
    }

    public javax.swing.JLabel getLbl_libelleAjout() {
        return lbl_libelleAjout;
    }

    public void setLbl_libelleAjout(javax.swing.JLabel lbl_libelleAjout) {
        this.lbl_libelleAjout = lbl_libelleAjout;
    }

    public javax.swing.JLabel getLbl_prixAjout() {
        return lbl_prixAjout;
    }

    public void setLbl_prixAjout(javax.swing.JLabel lbl_prixAjout) {
        this.lbl_prixAjout = lbl_prixAjout;
    }

    public javax.swing.JLabel getLbl_stockAjout() {
        return lbl_stockAjout;
    }

    public void setLbl_stockAjout(javax.swing.JLabel lbl_stockAjout) {
        this.lbl_stockAjout = lbl_stockAjout;
    }

    public vues.PanelBord getPanelBord1() {
        return panelBord1;
    }

    public void setPanelBord1(vues.PanelBord panelBord1) {
        this.panelBord1 = panelBord1;
    }

    public javax.swing.JTextArea getTa_descAjout() {
        return ta_descAjout;
    }

    public void setTa_descAjout(javax.swing.JTextArea ta_descAjout) {
        this.ta_descAjout = ta_descAjout;
    }

    public javax.swing.JTextField getTf_libelleAjout() {
        return tf_libelleAjout;
    }

    public void setTf_libelleAjout(javax.swing.JTextField tf_libelleAjout) {
        this.tf_libelleAjout = tf_libelleAjout;
    }

    public javax.swing.JTextField getTf_prixAjout() {
        return tf_prixAjout;
    }

    public void setTf_prixAjout(javax.swing.JTextField tf_prixAjout) {
        this.tf_prixAjout = tf_prixAjout;
    }

    public javax.swing.JTextField getTf_stockAjout() {
        return tf_stockAjout;
    }

    public void setTf_stockAjout(javax.swing.JTextField tf_stockAjout) {
        this.tf_stockAjout = tf_stockAjout;
    }
}
