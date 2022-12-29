package deneme06;

import java.util.Scanner;

public class Soru06_Manipulation {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine().toUpperCase();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine().toUpperCase();
        
        if (isim.length()>soyisim.length()){
            System.out.println("isim daha uzun :" + isim);
        } else if (isim.length()<soyisim.length()) {
            System.out.println("soyisim daha uzun :"  + soyisim);
        }else System.out.println("uzunluklar eşit ne sana ne bana");


    }
}
