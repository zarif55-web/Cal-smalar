package deneme01;

import java.util.Scanner;

public class Soru01 {

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("lutfen bir harf yazınız");
        char harf= scan.next().toLowerCase().charAt(0);

        int sayac=0;

        for (int i =0; i <=cumle.length()-1; i++) {

            if (cumle.charAt(i)==harf){
                sayac++;

            }

        }
        System.out.println("aradığınız" +" "+ harf + " "+"harfi" +" "+ sayac +" "+ "kere vardır");





    }
}
