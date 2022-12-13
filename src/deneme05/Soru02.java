package deneme05;

public class Soru02 {
    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */
  public static void main(String[] args) {

       String str1= "$13.99";
       String str2= "$10.55";

     String yeniStr1=str1.replaceAll("\\D","");
     String yeniStr2=str2.replaceAll("\\D", "");


     double toplam= Double.parseDouble(yeniStr1) + Double.parseDouble(yeniStr2);

      System.out.println("$" + toplam);


  }
}
