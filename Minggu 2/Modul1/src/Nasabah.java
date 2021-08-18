public class Nasabah {
    String Nama, Alamat;
    int NoTelepon, Rekening;


    public static void main(String[] args){
        Nasabah identitasNasabah = new Nasabah();
        Rekening rekeningNasabah = new Rekening();
        identitasNasabah.Nama = "Achmad Farid Alfa Waid";
        identitasNasabah.Alamat = "MliripRowo";
        identitasNasabah.NoTelepon = 123;
        rekeningNasabah.Saldo = 250000;

        System.out.println("Nama Nasabah 1: " + identitasNasabah.Nama);
        System.out.println("Alamat Nasabah 1: " + identitasNasabah.Alamat);
        System.out.println("Nomer Telepon Nasabah 1: " + identitasNasabah.NoTelepon);
        System.out.println("Saldo Nasabah 1: " + rekeningNasabah.Saldo);

        System.out.print("\n");

        identitasNasabah.Nama = "Ilma Dina Nur Rosidah";
        identitasNasabah.Alamat = "MliripRowo";
        identitasNasabah.NoTelepon = 321;
        rekeningNasabah.Saldo = 200000;

        System.out.println("Nama Nasabah 2: " + identitasNasabah.Nama);
        System.out.println("Alamat Nasabah 2: " + identitasNasabah.Alamat);
        System.out.println("Nomer Telepon Nasabah 2: " + identitasNasabah.NoTelepon);
        System.out.println("Saldo Nasabah 2: " + rekeningNasabah.Saldo);
    }
}
