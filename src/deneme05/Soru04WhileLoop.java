package deneme05;

public class Soru04WhileLoop {
    // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

    public static void main(String[] args) {

        int sayı=10000001;

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int sayac=0;

        while (sayı!=0){
            birlerBasamagi=sayı%10;
            rakamlarToplami += birlerBasamagi;
            sayı/=10;
            sayac++;

        }

        System.out.println("rakamlar toplam :" + rakamlarToplami);

    }
}
