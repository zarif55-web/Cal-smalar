package deneme06;

import java.util.Scanner;

public class Soru01 {

     /*  Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez
        tekrarlandığını kontrol edelim.
                Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak bunun
        ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

      */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen bir karekter giriniz");
        char krk=scan.next().charAt(0);

        int sayac=0;

        for (int i = 0; i <= isim.length()-1; i++) {

            if (isim.charAt(i)==krk){
                sayac++;
            }

        }

        System.out.print(krk + " "+ "sayısı " + sayac +" "+  "kere var");

    }
}
