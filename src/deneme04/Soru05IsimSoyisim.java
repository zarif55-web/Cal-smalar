package deneme04;

import java.util.Scanner;

public class Soru05IsimSoyisim {

     /*Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
    Ad ve soyadın baş harfleri büyük olmalıdır
    Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
    Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
    Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
     Giriş :
    > Gandalf Grey 563245879632
     Çıktı :
    > İsim : G****** G***
    > CCN : **** **** 9632

      */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz");
        String ad= scan.nextLine();
        System.out.println("lutfen soyadınızı giriniz");
        String soyad= scan.nextLine();
        System.out.println("lutfen kredi kart no giriniz");
        String kartNo= scan.nextLine();



        if (!(kartNo.length()==16)){
            System.out.println("gecersiz kredi kart numarası");
        } else if (kartNo.length()==16) {
            System.out.println("kart no :" +"**** **** **** "+ kartNo.substring(12));
        }

        System.out.println("isim :" + ad.toUpperCase().substring(0,1) +
                           ad.substring(1).replaceAll("\\w", "*")
                           + " " +
                           soyad.toUpperCase().substring(0,1) +
                           soyad.substring(1).replaceAll("\\w","*"));


    }
}
