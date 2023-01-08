/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.Dao;

import putri.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class BukuDaoImpl implements BukuDao {

    List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("B001", "Mariposa", "Luluk HF", "Jakarta"));
        data.add(new Buku("B002", "Ilmu Sains", "Albert Enstein", "Germany"));
        data.add(new Buku("B003", "Sang kancil", "Bobo", "Bandung"));
    }

    @Override
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }

    public Buku delete(int index) {
        return data.remove(index);
    }

    public Buku getBuku(int index) {
        return data.get(index);
    }

    public List<Buku> getAllBuku() {
        return data;
    }
}
