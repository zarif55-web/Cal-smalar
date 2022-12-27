package deneme06;

import java.util.Scanner;

public class Soru07_Manipulation {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dusuncelerinizi yazınız");
        String dusunce=scan.nextLine();

        //hem bosluk var mı diye bakacagız, hem de bos mu diye bakacagız

        if (!dusunce.isBlank() && !dusunce.isEmpty()){
            System.out.println("kullanıcı duygularını bosluksuz anlatmıs");
        } else {
            System.out.println("kullanıcı duygularını guzel anlatmıs");
        }


    }
}
