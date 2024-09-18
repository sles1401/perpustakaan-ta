/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suryani lestari 14
 */
public class total {
     public static void totalpinjam(JTable tym, JTextField tfm){
       int total=0;
           for (int i = 0; i < tym.getRowCount(); i++) {
               int tot=Integer.valueOf(tym.getValueAt(i, 2).toString());
               total=total+tot;
           }
           tfm.setText(""+total);
       }
     public static void totalkembali(JTable tym, JTextField tfm){
       int total=0;
           for (int i = 0; i < tym.getRowCount(); i++) {
               int tot=Integer.valueOf(tym.getValueAt(i, 3).toString());
               total=total+tot;
           }
           tfm.setText(""+total);
       }
    

}
