/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.Dao;
import UAS_B.model.Pinjaman;
import java.util.*;
///relasi


/**
 *
 * @author Hp
 */
public class PinjamanDaoImpl implements PinjamanDao {
     List<Pinjaman> data = new ArrayList <>();

    public PinjamanDaoImpl() {
    }

    
    
    @Override
    public Pinjaman save(Pinjaman pinjaman) {
        data.add(pinjaman);
        return pinjaman; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pinjaman update(int index, Pinjaman pinjaman) {
        data.set(index , pinjaman);
        return pinjaman; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pinjaman delete(int index) {
        return data.remove(index); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pinjaman getPinjaman(int index) {
         return data.get(index);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pinjaman> getAllPinjaman() {
         return data; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
}
