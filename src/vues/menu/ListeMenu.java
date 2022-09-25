
package vues.menu;

import controleurs.CMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import modeles.MMenu;

/**
 *
 * @author darch
 */
public class ListeMenu<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    public int selectedIndex = -1;
    private CMenu event;
    
    public void addEventMenuSelected(CMenu event) {
        this.event = event;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    } 
    
    public ListeMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if(SwingUtilities.isLeftMouseButton(me)) {
                    int index=locationToIndex(me.getPoint());
                    Object o=model.getElementAt(index);
                    if(o instanceof MMenu) {
                        MMenu menu = (MMenu)o;
                        if(menu.getType()==MMenu.MenuType.MENU) {
                            selectedIndex=index;
                            if(event!=null) {
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex=index;
                    }
                    repaint();
                }
            }
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                MMenu data;
                if(o instanceof MMenu) {
                    data = (MMenu) o;
                } else {
                    data = new MMenu("", o + "", MMenu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                return item;
            }
            
        };
    }
    public void addItem(MMenu data) {
        model.addElement(data);
    }
    
}
