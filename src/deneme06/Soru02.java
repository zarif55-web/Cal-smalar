package deneme06;

import java.util.Scanner;

public class Soru02 {
    //Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan
    // bir method yazalım.
    // Kullanıcıya hızını ve kilometreyi soralım,
    // bunu methodla dondurun ve bize varış süremizi hesaplasın
    // İpucu:
    // yol=Hız*zaman

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ortalama hızınızı giriniz");
        int hız=scan.nextInt();
        System.out.println("lutfen gidilecek yolu km olarak diriniz");
        double yol=scan.nextDouble();

        System.out.println("zaman =" + zaman(yol, hız));


    }
    public static double zaman(double yol, int hız){

        double zaman=yol/hız;

        return zaman;
    }

}
