public class Rekening {
    private int saldo = 1000;
    private boolean blokir;
    public String tarikTunai(int nominal) {
        if (this.blokir) {
            return "Maaf rekening anda terblokir.";
        } else {
            this.saldo = this.saldo - nominal;
            return "Saldo: " + this.saldo;
        }
    }

    public int getSaldo(){
        return saldo;
    }
}
