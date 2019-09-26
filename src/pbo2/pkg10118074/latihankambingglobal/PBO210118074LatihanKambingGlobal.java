/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihankambingglobal;

/**
 *
 * @author 
 * NAMA : FikriMaulana
 * KELAS : IF-2
 * NIM : 10118074
 */
public class PBO210118074LatihanKambingGlobal {

        //VariBEL untuk menampilkan jumlah kambing
        int jumlahKambing = 88;
        
        //Method untuk menampilkan jumlah kambing
 public void getJumlahKambing() {
            System.out.println("Jumlah kambing : " + jumlahKambing);
            
}
 
public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah:" + jumlahKambing);
}

public static void main(String[] args){
           PBO210118074LatihanKambingGlobal kambingSusu = new PBO210118074LatihanKambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertsms x brtjslsn
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilakan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
}

}

