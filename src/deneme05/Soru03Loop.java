package deneme05;

import java.util.Scanner;

public class Soru03Loop {
    /*  Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni
        bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        Loopun içerisinde StringM methodlarından  yararlanalım!

     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String kelime="";
        int bayrak=0;

        while (kelime.length()<5){
            System.out.println("lutfen bir kelime giriniz");
            kelime=scan.nextLine();
            bayrak++;
        }if (kelime.length()>=5){
            kelime=kelime.substring(kelime.length()-3);
            System.out.print(kelime.repeat(2));

        }




    }
}
