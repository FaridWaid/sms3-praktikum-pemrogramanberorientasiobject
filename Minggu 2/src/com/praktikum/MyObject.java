package com.praktikum;

public class MyObject {
    int nim;
    String nama;

    public static void main (String [] args){
        MyObject mahasiswa1 = new MyObject();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa1.nim = 73;
        mahasiswa1.nama = "Achmad Farid Alfa Waid";
        mahasiswa2.nama = "Natasya";
        System.out.println("nama: " + mahasiswa1.nama);
        System.out.println("nim: " + mahasiswa1.nim);
        System.out.println("Nama: " + mahasiswa2.nama);
    }
}
