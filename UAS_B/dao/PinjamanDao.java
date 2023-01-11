/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.Dao;
import UAS_B.model.Pinjaman;
import java.util.*;


/**
 *
 * @author Hp
 */
public interface PinjamanDao {
    Pinjaman save (Pinjaman pinjaman);
    Pinjaman update (int index,Pinjaman pinjaman);
    Pinjaman delete (int index);
    Pinjaman getPinjaman (int index);
    List <Pinjaman> getAllPinjaman ();
    
}
