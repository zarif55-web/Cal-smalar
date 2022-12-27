package deneme06;

public class Soru05_Manipulation {
    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String str="   Java ogrenmek123 Cok guzel@      ";

        str=str.replaceAll("\\d",""); //sayı olanları cıkardık

        str=str.replaceAll(" ","*"); // space olan yerleri belirledik

        str=str.trim().substring(3,str.length()-7); // basta ve sonda * olan yerleri kestik

        str=str.replaceAll("\\W"," "); // * olan yerlee space koyduk

        str=str.replaceAll("C","c"); // buyuk C'yi kucuk c yaptık

        System.out.println("istenilen str : " + str);





    }
}
