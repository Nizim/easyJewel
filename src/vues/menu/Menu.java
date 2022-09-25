
package vues.menu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.*;
import javax.swing.JFrame;
import modeles.MMenu;
import controleurs.CMenu;

/**
 *
 * @author darch
 */
public class Menu extends javax.swing.JPanel {
    
    private CMenu event;
    
    public void addEventMenuSelected(CMenu event) {
        this.event = event;
        listeMenu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        listeMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listeMenu1.addItem(new MMenu("house-solid", "Accueil", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
        listeMenu1.addItem(new MMenu("ring-solid", "Produits", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
        listeMenu1.addItem(new MMenu("box-solid", "Catégories", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
        listeMenu1.addItem(new MMenu("tags-solid", "Promotions", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
        listeMenu1.addItem(new MMenu("user-solid", "Utilisateurs", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
        listeMenu1.addItem(new MMenu("message-solid", "Avis", MMenu.MenuType.MENU));
        listeMenu1.addItem(new MMenu("", "", MMenu.MenuType.EMPTY));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listeMenu1 = new vues.menu.ListeMenu<>();

        panelMove.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("easyJewel");

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoveLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listeMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listeMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren (Graphics grphcs) {
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#99f2c8"), 0, getHeight(), Color.decode("#1f4037"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    private int x;
    private int y;
    
    public void initMove(JFrame frame) {
        panelMove.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
        });
        panelMove.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() -x, me.getYOnScreen()-y);
            }
        });
    }

    public ListeMenu<String> getListeMenu1() {
        return listeMenu1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private vues.menu.ListeMenu<String> listeMenu1;
    private javax.swing.JPanel panelMove;
    // End of variables declaration//GEN-END:variables
}
