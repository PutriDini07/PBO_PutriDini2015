/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import putri.model.Pengembalian;
import putri.Dao.PengembalianDaoImpl;
import putri.view.FormPengembalian;

/**
 *
 * @author Hp
 */
public class PengembalianController {
    FormPengembalian view;
    Pengembalian model;
    PengembalianDaoImpl dao;
    int index;
    
    public PengembalianController(FormPengembalian view) {
        this.view = view;
        dao = new PengembalianDaoImpl();
    }
    
    public void clearForm(){
        //view.getTxtIndex().setText("");
        view.getTxtKodeBuku().setText("");
        view.getTxtKodeAnggota().setText("");
        view.getTxtTglPinjam().setText("");
        view.getTxtTglKembali().setText("");
        view.getTxtTglDikembalikan().setText("");
        view.getTxtTerlambat().setText("");
        view.getTxtDenda().setText("");
    }
    
    public void insert(){
        model = new Pengembalian();
        model.setKodeAnggota(view.getTxtKodeAnggota().getText());
        model.setKodeBuku(view.getTxtKodeBuku().getText());
        model.setTgl_pinjam(view.getTxtTglPinjam().getText());
        model.setTgl_kembali(view.getTxtTglKembali().getText());
        model.setTgl_dikembalikan(view.getTxtTglDikembalikan().getText());
        model.setTerlambat(Integer.parseInt(view.getTxtTerlambat().getText()));
        model.setDenda(Integer.parseInt(view.getTxtDenda().getText()));
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Insert data ok");
    }
    
    public void update(){
        index = Integer.parseInt(view.getTxtIndex().getText());
        model.setKodeAnggota(view.getTxtKodeAnggota().getText());
        model.setKodeBuku(view.getTxtKodeBuku().getText());
        model.setTgl_pinjam(view.getTxtTglPinjam().getText());
        model.setTgl_kembali(view.getTxtTglKembali().getText());
        model.setTgl_dikembalikan(view.getTxtTglDikembalikan().getText());
        model.setTerlambat(Integer.parseInt(view.getTxtTerlambat().getText()));
        model.setDenda(Integer.parseInt(view.getTxtDenda().getText()));
        dao.update(index,model);
        JOptionPane.showMessageDialog(view, "update data ok");
    }
    
    public void delete(){
        index = view.getTabelKembali().getSelectedRow();
        //index = Integer.parseInt(view.getTxtIndex().getText());
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete data ok");
    }
    
    public void search(){
        index = Integer.parseInt(view.getTxtIndex().getText());
        model = dao.get(index);
        if(model!=null){
            view.getTxtKodeAnggota().setText(model.getKodeAnggota());
            view.getTxtKodeBuku().setText(model.getKodeBuku());
            view.getTxtTglPinjam().setText(model.getTgl_pinjam());
            view.getTxtTglKembali().setText(model.getTgl_kembali());
            view.getTxtTglDikembalikan().setText(model.getTgl_dikembalikan());
            view.getTxtTerlambat().setText(String.valueOf(model.getTerlambat()));
            view.getTxtDenda().setText(String.valueOf(model.getDenda()));
        }else{
            JOptionPane.showMessageDialog(view, "Data Tidak Ada");
        }
    }
    

    public void viewTable() {
     DefaultTableModel tabelModel =
                (DefaultTableModel) view.getTabelKembali().getModel();
        tabelModel.setRowCount(0);
        List<Pengembalian> bukuList = dao.getAll();
        for (Pengembalian kembali : bukuList) {
            Object[] data = {
                kembali.getKodeAnggota(),
                kembali.getKodeBuku(),
                kembali.getTgl_pinjam(),
                kembali.getTgl_kembali(),
                kembali.getTgl_dikembalikan(),
                kembali.getTerlambat(),
                kembali.getDenda()
            };
            tabelModel.addRow(data);
        }
    }
   
    
}
