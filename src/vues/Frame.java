package vues;

import vues.categories.FormCategorie;
import controleurs.CMenu;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import vues.avis.FormAvis;
import vues.produits.FormProduit;
import vues.users.FormUser;

/**
 *
 * @author easyJewel
 */
public class Frame extends javax.swing.JFrame {

    public Frame() {
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu1.initMove(Frame.this);
        setForm(new FormHome());
        menu1.addEventMenuSelected(new CMenu() {
            public void selected(int index) {
                if (index == 0) {
                    setForm(new FormHome());
                } else if (index == 2) {
                    setForm(new FormProduit());
                } else if (index == 4) {
                    setForm(new FormCategorie());
                } else if (index == 6) {
                    setForm(new FormPromotion());
                } else if (index == 8) {
                    setForm(new FormUser());
                } else if (index == 10) {
                    setForm(new FormAvis());
                }
            }
        });

        lbl_icone.setOpaque(false);

        this.setLocationRelativeTo(null);
        //device.setFullScreenWindow(this);
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelBord3 = new vues.PanelBord();
        lbl_icone = new javax.swing.JLabel();
        menu1 = new vues.menu.Menu();
        mainPanel = new javax.swing.JPanel();
        header1 = new vues.Header();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBord3.setBackground(new java.awt.Color(51, 51, 51));
        panelBord3.setForeground(new java.awt.Color(0, 0, 0));

        lbl_icone.setBackground(new java.awt.Color(255, 255, 255));
        lbl_icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow-rotate-right-solid.png"))); // NOI18N
        lbl_icone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_iconeMouseClicked(evt);
            }
        });

        mainPanel.setForeground(new java.awt.Color(60, 63, 65));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBord3Layout = new javax.swing.GroupLayout(panelBord3);
        panelBord3.setLayout(panelBord3Layout);
        panelBord3Layout.setHorizontalGroup(
            panelBord3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord3Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBord3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBord3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBord3Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(lbl_icone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        panelBord3Layout.setVerticalGroup(
            panelBord3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addGroup(panelBord3Layout.createSequentialGroup()
                .addGroup(panelBord3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBord3Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(lbl_icone, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBord3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBord3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_iconeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iconeMouseClicked

        int index = menu1.getListeMenu1().getSelectedIndex();
        if (index == 0) {
            setForm(new FormHome());
        } else if (index == 2) {
            setForm(new FormProduit());
        } else if (index == 4) {
            setForm(new FormCategorie());
        } else if (index == 6) {
            setForm(new FormPromotion());
        } else if (index == 8) {
            setForm(new FormUser());
        } else if (index == 10) {
            setForm(new FormUser());
        }

    }//GEN-LAST:event_lbl_iconeMouseClicked

    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth()-25, getHeight()-25, getWidth(), getHeight());
        paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vues.Header header1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_icone;
    private javax.swing.JPanel mainPanel;
    private vues.menu.Menu menu1;
    private vues.PanelBord panelBord3;
    // End of variables declaration//GEN-END:variables

}
