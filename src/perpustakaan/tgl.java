/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suryani lestari 14
 */
public class tgl {
    public static void sekarang(JDateChooser dc){
        try {
            koneksi.bahasasql="SELECT CURRENT_DATE as tgl";
            koneksi.ambildata();
            if (koneksi.hasilset.next()) {
                dc.setDate(koneksi.hasilset.getDate("tgl"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(tgl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
