package deneme03;

import java.util.Scanner;

public class Soru {

    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen uc basamaklı bir sayı giriniz");
        int sayı=scan.nextInt();

        int birlerBasamagı=sayı%10;
        int onlarBasamagı=(sayı/10)%10;
        int yuzlerBasamagı=sayı/100;

        switch (sayı/100){
            case 1: System.out.print("yuz ");
                break;
            case 2: System.out.print("iki yuz ");
                break;
            case 3: System.out.print("uc yuz ");
                break;
            case 4: System.out.print("dort yuz ");
                break;
            case 5: System.out.print("bes yuz ");
                break;
            case 6: System.out.print("altı yuz ");
                break;
            case 7: System.out.print("yedi yuz ");
                break;
            case 8: System.out.print("sekiz yuz ");
                break;
            case 9: System.out.print("dokuz yuz ");
                break;
        }switch ((sayı/10)%10) {
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kırk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("altmıs ");
                break;
            case 7:
                System.out.print("yetmis ");
                break;
            case 8:
                System.out.print("seksen ");
                break;
            case 9:
                System.out.print("doksan ");
                break;
        }switch (sayı%10){
            case 1: System.out.print("bir");
                break;
            case 2: System.out.print("iki");
                break;
            case 3: System.out.print("üç");
                break;
            case 4: System.out.print("dort");
                break;
            case 5: System.out.print("bes");
                break;
            case 6: System.out.print("altı");
                break;
            case 7: System.out.print("yedi");
                break;
            case 8: System.out.print("sekiz");
                break;
            case 9: System.out.println("dokuz");
                break;
        }



    }
}
