package deneme04;

public class Soru04Ternary {

     /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
     public static void main(String[] args) {


         char f1='B';

         String sonuc= (f1=='A') ? "Gayet basarılı" : (f1=='B') ? "Basarılı" : (f1=='C') ? "Ha gayret" : "Digerleri";

         System.out.println( "sonuc: " + sonuc);



















     }
}
