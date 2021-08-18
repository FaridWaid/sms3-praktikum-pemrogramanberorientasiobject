public class Kucing {
    private String nama_kucing;
    private int tgl, bulan, tahun;
    public static void main(String[] args){
        Kucing Kucing1 = new Kucing();
        Kucing1.kucingku("Happy", 26, 8, 2015);
        Kucing1.display();
        Kucing1.umur_kucingku(2015);

    }

    public void kucingku(String nama_kucing, int tgl, int bulan, int tahun){
        this.nama_kucing = nama_kucing;
        this.tgl = tgl;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public void umur_kucingku(int tahun){
        this.tahun = tahun;
        int umur = 2020 - this.tahun;
        System.out.println("Umur Kucing = " + umur + " tahun");
    }

    public void display(){
        System.out.println("Nama kucing = " + this.nama_kucing);
        System.out.println("Tanggal Lahir = " + this.tgl + ", Bulan = " + this.bulan + ", Tahun = " + this.tahun);
    }

}
