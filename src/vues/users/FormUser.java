
package vues.users;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.table.DefaultTableModel;
import controleurs.CUser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeles.Connexion;

/**
 *
 * @author darch
 */
public class FormUser extends javax.swing.JPanel {

    public Connexion co;
    public CUser cuser;
    
    public FormUser() {
        co = new Connexion();
        this.cuser = new CUser(co);
        initComponents();
        setOpaque(false);
        setTableModel();
        setLblValeur();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    public void setTableModel() {
        DefaultTableModel model = cuser.fillUserTable();
        table.setModel(model);
    }
    
    public void setLblValeur() {
        
        lbl_valeurs.setText("Il y a " + table.getRowCount() + " utilisateurs dans la BD");
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
        lbl_listeUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new vues.users.TableUser();
        bt_supprimer = new javax.swing.JButton();
        lbl_valeurs = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setForeground(new java.awt.Color(51, 51, 51));

        panelBord1.setBackground(new java.awt.Color(51, 51, 51));

        lbl_listeUser.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_listeUser.setForeground(new java.awt.Color(255, 255, 255));
        lbl_listeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_listeUser.setText("Liste des utilisateurs");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout panelBord1Layout = new javax.swing.GroupLayout(panelBord1);
        panelBord1.setLayout(panelBord1Layout);
        panelBord1Layout.setHorizontalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_listeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        panelBord1Layout.setVerticalGroup(
            panelBord1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBord1Layout.createSequentialGroup()
                .addComponent(lbl_listeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bt_supprimer.setText("Bannir un utilisateur");
        bt_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_supprimerActionPerformed(evt);
            }
        });

        lbl_valeurs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_valeurs.setText("Utilisateurs :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_valeurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_valeurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supprimerActionPerformed
        int selectedRow = getSelectedRow();
        if (selectedRow!=-1) {
            int idUser = Integer.parseInt(table.getModel().getValueAt(selectedRow, 0).toString());
            String statut = table.getModel().getValueAt(selectedRow, 2).toString();
            System.out.println(idUser);
            System.out.println(statut);
            if(statut.equals("client")) {
                cuser.supprimerUserById(co, idUser);
                JOptionPane.showMessageDialog(this, "L'utilisateur " + table.getModel().getValueAt(selectedRow, 1) + " est banni !");
            } else {
                JOptionPane.showMessageDialog(this, "Impossible de supprimer un administrateur", "Attention", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_supprimerActionPerformed


    public int getSelectedRow() {
        return table.getSelectedRow();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_supprimer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_listeUser;
    private javax.swing.JLabel lbl_valeurs;
    private vues.PanelBord panelBord1;
    private vues.users.TableUser table;
    // End of variables declaration//GEN-END:variables
}
