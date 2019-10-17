/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan31_perkenalanmahasiswa;

/**
 *
 * @author 
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan31_perkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.setNIM("10116584");
        mahasiswa1.setNama("Muhammad Syahrun Dalu");
        mahasiswa1.perkenalkanDiri();
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.setNIM("10116571");
        mahasiswa2.setNama("Franky michael");
        mahasiswa2.perkenalkanDiri();
   
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.setNIM("10116761");
        mahasiswa3.setNama("Fairus Hadi Ad day");
            mahasiswa3.perkenalkanDiri();
    }
    
}
