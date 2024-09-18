/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import laporan.lappetugas;
import static perpustakaan.anggota.table;
import static perpustakaan.book.table;
import static perpustakaan.petugas.table;

/**
 *
 * @author suryani lestari 14
 */
public class kf {

    public static login masuk = new login();
    public static anggota siswa = new anggota();
    public static petugas ptg = new petugas();
    public static peminjaman pinjam = new peminjaman();
    public static book buku = new book();
    public static transaksi trans = new transaksi();
    
    public static pengembalian kembali= new pengembalian();
    public static laporan.lappetugas lpt = new lappetugas();
    public static menu m1 = new menu();

}
