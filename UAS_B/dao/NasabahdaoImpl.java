/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.dao;
import UAS_B.model.Nasabah;
import java.util.*;

/**
 *
 * @author Hp
 */
public class NasabahdaoImpl implements Nasabahdao {
    //1)tambahkan list
    List<Nasabah> data = new ArrayList <>();

    //2)tambahkan contructor
    public NasabahdaoImpl() {
       data.add(new Nasabah("104","Putri"));
       data.add(new Nasabah("105","Dini"));
       data.add(new Nasabah("106","Dea "));
    }

    @Override
    public Nasabah save(Nasabah nasabah) {
        data.add(nasabah);
        return nasabah;
    }
    
    @Override
    public Nasabah update(int index, Nasabah nasabah) {
        data.set(index , nasabah);
        return nasabah;
    }

    //3.jangan lua sesuaikan
    @Override
    public Nasabah delete(int index) {
        return data.remove(index);
    }

    
    @Override
    public Nasabah getNasabah(int index) {
        return data.get(index);
    }

    
    @Override
    public List<Nasabah> getAllNasabah() {
        return data;
    }

    /**
     *
     * @param nasabah
     * @param nasabahH
     * @return
     */
   
    
    

}
