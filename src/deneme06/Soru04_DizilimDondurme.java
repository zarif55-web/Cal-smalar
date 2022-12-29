package deneme06;

public class Soru04_DizilimDondurme {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
             * input      output
             * axyzm  ==   true
            * xyz    ==   true
            * x.yz   ==   false
            * xyaz   ==   false
     */

    public static void main(String[] args) {

        String str="AlixaYZ.bey";

        dizilimDondurme(str);

    }
    public  static String dizilimDondurme(String str){

        if (str.toLowerCase().contains("xyz")){
            System.out.println("xyz yanyana yazılmıstır sonuc TRUE");
        }else System.out.println("xyz diziliminin arsına kaynak yapılms FALSE");

        return str;
    }

}
