
package vues.avis;

import vues.users.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author darch
 */
public class TableAvis extends JTable {

    
    public TableAvis() {
        
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        
        
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                HeaderTableUser header = new HeaderTableUser(o + "");
                
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if(selected) {
                    com.setForeground(new Color(0, 0, 0));
                    com.setBackground(new Color(112, 183, 152));
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                return com;
            }  
        });
        
        
    }
    
}
