package deneme07;

import java.util.Scanner;

public class Soru02_Stirng {
    /*          Kullanicidan alinan bir String alin, String'in uzunlugu cift sayi ise tam ortasina
             :) ekleyin, String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
              yazdirin.

 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yazin");
        String kelime=scan.nextLine();
        int orta=kelime.length()/2;

        if (kelime.length()%2==0){
            System.out.println(kelime.substring(0,orta)+":)"+kelime.substring(orta));
        }else {
            System.out.println(kelime.substring(0,orta)+":("+ kelime.substring(orta+1));
        }
    }
}
