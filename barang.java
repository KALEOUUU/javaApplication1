package javaapplication1;

import java.util.ArrayList;

public class barang implements user {
 private ArrayList<String> namaBarang = new ArrayList<String>();
 private ArrayList<Integer> stok = new ArrayList<Integer>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();

 public barang() {
 this.namaBarang.add("Cokelat enak");
 this.stok.add(15);
 this.harga.add(10000);
 this.namaBarang.add("Sabun Beri");
 this.stok.add(30);
 this.harga.add(5000);
 this.namaBarang.add("Odol SIWAK");
 this.stok.add(20);
 this.harga.add(15000);
 } 
 public int getJmlBarang(){
 return this.namaBarang.size();
 }
 public void setNamaBarang(String namaBarang ){
 this.namaBarang.add(namaBarang);
 }
 public String getNamaBarang(int idBarang){
 return this.namaBarang.get(idBarang);
 }

 public void setStok(int stok ){
 this.stok.add(stok);
 }
 public int getStok(int idBarang){
 return this.stok.get(idBarang);
 }
 public void editStok(int idBarang, int stok){
 this.stok.set(idBarang, stok);;
 }
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idBarang){
 return this.harga.get(idBarang);
 }
@Override
public void setNama(String nama) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setNama'");
}
@Override
public void setAlamat(String alamat) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setAlamat'");
}
@Override
public void setTelepon(String telepon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setTelepon'");
}
@Override
public String getNama(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNama'");
}
@Override
public String getAlamat(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAlamat'");
}
@Override
public String getTelepon(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTelepon'");
}
}
