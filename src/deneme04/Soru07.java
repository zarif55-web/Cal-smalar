package deneme04;


public class Soru07 {
    /*

    Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
    hesaplamak ve yazdırmak için bir program oluşturalım
    Eğer verilen tamsayıların veya toplamın 9'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    Ipucu:  IF/Else kullanabilirsiniz.
    Örnek:
    İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme

     */

    public static void main(String[] args) {

        long sayı1= 9999999;
        long sayı2= 9999999;

        long toplam= sayı1+sayı2;


        String basamakSayı=""+ toplam;
        String basamakSayı1=""+ sayı1;
        String basamakSayı2=""+ sayı2;

        if (basamakSayı.length()>9 || basamakSayı1.length()>9 || basamakSayı2.length()>9){
            System.out.println("fazla yukleme");
        }else {
            System.out.println(sayı1+sayı2);
        }

/*
        long sayi1=999999999;
        long sayi2=123456789;
        long toplam=sayi1+sayi2;
        String sayi1str=""+ sayi1;
        String sayi2str=""+ sayi1;
        String toplamstr=""+ sayi1;
        if (sayi1str.length()>10 && sayi2str.length()>10 && toplamstr.length()>10 ){
            System.out.println("fazla yukleme");
        }else System.out.println(toplam);



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  2 adet tam sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        //int sayi1 = 100000000;
        //int sayi2 = 999999999;

        double toplam=sayi2+sayi1;
        if (toplam>9999999999.||sayi2>9999999999.||sayi1>9999999999.) System.out.println("Fazla yuklenme");
        else if (sayi2>=0&&sayi1>=0)System.out.println("toplam:"+toplam);
        else System.out.println("Gecersiz giriş");
*/
    }
}
