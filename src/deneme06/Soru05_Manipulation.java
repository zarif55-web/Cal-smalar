package deneme06;

public class Soru05_Manipulation {
    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String str="   Java ogrenmek123 Cok guzel@      ";

        str=str.replaceAll("\\d",""); // sayıları cıkardık

        str=str.replaceAll(" ","*"); // spclere * atadık

        str=str.substring(3,str.length()-6); // basta ve sonda bosluk kalmadı

        str=str.replaceAll("@",""); // sondaki @ gitti

        str=str.replaceAll("\\W", " "); // aradaki *'ları space yaptik

        str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();//buyuk C harfini kucuck c yaptik

        System.out.println(str);







    }
}
