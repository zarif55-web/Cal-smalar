package deneme04;

import java.util.Scanner;

public class Soru01İfStatement {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y/N giriniz: ");
        char krktr=scan.next().charAt(0);

        if (krktr=='y' || krktr=='Y'){
            System.out.println("YES");
        } else if (krktr=='n' || krktr=='N') {
            System.out.println("NO");
        }else {
            System.out.println("yanlıs karakter girdiniz");
        }


    }


}
