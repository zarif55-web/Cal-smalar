package deneme07;

import java.util.Scanner;

public class Soru01_SayıTerseCevirme {
    public static void main(String[] args) {


         /*
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz
        */


        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int sayi=scan.nextInt();

        String tersSayi="";

        String sayiStr=""+sayi;


        for (int i = sayiStr.length()-1; i >=0 ; i--) {

            tersSayi+=sayiStr.charAt(i);

        }

        System.out.println("Girilen sayinin tersten yazilimi :" +tersSayi);

    }
}
