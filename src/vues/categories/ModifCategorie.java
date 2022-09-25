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
public class ModifCategorie extends javax.swing.JFrame {

    CCategorie ccategorie;
    Connexion co;
    String libelle;
    int idCat;

    public ModifCategorie(int idCat, String libelle) {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Modification de catégorie");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        ccategorie = new CCategorie(co);
        this.idCat=idCat;
        this.libelle = libelle;
        tf_libelleModif.setText(libelle);
    }

    public ModifCategorie() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setTitle("Modification de catégorie");
        this.setLocationRelativeTo(null);

        co = new Connexion();
        ccategorie = new CCategorie(co);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBord1 = new vues.PanelBord();
        bt_modifCategorie = new javax.swing.JButton();
        lbl_libelleModif = new javax.swing.JLabel();
        tf_libelleModif = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_modifCategorie.setText("Modifier");
        bt_modifCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifCategorieActionPerformed(evt);
            }
        });

        lbl_libelleModif.setText("Libellé");

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_libelleModif)
                    .addComponent(tf_libelleModif, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(bt_modifCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_modifCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBord1Layout.createSequentialGroup()
                        .addComponent(lbl_libelleModif)
                        .addGap(18, 18, 18)
                        .addComponent(tf_libelleModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void bt_modifCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifCategorieActionPerformed

        if (!tf_libelleModif.getText().isEmpty()) {
            ccategorie.modifierCategorie(co, idCat, tf_libelleModif.getText());

            JOptionPane.showMessageDialog(this, "La catégorie a bien été modifiée");

        } else {
            JOptionPane.showMessageDialog(this, "Merci de remplir tous les champs du formulaire", "Attention", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_modifCategorieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_modifCategorie;
    private javax.swing.JLabel lbl_libelleModif;
    private vues.PanelBord panelBord1;
    private javax.swing.JTextField tf_libelleModif;
    // End of variables declaration//GEN-END:variables

    public JButton getBt_ajoutCategorie() {
        return bt_modifCategorie;
    }

    public void setBt_ajoutCategorie(JButton bt_ajoutCategorie) {
        this.bt_modifCategorie = bt_ajoutCategorie;
    }

    public JTextField getTf_libelleAjout() {
        return tf_libelleModif;
    }

    public void setTf_libelleAjout(JTextField tf_libelleAjout) {
        this.tf_libelleModif = tf_libelleAjout;
    }

}
