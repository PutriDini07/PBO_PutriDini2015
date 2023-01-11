/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.controller;
import UAS_B.dao.NasabahdaoImpl;
import UAS_B.model.Nasabah;
import UAS_B.view.FormNasabah;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import UAS_B.dao.Nasabahdao;

/**
 *
 * @author Hp
 */
public class NasabahController {
    //1)buat ini
    private FormNasabah formNasabah;// form
    private Nasabahdao nasabahDao;// dao
    private Nasabah nasabah;//model
    
    //2)Buat contructor
    public NasabahController(FormNasabah formNasabah){
        this.formNasabah = formNasabah;
        //sesuaikan dg di atas ok
        nasabahDao = new NasabahdaoImpl();
    }
    
    public void bersihForm(){
        formNasabah.getTxtKodeNasabah().setText("");
        formNasabah.getTxtNamaNasabah().setText("");
        
    }
    
    public void save(){
        nasabah = new Nasabah();
        nasabah.setKodeNasabah(formNasabah.getTxtKodeNasabah().getText());
        nasabah.setNamaNasabah(formNasabah.getTxtNamaNasabah().getText());
        nasabahDao.save(nasabah);
        JOptionPane.showMessageDialog(formNasabah, "Entri Data OK");
    }
    ///==================================
    
     public void getNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabah = nasabahDao.getNasabah(index);
        if (nasabah != null){
            formNasabah.getTxtKodeNasabah().setText(nasabah.getKodeNasabah());
            formNasabah.getTxtNamaNasabah().setText(nasabah.getNamaNasabah());

            
        }
    }
    
    public void updateNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabah.setKodeNasabah(formNasabah.getTxtKodeNasabah().getText());
        nasabah.setNamaNasabah(formNasabah.getTxtNamaNasabah().getText());
        nasabahDao.update(index, nasabah);
        javax.swing.JOptionPane.showMessageDialog(formNasabah, "Update Ok");
    }
    //=========================
    public void deleteNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabahDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formNasabah, "Delete Ok");
    }
    
    public void tampilData(){
       DefaultTableModel tabelModel = 
               (DefaultTableModel) formNasabah.getTblNasabah().getModel();
       tabelModel.setRowCount(0);
       java.util.List<Nasabah> listNasabah = nasabahDao.getAllNasabah();
       for (Nasabah nasabah : listNasabah){
           Object[] data = {
               nasabah.getKodeNasabah(),
               nasabah.getNamaNasabah()       
           };
           tabelModel.addRow(data);
       }
    }
    
    
    
    
    
    
    
    
}
