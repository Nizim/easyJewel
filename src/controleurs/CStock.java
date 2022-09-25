
package controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author darch
 */
public class CStock implements ActionListener {
    
    public JPanel panel;
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "CA MARCHE");
        //ajoutStock();
    }

    public CStock() {
        
    }

    public void setVue(JPanel panel) {
        this.panel=panel;
        
    }
    
    
    public void ajoutStock(Integer idProduit, Integer nb) {
        
    }
    
}
