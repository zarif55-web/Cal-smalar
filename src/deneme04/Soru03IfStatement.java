package deneme04;

import java.util.Scanner;

public class Soru03IfStatement {
    public static void main(String[] args) {

        /*
        Kullanici dan yas bilgisini alarak

        oy kullanma yasi :
        age >= 18  ==> oy kullanmaya uygun
        age >= 70  ==> uc kez oy kullanabilir
        70 > age >=50 ==> iki kez oy kullanabilir
        50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
        */

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen yasınızı giriniz : ");
        int yas =scan.nextInt();

        if (yas>=70) System.out.println("uc kez oy kullanabilirsiniz");

        else if (yas>=50 && yas<70) System.out.println("iki kez oy kullanabilirsiniz");

        else if (yas>=18 && yas<50) System.out.println("bir kez oy kullanabilirsiniz");

        else if (yas>=18) System.out.println("yasınız oy kullanmaya uygun");

        else System.out.println("oy kullanamazsınız");


    }
}
