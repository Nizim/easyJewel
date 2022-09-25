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
public class ModifProduit extends javax.swing.JFrame {

    CProduit cproduit;
    CCategorie ccategorie;
    Connexion co;

    private int identifiant;
    private String libelle;
    private float prix;
    private String description;
    private int stock;
    private String categorie;

    public ModifProduit(int identifiant, String libelle, float prix, String description, int stock, String categorie) {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Modification de produit");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        cproduit = new CProduit(co);
        ccategorie = new CCategorie(co);
        setCbbModel();

        this.identifiant = identifiant;
        this.libelle = libelle;
        this.prix = prix;
        this.description = description;
        this.stock = stock;
        this.categorie = categorie;

        tf_libelleModif.setText(libelle);
        tf_prixModif.setText(String.valueOf(prix));
        ta_descModif.setText(description);
        tf_stockModif.setText(String.valueOf(stock));
        cbb_catModifProduit.setSelectedItem(categorie);
    }

    public ModifProduit() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Modification de produit");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        cproduit = new CProduit(co);
        ccategorie = new CCategorie(co);
        setCbbModel();
    }

    public void setCbbModel() {
        DefaultComboBoxModel model = cproduit.fillCatCbb();
        cbb_catModifProduit.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBord1 = new vues.PanelBord();
        bt_modifProduit = new javax.swing.JButton();
        lbl_libelleModif = new javax.swing.JLabel();
        lbl_prixModif = new javax.swing.JLabel();
        lbl_descModif = new javax.swing.JLabel();
        lbl_stockModif = new javax.swing.JLabel();
        cbb_catModifProduit = new javax.swing.JComboBox<>();
        lbl_catModif = new javax.swing.JLabel();
        tf_libelleModif = new javax.swing.JTextField();
        tf_prixModif = new javax.swing.JTextField();
        tf_stockModif = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descModif = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_modifProduit.setText("Modifier");
        bt_modifProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifProduitActionPerformed(evt);
            }
        });

        lbl_libelleModif.setText("Libellé");

        lbl_prixModif.setText("Prix");

        lbl_descModif.setText("Description");

        lbl_stockModif.setText("Stock initial");

        cbb_catModifProduit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_catModif.setText("Catégorie");

        ta_descModif.setColumns(20);
        ta_descModif.setRows(5);
        jScrollPane1.setViewportView(ta_descModif);

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addComponent(lbl_descModif)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBord1Layout.createSequentialGroup()
                                    .addComponent(lbl_prixModif)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panelBord1Layout.createSequentialGroup()
                                    .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_catModif)
                                        .addComponent(lbl_stockModif))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addComponent(lbl_libelleModif)
                                .addGap(47, 47, 47)))
                        .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_stockModif, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_libelleModif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addComponent(tf_prixModif, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBord1Layout.createSequentialGroup()
                                .addComponent(cbb_catModifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(bt_modifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_libelleModif)
                    .addComponent(tf_libelleModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_prixModif)
                    .addComponent(tf_prixModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_descModif)))
                .addGap(29, 29, 29)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_stockModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_stockModif))
                .addGap(15, 15, 15)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_catModifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_catModif)
                    .addComponent(bt_modifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void bt_modifProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifProduitActionPerformed
        if (!tf_libelleModif.getText().isEmpty() && !tf_prixModif.getText().isEmpty()
                && !ta_descModif.getText().isEmpty() && !tf_stockModif.getText().isEmpty()) {
            try {
                String libelle = tf_libelleModif.getText();
                String prixString = tf_prixModif.getText();

                prixString = prixString.replaceAll(" ", "");
                Float prix = Float.parseFloat(prixString);

                String description = ta_descModif.getText();
                int stock = Integer.parseInt(tf_stockModif.getText());

                String cat = cbb_catModifProduit.getSelectedItem().toString();
                Integer idCat = ccategorie.getIdFromCategorie(cat);
                
                if (prix >= 0 && stock >= 0) {
                    cproduit.modifierProduit(co, identifiant, libelle, idCat, prix, description, stock);
                    JOptionPane.showMessageDialog(this, "Le produit a bien été modifié");
                } else {
                    JOptionPane.showMessageDialog(this, "Le prix et le stock ne peuvent pas être négatifs");
                }

                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Le prix et le stock doivent être numériques", "Attention", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Merci de remplir tous les champs du formulaire", "Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_modifProduitActionPerformed

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
            java.util.logging.Logger.getLogger(ModifProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_modifProduit;
    private javax.swing.JComboBox<String> cbb_catModifProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_catModif;
    private javax.swing.JLabel lbl_descModif;
    private javax.swing.JLabel lbl_libelleModif;
    private javax.swing.JLabel lbl_prixModif;
    private javax.swing.JLabel lbl_stockModif;
    private vues.PanelBord panelBord1;
    private javax.swing.JTextArea ta_descModif;
    private javax.swing.JTextField tf_libelleModif;
    private javax.swing.JTextField tf_prixModif;
    private javax.swing.JTextField tf_stockModif;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBt_ajoutProduit() {
        return bt_modifProduit;
    }

    public void setBt_ajoutProduit(javax.swing.JButton bt_ajoutProduit) {
        this.bt_modifProduit = bt_ajoutProduit;
    }

    public javax.swing.JComboBox<String> getCbb_catAjoutProduit() {
        return cbb_catModifProduit;
    }

    public void setCbb_catAjoutProduit(javax.swing.JComboBox<String> cbb_catAjoutProduit) {
        this.cbb_catModifProduit = cbb_catAjoutProduit;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JLabel getLbl_catAjout() {
        return lbl_catModif;
    }

    public void setLbl_catAjout(javax.swing.JLabel lbl_catAjout) {
        this.lbl_catModif = lbl_catAjout;
    }

    public javax.swing.JLabel getLbl_descAjout() {
        return lbl_descModif;
    }

    public void setLbl_descAjout(javax.swing.JLabel lbl_descAjout) {
        this.lbl_descModif = lbl_descAjout;
    }

    public javax.swing.JLabel getLbl_libelleAjout() {
        return lbl_libelleModif;
    }

    public void setLbl_libelleAjout(javax.swing.JLabel lbl_libelleAjout) {
        this.lbl_libelleModif = lbl_libelleAjout;
    }

    public javax.swing.JLabel getLbl_prixAjout() {
        return lbl_prixModif;
    }

    public void setLbl_prixAjout(javax.swing.JLabel lbl_prixAjout) {
        this.lbl_prixModif = lbl_prixAjout;
    }

    public javax.swing.JLabel getLbl_stockAjout() {
        return lbl_stockModif;
    }

    public void setLbl_stockAjout(javax.swing.JLabel lbl_stockAjout) {
        this.lbl_stockModif = lbl_stockAjout;
    }

    public vues.PanelBord getPanelBord1() {
        return panelBord1;
    }

    public void setPanelBord1(vues.PanelBord panelBord1) {
        this.panelBord1 = panelBord1;
    }

    public javax.swing.JTextArea getTa_descAjout() {
        return ta_descModif;
    }

    public void setTa_descAjout(javax.swing.JTextArea ta_descAjout) {
        this.ta_descModif = ta_descAjout;
    }

    public javax.swing.JTextField getTf_libelleAjout() {
        return tf_libelleModif;
    }

    public void setTf_libelleAjout(javax.swing.JTextField tf_libelleAjout) {
        this.tf_libelleModif = tf_libelleAjout;
    }

    public javax.swing.JTextField getTf_prixAjout() {
        return tf_prixModif;
    }

    public void setTf_prixAjout(javax.swing.JTextField tf_prixAjout) {
        this.tf_prixModif = tf_prixAjout;
    }

    public javax.swing.JTextField getTf_stockAjout() {
        return tf_stockModif;
    }

    public void setTf_stockAjout(javax.swing.JTextField tf_stockAjout) {
        this.tf_stockModif = tf_stockAjout;
    }
}
