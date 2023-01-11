/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.dao;

import UAS_B.model.Nasabah;
import java.util.List;
/**
 *
 * @author Hp
 */
public interface Nasabahdao {
    Nasabah save (Nasabah nasabah);
    Nasabah update (int index,Nasabah nasabah);
    Nasabah delete (int delete);
    Nasabah getNasabah (int index);
    List <Nasabah> getAllNasabah();
    
    
}
