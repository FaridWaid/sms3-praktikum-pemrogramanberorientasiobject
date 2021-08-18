public class Rekening {
    public int saldo;

    public int tarikTunai(int nilaiValue){
        return saldo-nilaiValue;
    }

    public static void main(String[] args){
        Rekening obj = new Rekening();
        obj.saldo = 30;
        obj.tarikTunai(10);
        var a = obj.tarikTunai(10);
        System.out.println(a);
    }
}
