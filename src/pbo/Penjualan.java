/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

public class Penjualan {
    
    private String id;
    private String nama;
    private String member;
    private String barang;
    int totalHarga;

        
public  Penjualan (String id, String nama, String member, String barang, int totalHarga) {
    this.id = id;
    this.nama = nama;
    this.member = member;
    this.barang = barang;
    this.totalHarga = totalHarga;
}

public void setId(String id) {
    this.id = id;
}
public void setNama(String nama) {
    this.nama = nama;
}
public void setMember(String member) {
    this.member = member;
}
public void setBarang(String barang) {
    this.barang = barang;
}
public void setTotalHarga(int totalHarga) {
    this.totalHarga = totalHarga;
}

public String getId() {
    return id;
}
public String getNama() {
    return nama;
}
public String getMember() {
    return member;
}
public String getBarang() {
    return barang;
}
public int getTotalHarga() {
    return totalHarga;
}

public String displayInfo() {
    return "======== HASIL \"========"+
           "\nHarga Meja  : Rp50000"+
           "\nHarga Kursi : Rp30000"+
           "\n========================"+
           "\nID: "+getId()+
           "\nNama: "+getNama();
}

public String displayInfo1(String alamat){
    return displayInfo() + "\nAlamat: "+alamat;
}
}