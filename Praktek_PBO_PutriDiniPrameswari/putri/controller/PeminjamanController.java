/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.controller;

import putri.view.FormPeminjaman;
import putri.Dao.AnggotaDao;
import putri.Dao.AnggotaDaoImpl;
import putri.model.Anggota;
import putri.Dao.BukuDao;
import putri.Dao.BukuDaoImpl;
import putri.model.Buku;
import putri.Dao.PeminjamanDao;
import putri.Dao.PeminjamanDaoImpl;
import putri.model.Peminjaman;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author USER
 */
public class PeminjamanController {

    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        
    } 
    public void bersihForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
        
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNoBp().removeAllItems();
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list){
            formPeminjaman.getCboNoBp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboBuku(){
        formPeminjaman.getCboBuku().removeAllItems();
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            formPeminjaman.getCboBuku().
                    addItem(buku.getKodeBuku());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp( formPeminjaman.getCboNoBp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku( formPeminjaman.getCboBuku()
                .getSelectedItem().toString());
        peminjaman.setTgl_pinjam( formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTgl_kembali( formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
                    for(Anggota anggota:listAnggota){
                        if(peminjaman.getNobp()==anggota.getNobp()){
                            formPeminjaman.getCboNoBp()
                                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                            break;
                        }
                    }
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTgl_pinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTgl_kembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp( formPeminjaman.getCboNoBp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku( formPeminjaman.getCboBuku()
                .getSelectedItem().toString());
        peminjaman.setTgl_pinjam( formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTgl_kembali( formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
         int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
         peminjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for (Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTgl_pinjam(),
                peminjaman.getTgl_kembali()
            };
            tabelModel.addRow(data);
        }
    }
}
    