package vues.produits;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.table.DefaultTableModel;
import controleurs.CProduit;
import controleurs.CStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeles.Connexion;

/**
 *
 * @author darch
 */
public class FormProduit extends javax.swing.JPanel {

    public Connexion co;
    public CProduit cproduit;

    public FormProduit() {
        co = new Connexion();
        this.cproduit = new CProduit(co);
        initComponents();
        setOpaque(false);
        setTableModel();
        setLblValeur();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    public int getSelectedRow() {
        return table.getSelectedRow();
    }

    public void setTableModel() {
        DefaultTableModel model = cproduit.fillProduitTable();
        table.setModel(model);
    }

    public void setLblValeur() {

        lbl_valeurs.setText("Il y a " + table.getRowCount() + " produits dans la BD");
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelBord1 = new vues.PanelBord();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new vues.produits.TableProduits();
        lbl_listeProduit = new javax.swing.JLabel();
        panelBord2 = new vues.PanelBord();
        bt_ajouter = new javax.swing.JButton();
        bt_stock = new javax.swing.JButton();
        bt_modifier = new javax.swing.JButton();
        bt_supprimer = new javax.swing.JButton();
        lbl_valeurs = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setForeground(new java.awt.Color(51, 51, 51));

        panelBord1.setBackground(new java.awt.Color(51, 51, 51));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant", "Libellé", "Prix", "Description", "Stock", "Catégorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        lbl_listeProduit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_listeProduit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_listeProduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_listeProduit.setText("Liste des produits");

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(lbl_listeProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addComponent(lbl_listeProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

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

        javax.swing.GroupLayout panelBord2Layout = new javax.swing.GroupLayout(panelBord2);
        panelBord2.setLayout(panelBord2Layout);
        panelBord2Layout.setHorizontalGroup(
            panelBord2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBord2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBord2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_supprimer))
        );
        panelBord2Layout.setVerticalGroup(
            panelBord2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBord2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBord2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_supprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBord2Layout.createSequentialGroup()
                        .addComponent(bt_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lbl_valeurs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_valeurs.setText("Produits : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_valeurs, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBord2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valeurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajouterActionPerformed

        AjoutProduit ajoutProduit = new AjoutProduit();
        ajoutProduit.setVisible(true);
        
    }//GEN-LAST:event_bt_ajouterActionPerformed

    private void bt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stockActionPerformed
        
        int selectedRow = getSelectedRow();
        if (selectedRow!=-1) {
            int idProduit = Integer.parseInt(table.getModel().getValueAt(selectedRow, 0).toString());
            
            AjoutStock ajoutStock = new AjoutStock(idProduit);
            ajoutStock.setVisible(true);
            

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne", "Attention", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_bt_stockActionPerformed

    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed
        int selectedRow = getSelectedRow();
        if (selectedRow!=-1) {
            int idProduit = Integer.parseInt(table.getModel().getValueAt(selectedRow, 0).toString());
            String libelleProduit = table.getModel().getValueAt(selectedRow, 1).toString();
            
            String prixString = table.getModel().getValueAt(selectedRow, 2).toString();
            Float prix = Float.parseFloat(prixString);
            
            String description = table.getModel().getValueAt(selectedRow, 3).toString();
            int stock = Integer.parseInt(table.getModel().getValueAt(selectedRow, 4).toString());
            String categorie = table.getModel().getValueAt(selectedRow, 5).toString();
            
            ModifProduit modifProduit = new ModifProduit(idProduit, libelleProduit, prix, description, stock, categorie);
            modifProduit.setVisible(true);
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_modifierActionPerformed

    private void bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supprimerActionPerformed

        int selectedRow = getSelectedRow();
        if (selectedRow!=-1) {
            int idProduit = Integer.parseInt(table.getModel().getValueAt(selectedRow, 0).toString());
            
            cproduit.supprimerProduitById(co, idProduit);
            JOptionPane.showMessageDialog(this, "Le produit a bien été supprimé");

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_supprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ajouter;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JButton bt_stock;
    private javax.swing.JButton bt_supprimer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_listeProduit;
    private javax.swing.JLabel lbl_valeurs;
    private vues.PanelBord panelBord1;
    private vues.PanelBord panelBord2;
    private vues.produits.TableProduits table;
    // End of variables declaration//GEN-END:variables
}
