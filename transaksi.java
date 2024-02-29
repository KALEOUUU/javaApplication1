package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

public class transaksi {
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();

    public transaksi() {
        this.idMember.add(0);
        this.idBarang.add(0);
        this.banyak.add(2);
        this.idMember.add(0);
        this.idBarang.add(1);
        this.banyak.add(3);
        this.idMember.add(1);
        this.idBarang.add(0);
        this.banyak.add(1);
        this.idMember.add(1);
        this.idBarang.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(member member, transaksi transaksi, barang barang) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan belanja");
        System.out.println("Masukkan ID Member");
        int idMember = myObj.nextInt();
        System.out.println("Selamat datang " + member.getNama(idMember));
        ArrayList<Integer> idBarangInput = new ArrayList<Integer>();
        ArrayList<Integer> banyakInput = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode barang :");
            temp = myObj.nextInt();
            if (temp != 99) {
                idBarangInput.add(temp);
                System.out.print(barang.getNamaBarang(idBarangInput.get(i)) + " sebanyak : ");
                banyakInput.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi belanja " + member.getNama(idMember) + " sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

        int total = 0;
        int x = idBarangInput.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyakInput.get(j) * barang.getHarga(idBarangInput.get(j));
            total += jumlah;
            System.out.println(barang.getNamaBarang(idBarangInput.get(j)) + "\t" +
                    idBarangInput.get(j) + "\t" +
                    barang.getHarga(idBarangInput.get(j)) + "\t" +
                    jumlah);
            setTransaksi(barang, idMember, idBarangInput.get(j), banyakInput.get(j));
        }

        System.out.println("Total Belanja : " + total);
        member.editSaldo(idMember, member.getSaldo(idMember) - total);
    }

    public void setTransaksi(barang barang, int idMember, int idBarang, int banyaknya) {
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya);
        barang.editStok(idBarang, barang.getStok(idBarang) - banyaknya);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getJmlTransaksi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJmlTransaksi'");
    }

    public int getBanyaknya(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBanyaknya'");
    }
}