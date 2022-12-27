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

        String str="xYzad";

        System.out.println(dizilimDondurme(str));


    }
    public static String dizilimDondurme(String str){

        if (str.toLowerCase().contains("xyz")){
            System.out.println("gilen ifade xyz dizilimi içeriyor, bu yuzden TRUE");
        }else System.out.println("gilen ifade xyz dizilimi içermiyor, bu yuzden FALSE");

        return str;
    }
}
