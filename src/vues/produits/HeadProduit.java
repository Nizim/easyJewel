package vues.produits;

import controleurs.CProduit;
import controleurs.CStock;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import modeles.Connexion;
import modeles.MHeadProduit;

/**
 *
 * @author darch
 */
public class HeadProduit extends javax.swing.JPanel {

    private Color color1;
    private Color color2;
    private Connexion co;
    public CStock cstock;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Creates new form HeadProduit
     */
    public HeadProduit() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        this.co = new Connexion();
        cstock = new CStock();

    }

    public void setData(MHeadProduit data) {
        lbl_valeurs.setText("Il y a " + data.getNb() + " " + data.getCategorie() + " dans la BD");
    }

    public JLabel getLbl_valeurs() {
        return lbl_valeurs;
    }

    public void setLbl_valeursText(Integer nb) {
        lbl_valeurs.setText("Il y a " + nb + " produits dans la BD");
    }

    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_valeurs = new javax.swing.JLabel();
        bt_modifier = new javax.swing.JButton();
        bt_supprimer = new javax.swing.JButton();
        bt_ajouter = new javax.swing.JButton();
        bt_stock = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_valeurs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_valeurs.setText("Produits : ");

        bt_modifier.setText("Modifier un produit");
        bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifierActionPerformed(evt);
            }
        });

        bt_supprimer.setText("Supprimer un produit");
        bt_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_supprimerActionPerformed(evt);
            }
        });

        bt_ajouter.setText("Ajouter un produit");
        bt_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajouterActionPerformed(evt);
            }
        });

        bt_stock.setText("Ajouter du stock");
        bt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_valeurs, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(bt_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(bt_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(bt_supprimer)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_valeurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bt_supprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed

    }//GEN-LAST:event_bt_modifierActionPerformed

    private void bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supprimerActionPerformed


    }//GEN-LAST:event_bt_supprimerActionPerformed

    private void bt_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajouterActionPerformed

        AjoutProduit ajoutProduit = new AjoutProduit();
        ajoutProduit.setVisible(true);

    }//GEN-LAST:event_bt_ajouterActionPerformed

    private void bt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stockActionPerformed
        bt_stock.addActionListener(cstock);
        cstock.setVue((JPanel) this.getParent());
    }//GEN-LAST:event_bt_stockActionPerformed
    /*
    void addClickListener(ClickListener l) {
        clickListenerList.add(ClickListener.class, l);
    }

    void removeClickListener(ClickListener l) {
        clickListenerList.remove(ClickListener.class, l);
    }
     */
 /*
    public void bt_stock(CProduit event, Object o) {
        this.event = event;
        listeMenu1.addEventMenuSelected(event);
        
        AjoutStock ajoutStock = new AjoutStock();
        ajoutStock.setVisible(true);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ajouter;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JButton bt_stock;
    private javax.swing.JButton bt_supprimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_valeurs;
    // End of variables declaration//GEN-END:variables

    public JButton getBt_ajouter() {
        return bt_ajouter;
    }

    public void setBt_ajouter(JButton bt_ajouter) {
        this.bt_ajouter = bt_ajouter;
    }

    public JButton getBt_modifier() {
        return bt_modifier;
    }

    public void setBt_modifier(JButton bt_modifier) {
        this.bt_modifier = bt_modifier;
    }

    public JButton getBt_stock() {
        return bt_stock;
    }

    public void setBt_stock(JButton bt_stock) {
        this.bt_stock = bt_stock;
    }

    public JButton getBt_supprimer() {
        return bt_supprimer;
    }

    public void setBt_supprimer(JButton bt_supprimer) {
        this.bt_supprimer = bt_supprimer;
    }

}

class ClickEvent extends EventObject {

    public ClickEvent(Object source) {
        super(source);
    }

}

interface ClickListener extends EventListener {

    void clicked(ClickEvent e);
}
