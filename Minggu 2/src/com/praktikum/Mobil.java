package com.praktikum;

public class Mobil {

    String nama;
    int noPlat;
    public static void main(String[] args){
        Mobil Jenis = new Mobil();

        Jenis.nama = "Ferrari";
        Jenis.noPlat = 123;
        System.out.println("Nama mobil: " + Jenis.nama);
        System.out.println("Nomer Plat: " + Jenis.noPlat);
    }
}
