package deneme05;

import java.util.Scanner;

public class Soru06_MethodOlusturma {
    // Kullanicidan main method icinde
    // ayri ayri isim ve soyismini alin

    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println(isimSoyisim(isim,soyisim));



    }

    public static String isimSoyisim(String isim,String soyisim){

        String yeniIsim="";

        yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
                +" "+
                soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return yeniIsim;

    }

}
