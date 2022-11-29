package deneme04;

import java.util.Scanner;

public class Soru02EnBuyukSayı {

    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 tane sayı giriniz");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();
        double sayı3=scan.nextDouble();
        double sayı4=scan.nextDouble();
        double sayı5=scan.nextDouble();


        if (sayı1>sayı2 && sayı1>sayı3 && sayı1>sayı4 && sayı1>sayı5) {
            System.out.println("En buyuk sayı :" + sayı1);
        }else if (sayı2>sayı1 && sayı2>sayı3 && sayı2>sayı4 && sayı2>sayı5) {
            System.out.println("En buyuk sayı :" + sayı2);
        }else if (sayı3>sayı2 && sayı3>sayı1 && sayı3>sayı4 && sayı3>sayı5) {
            System.out.println("En buyuk sayı :" + sayı3);
        }else if (sayı4>sayı3 && sayı4>sayı2 && sayı4>sayı1 && sayı4>sayı5) {
            System.out.println("En buyuk sayı :" + sayı4);
        }else if (sayı5>sayı4 && sayı5>sayı3 && sayı5>sayı2 && sayı5>sayı1) {
            System.out.println("En buyuk sayı :" + sayı5);
        }else {
            System.out.println("her sey yolunda");
        }
    }
}
