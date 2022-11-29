package deneme03;

import java.util.Scanner;

public class Soru04 {

    // cm olarak verilen bir sayiyi,
    // metre ve kilometreye donusturen bir method yaziniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cm olarak bir uzunluk giriniz");
        double cm = scan.nextDouble();
        cmDonusum(cm);


    }


    public static void cmDonusum(double cm) {

        double m= cm/100;
        double km= cm/100000;

        System.out.println("girilen" + " " + cm +" "+ m+ " "+"metredir," + " "+ km + " " + "kilometredir");




    }
}