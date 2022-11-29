package deneme02;

import java.util.Scanner;

public class Soru04Scanner {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz");
        String ad=scan.nextLine();

        System.out.println("lutfen memleketinizi giriniz");
        String mmlkt=scan.nextLine();

        System.out.println("lutfen yasadıgınız yeri giriniz");
        String knm=scan.nextLine();

        System.out.println("lutfen yasınızı giriniz");
        int yas=scan.nextInt();

        System.out.println("lutfen boyunuzu girniz");
        double boy=scan.nextDouble();

        System.out.println("yasadıgınız yeri seviyor musunuz");
        boolean sev=scan.hasNext();
        sev=true;


        System.out.println("************************");
        System.out.println("adınız :" + ad);
        System.out.println("memleketinz :" + mmlkt);
        System.out.println("yasadıgınız yer :" + knm);
        System.out.println("yasınız :"+ yas);
        System.out.println("boyunuz :"+ boy);
        System.out.println("yasadıgım yeri seviyorum :"+ sev);




    }
}
