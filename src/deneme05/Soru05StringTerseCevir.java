package deneme05;

public class Soru05StringTerseCevir {

    //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
    // bu halini bize donduren bir method olusturun.

    public static void main(String[] args) {
        String cumle = "Java heç de kolay değilmis";
        String yeniCumle=tersDondürme(cumle);
        System.out.println(yeniCumle);

    }

    public static String tersDondürme(String cumle){

        String yeniCumle="";


        for (int i = cumle.length()-1; i >=0 ; i--) {
            yeniCumle+=cumle.substring(i,i+1);

        }
        return yeniCumle;
        }


    }

