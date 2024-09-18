/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author suryani lestari 14
 */
public class auto {
        public static void kodebuku(JTextField tym) {
        
            try {
                String kodenya;
                koneksi.bahasasql = "SELECT SUBSTRING(id_buku,3,LENGTH(id_buku)) +1 AS noselanjutnya FROM buku ORDER BY id_buku DESC LIMIT 1";
                koneksi.ambildata();
                if (koneksi.hasilset.next()) {
                    int tambah = koneksi.hasilset.getInt("noselanjutnya");
                    if (tambah < 10) {
                        kodenya = "B-00" + tambah;
                    } else if (tambah < 100) {
                        kodenya = "B-0" + tambah;
                    } else {
                        kodenya = "BR" + tambah;
                    }
                } else {
                    kodenya = "B001";
                }
                
                tym.setText(kodenya);
            } catch (SQLException ex) {
                Logger.getLogger(auto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public static void kodepetugas(JTextField tym) {
        
            try {
                String kodenya;
                koneksi.bahasasql = "SELECT SUBSTRING(id_petugas,5,LENGTH(id_petugas)) +1 AS noselanjutnya FROM tpetugas ORDER BY id_petugas DESC LIMIT 1";
                koneksi.ambildata();
                if (koneksi.hasilset.next()) {
                    int tambah = koneksi.hasilset.getInt("noselanjutnya");
                    if (tambah < 10) {
                        kodenya = "PTG-00" + tambah;
                    } else if (tambah < 100) {
                        kodenya = "PTG-0" + tambah;
                    } else {
                        kodenya = "PTG" + tambah;
                    }
                } else {
                    kodenya = "PTG-001";
                }
                
                tym.setText(kodenya);
            } catch (SQLException ex) {
                Logger.getLogger(auto.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        public static void kodepinjam(JTextField tym) {
        
            try {
                String kodenya;
                koneksi.bahasasql = "SELECT SUBSTRING(no_pinjam,5,LENGTH(no_pinjam)) +1 AS noselanjutnya FROM headpin ORDER BY no_pinjam  DESC LIMIT 1";
                koneksi.ambildata();
                if (koneksi.hasilset.next()) {
                    int tambah = koneksi.hasilset.getInt("noselanjutnya");
                    if (tambah < 10) {
                        kodenya = "TRP-00" + tambah;
                    } else if (tambah < 100) {
                        kodenya = "TRP-0" + tambah;
                    } else {
                        kodenya = "TRP" + tambah;
                    }
                } else {
                    kodenya = "TRP-001";
                }
                
                tym.setText(kodenya);
            } catch (SQLException ex) {
                Logger.getLogger(auto.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        public static void kodekembali(JTextField tym) {
        
            try {
                String kodenya;
                koneksi.bahasasql = "SELECT SUBSTRING(no_kembali,5,LENGTH(no_kembali)) +1 AS noselanjutnya FROM pengembalian ORDER BY no_kembali  DESC LIMIT 1";
                koneksi.ambildata();
                if (koneksi.hasilset.next()) {
                    int tambah = koneksi.hasilset.getInt("noselanjutnya");
                    if (tambah < 10) {
                        kodenya = "TRK-00" + tambah;
                    } else if (tambah < 100) {
                        kodenya = "TRK-0" + tambah;
                    } else {
                        kodenya = "TRK" + tambah;
                    }
                } else {
                    kodenya = "TRK-001";
                }
                
                tym.setText(kodenya);
            } catch (SQLException ex) {
                Logger.getLogger(auto.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
