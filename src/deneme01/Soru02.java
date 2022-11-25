package deneme01;

import java.util.Scanner;

public class Soru02 {

    // Kullanıcıdan pozitif bir sayı girmesini isteyin
    // girilen sayının asal olup olmadığını kontrol edin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayı giriniz");
        int sayı= scan.nextInt();

        for (int i = 2; i <sayı-1; i++) {

            if (sayı%i==0){
                System.out.println("girilen " + sayı + " " +"sayısı asal sayı degildir");
            }else {
                System.out.println("girilen " + sayı + " " +"sayısı asal sayıdır");
            }
            break;

        }



    }
}
