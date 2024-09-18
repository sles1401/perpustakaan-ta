/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author suryani lestari 14
 */
public class buatf {
    
    public static void buatframe(JPanel yangmana, JInternalFrame fr) {
        
        try {
            yangmana.removeAll();
            yangmana.add(fr);
            fr.setVisible(true);
            fr.setMaximum(true);
            ((BasicInternalFrameUI) fr.getUI()).setNorthPane(null);
            fr.setBorder(null);
            yangmana.repaint();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(buatf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



}
