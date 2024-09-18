/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suryani lestari 14
 */
public class td {
    
    public static void tampildatabuku(JTable tableym) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            DefaultTableModel tm = (DefaultTableModel) tableym.getModel();
            tm.setRowCount(0);
            koneksi.bahasasql = "SELECT * FROM buku";
            koneksi.ambildata();
            while (koneksi.hasilset.next()) {
                String id, judul, pengarang, penerbit, jenis;
                int tahun;
                int jumlah;

                id = koneksi.hasilset.getString("id_buku");
                judul = koneksi.hasilset.getString("judul");
                pengarang = koneksi.hasilset.getString("pengarang");
                penerbit = koneksi.hasilset.getString("penerbit");
                tahun = koneksi.hasilset.getInt("tahun");
                jumlah = koneksi.hasilset.getInt("jumlah");
                jenis = koneksi.hasilset.getString("jenis");
                tm.addRow(new Object[]{id, judul, pengarang, penerbit, tahun, jenis, jumlah});
            }
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void tampildatapetugas(JTable tym) {
    
        try {
            DefaultTableModel tm = (DefaultTableModel) tym.getModel();
            tm.setRowCount(0);

            koneksi.bahasasql = "SELECT * FROM tpetugas";
            koneksi.ambildata();
            while (koneksi.hasilset.next()) {
                String id = koneksi.hasilset.getString("id_petugas");
                String nama = koneksi.hasilset.getString("nama_petugas");
                String tgl = koneksi.hasilset.getString("tgl");
                String alamat = koneksi.hasilset.getString("alamat");
                String tlp = koneksi.hasilset.getString("tlp");
                String jk = koneksi.hasilset.getString("jk");
                tm.addRow(new Object[]{id, nama, tgl, alamat, tlp, jk});
            }
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
           }

    public static void tampildataanggota(JTable yangmana) {


        try {
            DefaultTableModel tm = (DefaultTableModel) yangmana.getModel();
            tm.setRowCount(0);

            koneksi.bahasasql = "SELECT * FROM anggota";
            koneksi.ambildata();
            while (koneksi.hasilset.next()) {
                String nis = koneksi.hasilset.getString("nis");
                String nama = koneksi.hasilset.getString("nama_siswa");
                String kelas = koneksi.hasilset.getString("kelas");
                String jurusan = koneksi.hasilset.getString("jurusan");
                tm.addRow(new Object[]{nis, nama, kelas, jurusan});
            }
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void tampilnamadankode(JTextField ym, JTextField ad) {
        
        try {
            koneksi.bahasasql = "SELECT * FROM tlogin INNER JOIN tpetugas ON tlogin.id_petugas = tpetugas.id_petugas ";
            koneksi.ambildata();
            koneksi.hasilset.next();
            ym.setText(koneksi.hasilset.getString("nama_petugas"));
            ad.setText(koneksi.hasilset.getString("id_petugas"));
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
   } 
    

    public static void tampildatapinjam(JTable ym) {

    
        try {
            DefaultTableModel tm = (DefaultTableModel) ym.getModel();
            tm.setRowCount(0);
            koneksi.bahasasql = "SELECT * FROM headpin INNER JOIN detailpem ON headpin.no_pinjam=detailpem.no_pinjam";
            koneksi.ambildata();
            while (koneksi.hasilset.next()) {
                String npinjam, tglp, tglk, nama,nmp, idp, kb, jumlah,nis;
                
                npinjam = koneksi.hasilset.getString("no_pinjam");
                nis=koneksi.hasilset.getString("nis");
                tglp = koneksi.hasilset.getString("tgl_pinjam");
                tglk = koneksi.hasilset.getString("tgl_kembali");
                nama = koneksi.hasilset.getString("nama_siswa");
                idp = koneksi.hasilset.getString("ID_petugas");
                nmp = koneksi.hasilset.getString("nama_petugas");
                kb = koneksi.hasilset.getString("judul");
                jumlah = koneksi.hasilset.getString("jumlah");
                String judul=koneksi.hasilset.getString("judul");

                tm.addRow(new Object[]{npinjam, tglp,tglk, nis, nama, kb,judul, jumlah,nmp,idp });

            }
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    public static void tampildatakembali(JTable ym) {

        
        try {
            DefaultTableModel tm = (DefaultTableModel) ym.getModel();
            tm.setRowCount(0);
            koneksi.bahasasql = "SELECT * FROM pengembalian";
            koneksi.ambildata();
            while (koneksi.hasilset.next()) {
                String npinjam, nis, idp, kb,nkembali,namas,namap,judul;
                int jumlah;
                Date  tglp, tglk;
                nkembali = koneksi.hasilset.getString("no_kembali");
                npinjam = koneksi.hasilset.getString("no_pinjam");
                tglp = koneksi.hasilset.getDate("tgl_pinjam");
                tglk = koneksi.hasilset.getDate("tgl_kembali");
                nis = koneksi.hasilset.getString("nis");
                namas = koneksi.hasilset.getString("nama_siswa");
                idp = koneksi.hasilset.getString("id_petugas");
                namap = koneksi.hasilset.getString("nama_petugas");
                kb = koneksi.hasilset.getString("id_buku");
                judul = koneksi.hasilset.getString("judul");
                jumlah = koneksi.hasilset.getInt("jumlah");

                tm.addRow(new Object[]{nkembali,npinjam, tglp, tglk, nis,namas, kb,judul,jumlah, idp,namap});

            }
        } catch (SQLException ex) {
            Logger.getLogger(td.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
