/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.Dao;

import java.util.ArrayList;
import java.util.List;
import putri.model.Peminjaman;

/**
 *
 * @author Hp
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("1111","B001","01 Jan 2023","05 Feb 2023"));
        data.add(new Peminjaman("2042","B002","02 Feb 2023","06 Mart 2023"));
        data.add(new Peminjaman("2015","B003","03 Mart 2023","07 Apr 2023"));
    }

    @Override
    public Peminjaman save(Peminjaman peminjaman) {
        data.add(peminjaman);
        return peminjaman;
    }

    public Peminjaman update(int index, Peminjaman peminjaman) {
        data.set(index, peminjaman);
        return peminjaman;
    }

    public Peminjaman delete(int index) {
        return data.remove(index);
    }

    public Peminjaman getPeminjaman(int index) {
        return data.get(index);
    }

    public List<Peminjaman> getAllPeminjaman() {
        return data;
    }
}
