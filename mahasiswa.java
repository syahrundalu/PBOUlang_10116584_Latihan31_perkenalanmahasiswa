/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan31_perkenalanmahasiswa;

/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class mahasiswa {
    public String Nim, Nama;

    public void setNIM(String Nim) {
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is "+Nim);
        System.out.println("My Name is "+Nama);
        System.out.println("");
        
    }
    
}
