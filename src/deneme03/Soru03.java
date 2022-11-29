package deneme03;

import java.util.Scanner;

public class Soru03 {
    /*
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
    hesaplayan kodu yazınız.

    Örnek Ekran Çıktısı
    Girilen sayı=4
    Kareler toplamı=14

     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayı giriniz");
        int sayı=scan.nextInt();
        int toplam=0;


            for (int i = 1; i <sayı ; i++) {

                toplam+=(i*i);


            }
        System.out.println("girilen sayı =" + sayı);
        System.out.println("kareler toplamı =" + toplam);


    }
}
