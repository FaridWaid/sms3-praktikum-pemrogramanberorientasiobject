public class Taxi {
    private String nama_penumpang, nama_driver, tgl;
    private int jarak_tempuh;
    public static void main(String[]args){
        Taxi order = new Taxi();
        order.orderTaxi("Achmad Farid Alfa Waid", "Ilma Dina Nur Rosidah", "27-11-2020", 12);
        order.display();
        order.harga();
    }

    public void orderTaxi(String nama_penumpang, String nama_driver, String tgl, int jarak_tempuh){
        this.nama_penumpang = nama_penumpang;
        this.nama_driver = nama_driver;
        this.tgl = tgl;
        this.jarak_tempuh = jarak_tempuh;
    }

    public void harga(){
        int kalkulasi;
        if (this.jarak_tempuh <= 10){
            this.jarak_tempuh = this.jarak_tempuh * 3500;
            kalkulasi = 5000 + this.jarak_tempuh;
            System.out.println("Harga yang harus dibayarkan sebesar = " + kalkulasi);
        } else if (this.jarak_tempuh <= 20){
            this.jarak_tempuh = this.jarak_tempuh * 2500;
            kalkulasi = 5000 + 35000 + this.jarak_tempuh;
            System.out.println("Harga yang harus dibayarkan sebesar = " + kalkulasi);
        } else if (this.jarak_tempuh>20){
            this.jarak_tempuh = this.jarak_tempuh * 2000;
            kalkulasi = 5000 + 60000 + this.jarak_tempuh;
            System.out.println("Harga yang harus dibayarkan sebesar = " + kalkulasi);
        }
    }

    public void display(){
        System.out.println("Nama Penumpang: " + this.nama_penumpang);
        System.out.println("Nama Driver: " + this.nama_driver);
        System.out.println("Tanggal Pemesanan: " + this.tgl);
        System.out.println("Jarak Tempuh: " + this.jarak_tempuh);
    }

}
