/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.controller;

import UAS_B.dao.NasabahdaoImpl;
import UAS_B.Dao.PinjamanDaoImpl;
import UAS_B.model.Nasabah;
import UAS_B.model.Pinjaman;
import UAS_B.view.FormPinjaman;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import UAS_B.dao.Nasabahdao;
import UAS_B.Dao.PinjamanDao;

/**
 *
 * @author Hp
 */
public class PinjamanController {
    private FormPinjaman formPinjaman;
    private PinjamanDao pinjamanDao;
    private Pinjaman pinjaman;
    private Nasabahdao nasabahDao;

    public PinjamanController(FormPinjaman formPinjaman) {
        this.formPinjaman = formPinjaman; 
        pinjamanDao =(PinjamanDao) new PinjamanDaoImpl();
        nasabahDao = (Nasabahdao) new NasabahdaoImpl();
    }


    public void bersihForm(){
        
        formPinjaman.getTxtTanggalPinjaman().setText("");
        formPinjaman.getTxtLamaPinjaman().setText("");
        formPinjaman.getTxtJumlahPinjaman().setText("");

        
        
        
    }
    
    public void setCboKodeNasabah(){
        
        formPinjaman.getCboKodeNasabah().removeAllItems();
        List<Nasabah> list = nasabahDao.getAllNasabah();
        for (Nasabah nasabah : list){
            formPinjaman.getCboKodeNasabah().addItem(nasabah.getKodeNasabah()+"-"+nasabah.getNamaNasabah());  
        }  
    }
    
    public void savePinjaman(){
        pinjaman = new Pinjaman();
        pinjaman.setCboKodeNasabah(formPinjaman.getCboKodeNasabah().getSelectedItem().toString().split("-")[0]);
        //pinjaman.setCboKodebuku( formPinjaman.getCboBuku().getSelectedItem().toString());
        
        pinjaman.setTanggalPinjaman(formPinjaman.getTxtTanggalPinjaman().getText());
        pinjaman.setLamaPinjaman(formPinjaman.getTxtLamaPinjaman().getText());
        pinjaman.setJumlahPinjaman(formPinjaman.getTxtJumlahPinjaman().getText());

        pinjamanDao.save(pinjaman);
        javax.swing.JOptionPane.showMessageDialog(formPinjaman,"Entri Ok");
    }
    
    public void getPinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjaman = pinjamanDao.getPinjaman(index);
        if (pinjaman != null){
            List<Nasabah> listNasabah = nasabahDao.getAllNasabah();
            for (Nasabah nasabah:listNasabah){
                if (pinjaman.getCboKodeNasabah()== nasabah.getKodeNasabah()){
                    formPinjaman.getCboKodeNasabah().setSelectedItem(nasabah.getKodeNasabah()+"-" +nasabah.getNamaNasabah());
                    break;
                }
            }
            formPinjaman.getCboKodeNasabah().setSelectedItem(pinjaman.getCboKodeNasabah());
            formPinjaman.getTxtTanggalPinjaman().setText(pinjaman.getTanggalPinjaman());
            formPinjaman.getTxtLamaPinjaman().setText(pinjaman.getLamaPinjaman());
            formPinjaman.getTxtJumlahPinjaman().setText(pinjaman.getJumlahPinjaman());

        }
    }
    
    public void updatePinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjaman = pinjamanDao.getPinjaman(index);
        pinjaman.setCboKodeNasabah(formPinjaman.getCboKodeNasabah().getSelectedItem().toString().split("-")[0]);
        //pinjaman.setCboKodebuku( formPinjaman.getCboBuku().getSelectedItem().toString());
        
        pinjaman.setTanggalPinjaman(formPinjaman.getTxtTanggalPinjaman().getText());
        pinjaman.setLamaPinjaman(formPinjaman.getTxtLamaPinjaman().getText());
        pinjaman.setJumlahPinjaman(formPinjaman.getTxtJumlahPinjaman().getText());

        pinjamanDao.update(index,pinjaman);
        javax.swing.JOptionPane.showMessageDialog(formPinjaman,"Update Ok");
    }
    
    public void deletePinjaman(){
         int index = formPinjaman.getTblPinjaman().getSelectedRow();
         pinjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPinjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPinjaman.getTblPinjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pinjaman> list = pinjamanDao.getAllPinjaman();
        for (Pinjaman pinjaman : list){
            Object[] data = {
                pinjaman.getCboKodeNasabah(),
                pinjaman.getTanggalPinjaman(),
                pinjaman.getJumlahPinjaman(),
                pinjaman.getLamaPinjaman(),
                pinjaman.getBungaPinjaman(),
                pinjaman.getAngsuranPokok(),
                pinjaman.getAngsuranPerbulan(),
                pinjaman.getTotal()
            };
            tabelModel.addRow(data);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
