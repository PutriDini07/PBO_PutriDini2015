/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.Dao;

import java.util.ArrayList;
import java.util.List;
import putri.model.Pengembalian;
import putri.model.Peminjaman;

/**
 *
 * @author Hp
 */
public class PengembalianDaoImpl {
    private List<Pengembalian> data = new ArrayList();
    
    public void insert(Pengembalian kembali) {
        data.add(kembali);
    }
    
     public void update(int index, Pengembalian kembali) {
        data.set(index, kembali);
    }
     
    public Pengembalian delete(int index) {
        return data.remove(index);
    }
     
     public Pengembalian get(int index) {
        return data.get(index);
    }
    
     public List<Pengembalian> getAll(){
         return data;
     }
}
