package deneme06;

import java.util.Scanner;

public class Soru03 {
    // Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
    //   ipucu:
    // Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

    public static void main(String[] args) {

        int gun=0;
        String ay="";
        burcHesapla(gun,ay);

/*
       Kova Burcu: 21 Ocak – 19 Şubat
        Balık Burcu: 20 Şubat – 20 Mart
        Koç Burcu: 21/03 – 20/04
        Boğa Burcu: 21 Nisan – 20 Mayıs
        İkizler Burcu: 21 Mayıs – 21 Haziran
        Yengeç Burcu: 22 Haziran – 22 Temmuz
        Aslan Burcu: 23 Temmuz – 23 Ağustos
        Başak Burcu: 24 Ağustos – 23 Eylül
        Terazi Burcu: 24 Eylül – 23 Ekim
        Akrep Burcu: 24 Ekim – 22 Kasım
        Yay Burcu: 23 Kasım – 21 Aralık
        Oğlak Burcu: 22 Aralık – 20 Ocak


 */
    }

    private static void burcHesapla(int gun, String ay) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Dogum Tarihinizin gununu");
        gun=scan.nextInt();
        System.out.println("lutfen dogdugunuz ayi giriniz");
        ay=scan.next();
        String burc="";

        switch (burc){
            case "kova": burc = gun >= 21 && ay.equals("ocak") ? "kova" : "oglak";
                break;
            case "balık": burc = gun >= 20 && ay.equals("subat") ? "balık" : "kova";
                break;
            case "koc": burc = gun >= 21 && ay.equals("mart") ? "koc" : "balık";
                break;
            case "boga": burc = gun >= 21 && ay.equals("nisan") ? "boga" : "koc";
                break;
            case "ikizler": burc = gun >= 21 && ay.equals("mayıs") ? "ikizler" : "boga";
                break;
            case "yengec": burc = gun >= 22 && ay.equals("haziran") ? "yengec" : "ikizler";
                break;
            case "aslan": burc = gun >= 23 && ay.equals("temmuz") ? "aslan" : "yengec";
                break;
            case "basak": burc = gun >= 24 && ay.equals("agustos") ? "basak" : "aslan";
                break;
            case "terazi": burc = gun >= 24 && ay.equals("eylul") ? "terazi" : "basak";
                break;
            case "akrep": burc = gun >= 24 && ay.equals("ekim") ? "akrep" : "terazi";
                break;
            case "yay": burc = gun >= 23 && ay.equals("kasım") ? "yay" : "akrep";
            break;
            case "oglak": burc = gun >= 21 && ay.equals("aralık") ? "oglak" : "yay";
                break;

        }
        System.out.println("sizin burcunuz :" + burc);
        
        
    }
}
