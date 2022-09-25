package vues.menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import modeles.MMenu;

/**
 *
 * @author darch
 */
public class MenuItem extends javax.swing.JPanel {

    private boolean selected;

    public MenuItem(MMenu data) {
        initComponents();
        setOpaque(false);
        if (data.getType() == MMenu.MenuType.MENU) {
            lbl_icone.setIcon((data.toIcon()));
            lbl_nom.setText(data.getNom());
        } else if (data.getType() == MMenu.MenuType.TITLE) {
            lbl_icone.setText((data.getNom()));
            lbl_icone.setFont(new Font("sansserif", 1, 14));
            lbl_nom.setVisible(false);
        } else {
            lbl_nom.setText(" ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nom = new javax.swing.JLabel();
        lbl_icone = new javax.swing.JLabel();

        lbl_nom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nom.setText("Menu Nom");

        lbl_icone.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_icone)
                .addGap(18, 18, 18)
                .addComponent(lbl_nom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_icone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_icone;
    private javax.swing.JLabel lbl_nom;
    // End of variables declaration//GEN-END:variables

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
}
