package deneme02;

import java.util.Scanner;

public class Soru03Çevirme {

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("fahrenayt değeri giriniz");
        int fhr=scan.nextInt();

        System.out.println("santigrat derece :"+ (fhr-32)*5/9 );


    }
}
