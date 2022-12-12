package deneme04;

public class Soru07 {
    /*

    Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
    hesaplamak ve yazdırmak için bir program oluşturalım
    Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    Ipucu:  IF/Else kullanabilirsiniz.
    Örnek:
    İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme

     */

    public static void main(String[] args) {

        int sayı1= 94;
        long sayı2= 4746;

        String toplam="" +sayı1+sayı2;

        int basamakSayı=10;

        if (toplam.length()>=basamakSayı){
            System.out.println("fazla yukleme");
        }else {
            System.out.println("toplam :" + sayı1+sayı2);
        }




    }
}
